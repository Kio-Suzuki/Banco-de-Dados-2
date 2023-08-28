package com.mycompany.p2.model.dao;

import com.mycompany.p2.model.entities.Pedido;

import java.util.List;

public interface PedidoDao {
   
    void insert(Pedido obj);
    void updatar(Pedido obj);
    void deleteById(Integer id);
    List<Pedido> findAll();
}
