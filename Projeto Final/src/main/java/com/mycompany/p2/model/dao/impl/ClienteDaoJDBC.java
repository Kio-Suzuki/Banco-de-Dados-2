package com.mycompany.p2.model.dao.impl;

import com.mycompany.p2.db.DB;
import com.mycompany.p2.db.DbException;
import com.mycompany.p2.model.dao.ClienteDao;
import com.mycompany.p2.model.entities.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteDaoJDBC implements ClienteDao {

    private Connection conn;
    public ClienteDaoJDBC(Connection conn) {
        this.conn = conn;
    }


    @Override
    public void insert(Cliente obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("INSERT INTO cliente (client_nome, client_sobrenome, client_login, client_senha, client_email, client_rua, client_num, client_cidade, client_cep ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getClient_nome());
            st.setString(2, obj.getClient_sobrenome());
            st.setString(3, obj.getClient_login());
            st.setString(4, obj.getClient_senha());
            st.setString(5, obj.getClient_email());            
            st.setString(6, obj.getClient_rua());
            st.setInt(7, obj.getClient_num());
            st.setString(8, obj.getClient_cidade());
            st.setString(9, obj.getClient_cep());


            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setClient_id(id);
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
            st = conn.prepareStatement("DELETE FROM cliente WHERE client_id = ?");
            st.setInt(1, id);

            int rows = st.executeUpdate();
            
            if (rows == 0) {
                JOptionPane.showMessageDialog(null, "O ID não existe!", "Erro", 1);
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
    public List<Cliente> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM cliente ORDER BY cliente.client_id");

            rs = st.executeQuery();
            List<Cliente> list = new ArrayList<>();

            while (rs.next()) {
                Cliente cl = new Cliente();
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
