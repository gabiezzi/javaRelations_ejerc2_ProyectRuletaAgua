/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.RevolverAgua;

/**
 *
 * @author Gabi
 */
public interface ServicioRevolverAgua {
    
     public boolean mojar(int posicionActual , int posicionAgua);
     public RevolverAgua llenarRevolver();
     public int siguienteChorro(int posicionActual);
            
    
    
}
