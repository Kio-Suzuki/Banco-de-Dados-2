package com.mycompany.p2.model.dao.impl;

import com.mycompany.p2.db.DB;
import com.mycompany.p2.db.DbException;
import com.mycompany.p2.model.dao.TransportadoraDao;
import com.mycompany.p2.model.entities.Transportadora;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TransportadoraDaoJDBC implements TransportadoraDao {

    private Connection conn;
    public TransportadoraDaoJDBC(Connection conn) {
        this.conn = conn;
    }


    @Override
    public void insert(Transportadora obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("INSERT INTO transportadora (transp_nome, transp_cnpj, transp_telefone, transp_email) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getTransp_nome());
            st.setString(2, obj.getTransp_cnpj());
            st.setString(3, obj.getTransp_telefone());
            st.setString(4, obj.getTransp_email());
            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setTransp_id(id);
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
            st = conn.prepareStatement("DELETE FROM transportadora  WHERE transp_id = ?");
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
    public List<Transportadora> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM transportadora ORDER BY transportadora.transp_id");

            rs = st.executeQuery();
            List<Transportadora> list = new ArrayList<>();

            while (rs.next()) {
                Transportadora cl = new Transportadora ();
                cl.setTransp_id(rs.getInt("transp_id"));
                cl.setTransp_nome(rs.getString("transp_nome"));
                cl.setTransp_cnpj(rs.getString("transp_cnpj"));
                cl.setTransp_telefone(rs.getString("transp_telefone"));
                cl.setTransp_email(rs.getString("transp_email"));
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
