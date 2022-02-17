/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Juego;

public interface ServicioJuego {

    public Juego llenarJuego();

    public boolean ronda(Juego nuevoJuego);

    public void menu(Juego nuevoJuego);

}
