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
public class Ponto {
    
    private int id;
    private String latitude;
    private String logitude;

    public Ponto() {
    }

    public Ponto(int id, String latitude, String logitude) {
        this.id = id;
        this.latitude = latitude;
        this.logitude = logitude;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLogitude() {
        return logitude;
    }

    public void setLogitude(String logitude) {
        this.logitude = logitude;
    }
    
    
            
    
}
