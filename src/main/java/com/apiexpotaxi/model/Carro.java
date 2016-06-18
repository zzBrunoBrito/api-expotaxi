/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apiexpotaxi.model;

/**
 *
 * @author bruno
 */
public class Carro {
    private int id;
    private String descricao;
    private String placa;

    public Carro() {
    }

    public Carro(int id, String descricao, String placa) {
        this.id = id;
        this.descricao = descricao;
        this.placa = placa;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
