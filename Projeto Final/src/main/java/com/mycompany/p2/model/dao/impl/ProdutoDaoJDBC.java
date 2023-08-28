package com.mycompany.p2.model.dao.impl;

import com.mycompany.p2.db.DB;
import com.mycompany.p2.db.DbException;
import com.mycompany.p2.model.dao.ProdutoDao;
import com.mycompany.p2.model.entities.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDaoJDBC implements ProdutoDao {

    private Connection conn;
    public ProdutoDaoJDBC(Connection conn) {
        this.conn = conn;
    }


    @Override
    public void insert(Produto obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("INSERT INTO produto (prod_anofabricacao, prod_nome, categoria_id, prod_preco) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, obj.getProd_quantidade());
            st.setString(2, obj.getProd_nome());
            st.setInt(3, obj.getCategoria_id());
            st.setFloat(4, obj.getProd_preco());
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setProd_id(id);
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
            st = conn.prepareStatement("DELETE FROM produto WHERE prod_id = ?");
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
    public List<Produto> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM produto ORDER BY produto.prod_id");

            rs = st.executeQuery();
            List<Produto> list = new ArrayList<>();

            while (rs.next()) {
                Produto cl = new Produto ();
                cl.setProd_id(rs.getInt("prod_id"));
                cl.setProd_quantidade(rs.getInt("prod_anofabricacao"));
                cl.setProd_nome(rs.getString("prod_nome"));
                cl.setCategoria_id(rs.getInt("categoria_id"));
                cl.setProd_preco(rs.getFloat("prod_preco"));
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
