package com.mycompany.p2.model.dao.impl;

import com.mycompany.p2.db.DB;
import com.mycompany.p2.db.DbException;
import com.mycompany.p2.model.dao.PedidoDao;
import com.mycompany.p2.model.entities.Pedido;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PedidoDaoJDBC implements PedidoDao {

    private Connection conn;
    public PedidoDaoJDBC(Connection conn) {
        this.conn = conn;
    }


    @Override
    public void insert(Pedido obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("INSERT INTO pedido (ped_anofabricacao, prod_id, transp_id, client_id) VALUES (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, obj.getPed_quantidade());
            st.setInt(2, obj.getProd_id());
            st.setInt(3, obj.getTransp_id());
            st.setInt(4, obj.getClient_id());

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setPed_id(id);
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
    public void updatar(Pedido obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("BEGIN; DELETE FROM pedido WHERE ped_id = ?; INSERT INTO pedido (ped_anofabricacao, prod_id, transp_id, client_id) VALUES (?, ?, ?, ?); COMMIT;", Statement.NO_GENERATED_KEYS);
            st.setInt(1, obj.getPed_id());
            st.setInt(2, obj.getPed_quantidade());
            st.setInt(3, obj.getProd_id());
            st.setInt(4, obj.getTransp_id());
            st.setInt(5, obj.getClient_id());
            
            int rowsAffected = st.executeUpdate() + 1;

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setPed_id(id);
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
            st = conn.prepareStatement("DELETE FROM pedido WHERE ped_id = ?");
            st.setInt(1, id);

            int rows = st.executeUpdate();
            
            if (rows == 0) {
                JOptionPane.showMessageDialog(null, "O ID não existe", "Erro", 1);
            };
        }
        catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
        finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public List<Pedido> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM pedido ORDER BY pedido.ped_id");

            rs = st.executeQuery();
            List<Pedido> list = new ArrayList<>();

            while (rs.next()) {
                Pedido cl = new Pedido();
                cl.setPed_id(rs.getInt("ped_id"));
                cl.setPed_quantidade(rs.getInt("ped_anofabricacao"));
                cl.setProd_id(rs.getInt("prod_id"));
                cl.setTransp_id(rs.getInt("transp_id"));
                cl.setClient_id(rs.getInt("client_id"));
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
