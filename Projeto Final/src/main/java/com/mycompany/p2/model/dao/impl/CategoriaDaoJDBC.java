package com.mycompany.p2.model.dao.impl;

import com.mycompany.p2.db.DB;
import com.mycompany.p2.db.DbException;
import com.mycompany.p2.model.dao.CategoriaDao;
import com.mycompany.p2.model.entities.Categoria;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaDaoJDBC implements CategoriaDao {

    private Connection conn;
    public CategoriaDaoJDBC(Connection conn) {
        this.conn = conn;
    }


    @Override
    public void insert(Categoria obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("INSERT INTO categoria (categoria_nome)VALUES (?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getCategoria_nome());


            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setCategoria_id(id);
                }
            }
            else {
                throw new DbException("Unexpected error! No rows affected!");
            }
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("DELETE FROM categoria WHERE categoria_id = ?");
            st.setInt(1, id);

            int rows = st.executeUpdate();
            
            if (rows == 0) {
                JOptionPane.showMessageDialog(null, "O ID não existe", "Erro", 1);
            }
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public List<Categoria> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM categoria ORDER BY categoria.categoria_id");

            rs = st.executeQuery();
            List<Categoria> list = new ArrayList<>();

            while (rs.next()) {
                Categoria cl = new Categoria();
                cl.setCategoria_id(rs.getInt("categoria_id"));
                cl.setCategoria_nome(rs.getString("categoria_nome"));
                list.add(cl);
            }
            return list;
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
}
