package com.mycompany.p2.model.dao;

import com.mycompany.p2.model.entities.Categoria;

import java.util.List;

public interface CategoriaDao {

    void insert(Categoria obj);
    void deleteById(Integer id);
    List<Categoria> findAll();
}
