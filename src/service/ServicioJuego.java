/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Juego;
import entity.Jugador;
import java.util.ArrayList;

/**
 *
 * @author Gabi
 */
public interface ServicioJuego {
    
    public Juego llenarJuego();
    public String ronda(boolean mojado);
    public void menu();
    
}
