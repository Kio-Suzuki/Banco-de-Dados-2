/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2.model.entities;

import java.util.Objects;

/**
 *
 * @author pmoda
 */
public class ProdutosGerais {
    private int categoria_id;
    private int prod_id;
    private int prod_anofabricacao;
    private String prod_nome;
    private float prod_preco;
    private String categoria_nome;

    public ProdutosGerais(int categoria_id, int prod_id, int prod_anofabricacao, String prod_nome, float prod_preco, String categoria_nome) {
        this.categoria_id = categoria_id;
        this.prod_id = prod_id;
        this.prod_anofabricacao = prod_anofabricacao;
        this.prod_nome = prod_nome;
        this.prod_preco = prod_preco;
        this.categoria_nome = categoria_nome;
    }

    public ProdutosGerais() {
    }
    
    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public int getProd_anofabricacao() {
        return prod_anofabricacao;
    }

    public void setProd_anofabricacao(int prod_anofabricacao) {
        this.prod_anofabricacao = prod_anofabricacao;
    }

    public String getProd_nome() {
        return prod_nome;
    }

    public void setProd_nome(String prod_nome) {
        this.prod_nome = prod_nome;
    }

    public float getProd_preco() {
        return prod_preco;
    }

    public void setProd_preco(float prod_preco) {
        this.prod_preco = prod_preco;
    }

    public String getCategoria_nome() {
        return categoria_nome;
    }

    public void setCategoria_nome(String categoria_nome) {
        this.categoria_nome = categoria_nome;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + this.categoria_id;
        hash = 19 * hash + this.prod_id;
        hash = 19 * hash + this.prod_anofabricacao;
        hash = 19 * hash + Objects.hashCode(this.prod_nome);
        hash = 19 * hash + Float.floatToIntBits(this.prod_preco);
        hash = 19 * hash + Objects.hashCode(this.categoria_nome);
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
        final ProdutosGerais other = (ProdutosGerais) obj;
        if (this.categoria_id != other.categoria_id) {
            return false;
        }
        if (this.prod_id != other.prod_id) {
            return false;
        }
        if (this.prod_anofabricacao != other.prod_anofabricacao) {
            return false;
        }
        if (Float.floatToIntBits(this.prod_preco) != Float.floatToIntBits(other.prod_preco)) {
            return false;
        }
        if (!Objects.equals(this.prod_nome, other.prod_nome)) {
            return false;
        }
        return Objects.equals(this.categoria_nome, other.categoria_nome);
    }

    @Override
    public String toString() {
        return "ProdutosGerais{" + "categoria_id=" + categoria_id + ", prod_id=" + prod_id + ", prod_anofabricacao=" + prod_anofabricacao + ", prod_nome=" + prod_nome + ", prod_preco=" + prod_preco + ", categoria_nome=" + categoria_nome + '}';
    }
    
    
}
