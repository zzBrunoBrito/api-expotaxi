/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiexpotaxi.model;

/**
 *
 * @author leofreitas
 */
public class TaxistaPonto {

    private int id;
    private Taxista taxista;
    private Ponto ponto;

    public TaxistaPonto() {
    }
    
    public TaxistaPonto(int id, Taxista taxista, Ponto ponto) {
        this.id = id;
        this.taxista = taxista;
        this.ponto = ponto;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Taxista getTaxista() {
        return taxista;
    }

    public void setTaxista(Taxista taxista) {
        this.taxista = taxista;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }
    
    
    
}
