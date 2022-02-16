/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Jugador;
import entity.RevolverAgua;

/**
 *
 * @author Gabi
 */
public interface ServicioJugador {
    
    public Jugador ingresaJugadorNuevo();
    public boolean disparo(Jugador jugador, int posicionActual,int posicionAgua);   
    
    
}
