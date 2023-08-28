package com.mycompany.p2.model.dao.impl;

import com.mycompany.p2.db.DB;
import com.mycompany.p2.db.DbException;
import com.mycompany.p2.model.dao.RelatorioGeralDao;
import com.mycompany.p2.model.entities.RelatorioGeral;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RelatorioGeralDaoJDBC implements RelatorioGeralDao {

    private Connection conn;
    public RelatorioGeralDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<RelatorioGeral> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM relatoriogeral");

            rs = st.executeQuery();
            List<RelatorioGeral> list = new ArrayList<>();

            while (rs.next()) {
                RelatorioGeral cl = new RelatorioGeral();
                cl.setClient_id(rs.getInt("client_id"));
                cl.setClient_nome(rs.getString("client_nome"));
                cl.setClient_sobrenome(rs.getString("client_sobrenome"));
                cl.setClient_login(rs.getString("client_login"));
                cl.setClient_senha(rs.getString("client_senha"));
                cl.setClient_email(rs.getString("client_email"));
                cl.setClient_rua(rs.getString("client_rua"));
                cl.setClient_num(rs.getInt("client_num"));
                cl.setClient_cidade(rs.getString("client_cidade"));
                cl.setClient_cep(rs.getString("client_cep"));  
                cl.setClient_id(rs.getInt("client_id"));
                cl.setPed_id(rs.getInt("ped_id"));
                cl.setTotal(rs.getFloat("total"));
                cl.setTransp_nome(rs.getString("transp_nome"));
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
