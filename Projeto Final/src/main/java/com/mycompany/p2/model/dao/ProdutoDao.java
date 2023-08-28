package com.mycompany.p2.model.dao;

import com.mycompany.p2.model.entities.Produto;

import java.util.List;

public interface ProdutoDao {
   
    void insert(Produto obj);
    List<Produto> findAll();
    void deleteById(Integer id);
}
