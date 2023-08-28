/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2.model.entities;

/**
 *
 * @author pmoda
 */
import java.io.Serializable;
import java.util.Objects;

public class Produto implements Serializable{
    private int prod_id;
    private int prod_quantidade;
    private String prod_nome;
    private int categoria_id;
    private Float prod_preco;

    public Produto(int prod_id, int prod_quantidade, String prod_nome, int categoria_id, Float prod_preco) {
        this.prod_id = prod_id;
        this.prod_quantidade = prod_quantidade;
        this.prod_nome = prod_nome;
        this.categoria_id = categoria_id;
        this.prod_preco = prod_preco;
    }

    public Produto() {
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public int getProd_quantidade() {
        return prod_quantidade;
    }

    public void setProd_quantidade(int prod_quantidade) {
        this.prod_quantidade = prod_quantidade;
    }

    public String getProd_nome() {
        return prod_nome;
    }

    public void setProd_nome(String prod_nome) {
        this.prod_nome = prod_nome;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public Float getProd_preco() {
        return prod_preco;
    }

    public void setProd_preco(Float prod_preco) {
        this.prod_preco = prod_preco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.prod_id;
        hash = 29 * hash + this.prod_quantidade;
        hash = 29 * hash + Objects.hashCode(this.prod_nome);
        hash = 29 * hash + this.categoria_id;
        hash = 29 * hash + Objects.hashCode(this.prod_preco);
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
        final Produto other = (Produto) obj;
        if (this.prod_id != other.prod_id) {
            return false;
        }
        if (this.prod_quantidade != other.prod_quantidade) {
            return false;
        }
        if (this.categoria_id != other.categoria_id) {
            return false;
        }
        if (!Objects.equals(this.prod_nome, other.prod_nome)) {
            return false;
        }
        return Objects.equals(this.prod_preco, other.prod_preco);
    }

    @Override
    public String toString() {
        return "Produto{" + "prod_id=" + prod_id + ", prod_quantidade=" + prod_quantidade + ", prod_nome=" + prod_nome + ", categoria_id=" + categoria_id + ", prod_preco=" + prod_preco + '}';
    }

}
