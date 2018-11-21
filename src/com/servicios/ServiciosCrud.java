/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicios;

import com.tecnologia.computadora.Computadora;
import java.util.*;
/**
 *
 * @author guero
 */
public class ServiciosCrud implements ICrud {

    LinkedList<Computadora> listaDeCompus = new LinkedList();

    @Override
    public boolean agregar(Computadora compu) {
        return listaDeCompus.add(compu);
    }

    @Override
    public LinkedList leer() {
        return listaDeCompus;
    }
    
}
