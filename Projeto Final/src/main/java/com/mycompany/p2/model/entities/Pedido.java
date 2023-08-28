/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2.model.entities;
import java.io.Serializable;
/**
 *
 * @author pmoda
 */
public class Pedido implements Serializable {
    private int ped_id;
    private int ped_quantidade;
    private int prod_id;
    private int transp_id;
    private int client_id;

    public Pedido(int ped_id, int ped_quantidade, int prod_id, int transp_id, int client_id) {
        this.ped_id = ped_id;
        this.ped_quantidade = ped_quantidade;
        this.prod_id = prod_id;
        this.transp_id = transp_id;
        this.client_id = client_id;
    }

    public Pedido() {
    }

    public int getPed_id() {
        return ped_id;
    }

    public void setPed_id(int ped_id) {
        this.ped_id = ped_id;
    }

    public int getPed_quantidade() {
        return ped_quantidade;
    }

    public void setPed_quantidade(int ped_quantidade) {
        this.ped_quantidade = ped_quantidade;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.ped_id;
        hash = 11 * hash + this.ped_quantidade;
        hash = 11 * hash + this.prod_id;
        hash = 11 * hash + this.transp_id;
        hash = 11 * hash + this.client_id;
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
        final Pedido other = (Pedido) obj;
        if (this.ped_id != other.ped_id) {
            return false;
        }
        if (this.ped_quantidade != other.ped_quantidade) {
            return false;
        }
        if (this.prod_id != other.prod_id) {
            return false;
        }
        if (this.transp_id != other.transp_id) {
            return false;
        }
        return this.client_id == other.client_id;
    }

    @Override
    public String toString() {
        return "Pedido{" + "ped_id=" + ped_id + ", ped_quantidade=" + ped_quantidade + ", prod_id=" + prod_id + ", transp_id=" + transp_id + ", client_id=" + client_id + '}';
    }
    
}
