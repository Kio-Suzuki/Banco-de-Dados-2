/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2.model.entities;

import java.sql.Timestamp;
import java.util.Objects;

/**
 *
 * @author pmoda
 */
public class BackupPedido {
    private int ped_id;
    private int ped_qnt;
    private int prod_id;
    private int transp_id;
    private int client_id;
    private Timestamp data_exclu;

    public BackupPedido(int ped_id, int ped_qnt, int prod_id, int transp_id, int client_id, Timestamp data_exclu) {
        this.ped_id = ped_id;
        this.ped_qnt = ped_qnt;
        this.prod_id = prod_id;
        this.transp_id = transp_id;
        this.client_id = client_id;
        this.data_exclu = data_exclu;
    }

    public BackupPedido() {
    }

    public int getPed_id() {
        return ped_id;
    }

    public void setPed_id(int ped_id) {
        this.ped_id = ped_id;
    }

    public int getPed_qnt() {
        return ped_qnt;
    }

    public void setPed_qnt(int ped_qnt) {
        this.ped_qnt = ped_qnt;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public int getTransp_id() {
        return transp_id;
    }

    public void setTransp_id(int transp_id) {
        this.transp_id = transp_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public Timestamp getData_exclu() {
        return data_exclu;
    }

    public void setData_exclu(Timestamp data_exclu) {
        this.data_exclu = data_exclu;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.ped_id;
        hash = 67 * hash + this.ped_qnt;
        hash = 67 * hash + this.prod_id;
        hash = 67 * hash + this.transp_id;
        hash = 67 * hash + this.client_id;
        hash = 67 * hash + Objects.hashCode(this.data_exclu);
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
        final BackupPedido other = (BackupPedido) obj;
        if (this.ped_id != other.ped_id) {
            return false;
        }
        if (this.ped_qnt != other.ped_qnt) {
            return false;
        }
        if (this.prod_id != other.prod_id) {
            return false;
        }
        if (this.transp_id != other.transp_id) {
            return false;
        }
        if (this.client_id != other.client_id) {
            return false;
        }
        return Objects.equals(this.data_exclu, other.data_exclu);
    }

    @Override
    public String toString() {
        return "BackupPedido{" + "ped_id=" + ped_id + ", ped_qnt=" + ped_qnt + ", prod_id=" + prod_id + ", transp_id=" + transp_id + ", client_id=" + client_id + ", data_exclu=" + data_exclu + '}';
    }
    
}
