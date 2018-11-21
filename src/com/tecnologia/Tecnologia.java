package com.tecnologia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guero
 */
public abstract class Tecnologia {
    private String noSerie;
    private String anio;
    private String modelo;
    
    public Tecnologia(){}
    
    public Tecnologia(String noSerie, String anio, String modelo){
        this.noSerie = noSerie;
        this.anio = anio;
        this.modelo = modelo;
    }

    /**
     * @return the noSerie
     */
    public String getNoSerie() {
        return noSerie;
    }

    /**
     * @param noSerie the noSerie to set
     */
    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    /**
     * @return the anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString(){
        return "El modelo es " + this.modelo + ", el aÃ±o es " + this.anio 
                + ", No.Serie: " + this.noSerie;
    }
    
    
}
