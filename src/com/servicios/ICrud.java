package com.servicios;

import com.tecnologia.computadora.Computadora;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guero
 */
public interface ICrud {
    boolean agregar(Computadora compu);
    LinkedList leer();
    //void update();
    //void delete();
}
