package com.mycompany.p2.model.dao;

import com.mycompany.p2.model.entities.Cliente;

import java.util.List;

public interface ClienteDao {

    void insert(Cliente obj);

    void deleteById(Integer id);
    List<Cliente> findAll();
}
