package com.mycompany.p2.model.dao.impl;

import com.mycompany.p2.db.DB;
import com.mycompany.p2.db.DbException;
import com.mycompany.p2.model.dao.BackupPedidoDao;
import com.mycompany.p2.model.entities.BackupPedido;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BackupPedidoDaoJDBC implements BackupPedidoDao {

    private Connection conn;
    public BackupPedidoDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<BackupPedido> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM backupedido ORDER BY backupedido.ped_id");

            rs = st.executeQuery();
            List<BackupPedido> list = new ArrayList<>();

            while (rs.next()) {
                BackupPedido cl = new BackupPedido();
                cl.setPed_id(rs.getInt("ped_id"));
                cl.setPed_qnt(rs.getInt("ped_qnt"));
                cl.setProd_id(rs.getInt("prod_id"));
                cl.setTransp_id(rs.getInt("transp_id"));
                cl.setClient_id(rs.getInt("client_id"));
                cl.setData_exclu(rs.getTimestamp("data_exclu"));
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
