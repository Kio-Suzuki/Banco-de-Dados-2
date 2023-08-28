/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.p2.model.dao;

import com.mycompany.p2.model.entities.ProdutosGerais;
import java.util.List;

/**
 *
 * @author pmoda
 */
public interface ProdutosGeraisDao {
    void insert(ProdutosGerais obj);
    List<ProdutosGerais> findAll();
}
