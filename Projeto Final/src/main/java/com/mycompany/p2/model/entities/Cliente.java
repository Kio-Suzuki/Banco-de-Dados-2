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
public class Cliente {
    private int client_id;
    private String client_nome;
    private String client_sobrenome;
    private String client_login;
    private String client_senha;
    private String client_email;
    private String client_rua;
    private int client_num;
    private String client_cidade;
    private String client_cep;

    public Cliente(int client_id, String client_nome, String client_sobrenome, String client_login, String client_senha, String client_email, String client_rua, int client_num, String client_cidade, String client_cep) {
        this.client_id = client_id;
        this.client_nome = client_nome;
        this.client_sobrenome = client_sobrenome;
        this.client_login = client_login;
        this.client_senha = client_senha;
        this.client_email = client_email;
        this.client_rua = client_rua;
        this.client_num = client_num;
        this.client_cidade = client_cidade;
        this.client_cep = client_cep;
    }

    public Cliente() {
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getClient_nome() {
        return client_nome;
    }

    public void setClient_nome(String client_nome) {
        this.client_nome = client_nome;
    }

    public String getClient_sobrenome() {
        return client_sobrenome;
    }

    public void setClient_sobrenome(String client_sobrenome) {
        this.client_sobrenome = client_sobrenome;
    }

    public String getClient_login() {
        return client_login;
    }

    public void setClient_login(String client_login) {
        this.client_login = client_login;
    }

    public String getClient_senha() {
        return client_senha;
    }

    public void setClient_senha(String client_senha) {
        this.client_senha = client_senha;
    }

    public String getClient_email() {
        return client_email;
    }

    public void setClient_email(String client_email) {
        this.client_email = client_email;
    }

    public String getClient_rua() {
        return client_rua;
    }

    public void setClient_rua(String client_rua) {
        this.client_rua = client_rua;
    }

    public int getClient_num() {
        return client_num;
    }

    public void setClient_num(int client_num) {
        this.client_num = client_num;
    }

    public String getClient_cidade() {
        return client_cidade;
    }

    public void setClient_cidade(String client_cidade) {
        this.client_cidade = client_cidade;
    }

    public String getClient_cep() {
        return client_cep;
    }

    public void setClient_cep(String client_cep) {
        this.client_cep = client_cep;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.client_id;
        hash = 59 * hash + Objects.hashCode(this.client_nome);
        hash = 59 * hash + Objects.hashCode(this.client_sobrenome);
        hash = 59 * hash + Objects.hashCode(this.client_login);
        hash = 59 * hash + Objects.hashCode(this.client_senha);
        hash = 59 * hash + Objects.hashCode(this.client_email);
        hash = 59 * hash + Objects.hashCode(this.client_rua);
        hash = 59 * hash + this.client_num;
        hash = 59 * hash + Objects.hashCode(this.client_cidade);
        hash = 59 * hash + Objects.hashCode(this.client_cep);
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
        final Cliente other = (Cliente) obj;
        if (this.client_id != other.client_id) {
            return false;
        }
        if (this.client_num != other.client_num) {
            return false;
        }
        if (!Objects.equals(this.client_nome, other.client_nome)) {
            return false;
        }
        if (!Objects.equals(this.client_sobrenome, other.client_sobrenome)) {
            return false;
        }
        if (!Objects.equals(this.client_login, other.client_login)) {
            return false;
        }
        if (!Objects.equals(this.client_senha, other.client_senha)) {
            return false;
        }
        if (!Objects.equals(this.client_email, other.client_email)) {
            return false;
        }
        if (!Objects.equals(this.client_rua, other.client_rua)) {
            return false;
        }
        if (!Objects.equals(this.client_cidade, other.client_cidade)) {
            return false;
        }
        return Objects.equals(this.client_cep, other.client_cep);
    }

    @Override
    public String toString() {
        return "Cliente{" + "client_id=" + client_id + ", client_nome=" + client_nome + ", client_sobrenome=" + client_sobrenome + ", client_login=" + client_login + ", client_senha=" + client_senha + ", client_email=" + client_email + ", client_rua=" + client_rua + ", client_num=" + client_num + ", client_cidade=" + client_cidade + ", client_cep=" + client_cep + '}';
    }
    
}
