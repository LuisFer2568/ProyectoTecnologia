package com.tecnologia.computadora;


import com.tecnologia.Tecnologia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guero
 */
public class Computadora extends Tecnologia {
    private String procesador;
    private int ram;
    
    public Computadora(){}

    
    public Computadora (String noSerie, String anio, String modelo,String procesador, int ram ){
        super(noSerie, anio, modelo);
        this.procesador = procesador;
        this.ram = ram;
    }

    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }
    
    public String toString(){
        return super.toString() + ", procesador: " + this.procesador + " RAM: " + this.ram ;
    }
    
}
