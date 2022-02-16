
package entity;

import java.util.ArrayList;

public class Juego {
    
    
    private ArrayList<Jugador> jugadores;
    
    private RevolverAgua nuevoRevolver;

    public Juego(ArrayList<Jugador> jugadores, RevolverAgua nuevoRevolver) {
        this.jugadores = jugadores;
        this.nuevoRevolver = nuevoRevolver;
    }

    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getNuevoRevolver() {
        return nuevoRevolver;
    }

    public void setNuevoRevolver(RevolverAgua nuevoRevolver) {
        this.nuevoRevolver = nuevoRevolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", nuevoRevolver=" + nuevoRevolver + '}';
    }
    
    
    
}
