package com.mycompany.p2.model.dao.impl;

import com.mycompany.p2.db.DB;
import com.mycompany.p2.db.DbException;
import com.mycompany.p2.model.dao.ProdutosGeraisDao;
import com.mycompany.p2.model.entities.ProdutosGerais;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutosGeraisDaoJDBC implements ProdutosGeraisDao {

    private Connection conn;
    public ProdutosGeraisDaoJDBC(Connection conn) {
        this.conn = conn;
    }


    @Override
    public void insert(ProdutosGerais obj) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("INSERT INTO produtosgerais (categoria_id, prod_id, prod_anofabricacao, prod_nome, prod_preco, categoria_nome) VALUES (default, default, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, obj.getProd_anofabricacao());
            st.setString(2, obj.getProd_nome());
            st.setFloat(3, obj.getProd_preco());            
            st.setString(4, obj.getCategoria_nome());

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
    public List<ProdutosGerais> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            st = conn.prepareStatement("SELECT * FROM produtosgerais ORDER BY produtosgerais.prod_id");

            rs = st.executeQuery();
            List<ProdutosGerais> list = new ArrayList<>();

            while (rs.next()) {
                ProdutosGerais cl = new ProdutosGerais();
                cl.setCategoria_id(rs.getInt("categoria_id"));
                cl.setProd_id(rs.getInt("prod_id"));
                cl.setProd_anofabricacao(rs.getInt("prod_anofabricacao"));
                cl.setProd_nome(rs.getString("prod_nome"));
                cl.setProd_preco(rs.getFloat("prod_preco"));
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
