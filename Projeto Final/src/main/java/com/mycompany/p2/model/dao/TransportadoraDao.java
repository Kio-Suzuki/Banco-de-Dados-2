package com.mycompany.p2.model.dao;

import com.mycompany.p2.model.entities.Transportadora;

import java.util.List;

public interface TransportadoraDao {
   
    void insert(Transportadora obj);

    void deleteById(Integer id);
    List<Transportadora> findAll();
}
