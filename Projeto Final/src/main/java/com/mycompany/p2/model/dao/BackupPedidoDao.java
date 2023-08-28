package com.mycompany.p2.model.dao;

import com.mycompany.p2.model.entities.BackupPedido;

import java.util.List;

public interface BackupPedidoDao {
   
    List<BackupPedido> findAll();
}
