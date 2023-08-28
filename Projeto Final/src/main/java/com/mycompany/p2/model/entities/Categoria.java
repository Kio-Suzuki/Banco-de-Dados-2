/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2.model.entities;

import java.io.Serializable;
import java.util.Objects;
        
/**
 *
 * @author pmoda
 */
public class Categoria implements Serializable {
       private int categoria_id;
       private String categoria_nome;

    public Categoria(int categoria_id, String categoria_nome) {
        this.categoria_id = categoria_id;
        this.categoria_nome = categoria_nome;
    }

    public Categoria() {
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getCategoria_nome() {
        return categoria_nome;
    }

    public void setCategoria_nome(String categoria_nome) {
        this.categoria_nome = categoria_nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.categoria_id;
        hash = 89 * hash + Objects.hashCode(this.categoria_nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (this.categoria_id != other.categoria_id) {
            return false;
        }
        return Objects.equals(this.categoria_nome, other.categoria_nome);
    }

    @Override
    public String toString() {
        return "Categoria{" + "categoria_id=" + categoria_id + ", categoria_nome=" + categoria_nome + '}';
    }
       
}
