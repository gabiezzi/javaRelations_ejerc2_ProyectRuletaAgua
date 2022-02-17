/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.Jugador;
import entity.RevolverAgua;
import implement.ServicioImplementRevolverAgua;
import java.util.Scanner;
import service.ServicioJugador;

public class ServicioImplementJugador implements ServicioJugador {

    ServicioImplementRevolverAgua nuevoServicioRevolver;
    Scanner sc;

    public ServicioImplementJugador() {

        nuevoServicioRevolver = new ServicioImplementRevolverAgua();
        sc = new Scanner(System.in);
    }

    @Override
    public Jugador ingresaJugadorNuevo(int id) {

        return new Jugador(id);
    }

    @Override
    public boolean disparo(Jugador jugador, RevolverAgua nuevoRevolver) {

        if (nuevoServicioRevolver.mojar(nuevoRevolver.getPosicionActual(),nuevoRevolver.getPosicionAgua())) {

            jugador.setMojado(true);

            return true;

        }

        nuevoRevolver.setPosicionActual(nuevoServicioRevolver.siguienteChorro(nuevoRevolver.getPosicionActual()));
        
        
        return false;
    }

}
