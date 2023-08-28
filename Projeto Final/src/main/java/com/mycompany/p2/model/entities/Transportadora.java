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

public class Transportadora implements Serializable{
    private int transp_id;
    private String transp_nome;
    private String transp_cnpj;
    private String transp_telefone;
    private String transp_email;

    public Transportadora(int transp_id, String transp_nome, String transp_cnpj, String transp_telefone, String transp_email) {
        this.transp_id = transp_id;
        this.transp_nome = transp_nome;
        this.transp_cnpj = transp_cnpj;
        this.transp_telefone = transp_telefone;
        this.transp_email = transp_email;
    }

    public Transportadora() {}

    public int getTransp_id() {
        return transp_id;
    }

    public void setTransp_id(int transp_id) {
        this.transp_id = transp_id;
    }

    public String getTransp_nome() {
        return transp_nome;
    }

    public void setTransp_nome(String transp_nome) {
        this.transp_nome = transp_nome;
    }

    public String getTransp_cnpj() {
        return transp_cnpj;
    }

    public void setTransp_cnpj(String transp_cnpj) {
        this.transp_cnpj = transp_cnpj;
    }

    public String getTransp_telefone() {
        return transp_telefone;
    }

    public void setTransp_telefone(String transp_telefone) {
        this.transp_telefone = transp_telefone;
    }

    public String getTransp_email() {
        return transp_email;
    }

    public void setTransp_email(String transp_email) {
        this.transp_email = transp_email;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.transp_id;
        hash = 67 * hash + Objects.hashCode(this.transp_nome);
        hash = 67 * hash + Objects.hashCode(this.transp_cnpj);
        hash = 67 * hash + Objects.hashCode(this.transp_telefone);
        hash = 67 * hash + Objects.hashCode(this.transp_email);
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
        final Transportadora other = (Transportadora) obj;
        if (this.transp_id != other.transp_id) {
            return false;
        }
        if (!Objects.equals(this.transp_nome, other.transp_nome)) {
            return false;
        }
        if (!Objects.equals(this.transp_cnpj, other.transp_cnpj)) {
            return false;
        }
        if (!Objects.equals(this.transp_telefone, other.transp_telefone)) {
            return false;
        }
        return Objects.equals(this.transp_email, other.transp_email);
    }

    @Override
    public String toString() {
        return "Transportadora{" + "transp_id=" + transp_id + ", transp_nome=" + transp_nome + ", transp_cnpj=" + transp_cnpj + ", transp_telefone=" + transp_telefone + ", transp_email=" + transp_email + '}';
    }
    
}
