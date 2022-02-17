/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.Juego;
import entity.Jugador;
import entity.RevolverAgua;
import service.ServicioJuego;
import implement.ServicioImplementJugador;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioImplementJuego implements ServicioJuego {

    ServicioImplementJugador nuevoServicioJugador;
    ServicioImplementRevolverAgua nuevoServicioRevolver;
    Scanner sc;

    public ServicioImplementJuego() {

        nuevoServicioJugador = new ServicioImplementJugador();
        nuevoServicioRevolver = new ServicioImplementRevolverAgua();
        sc = new Scanner(System.in);

    }

    @Override
    public Juego llenarJuego() {

        ArrayList<Jugador> jugadores = new ArrayList();

        System.out.println("Ingrese la cantidad de jugadores");

        int cantJugadores = sc.nextInt();

        if (cantJugadores > 6 || cantJugadores < 0) {

            System.out.println("Cantidad de jugadores no valida, se estableció 6 jugadores por defecto!");

            cantJugadores = 6;
        }

        for (int i = 0; i < cantJugadores; i++) {

            jugadores.add(nuevoServicioJugador.ingresaJugadorNuevo(i + 1));

        }

        return new Juego(jugadores, nuevoServicioRevolver.llenarRevolver());
    }

    @Override
    public boolean ronda(Juego nuevoJuego) {

        System.out.println("El resultado de esta ronda : \n");

        int turnos = nuevoJuego.getJugadores().size();

        for (int i = 0; i < turnos; i++) {

            if (nuevoServicioJugador.disparo(nuevoJuego.getJugadores().get(i), nuevoJuego.getNuevoRevolver())) {

                System.out.println("Jugador " + nuevoJuego.getJugadores().get(i).getId() + " ha recibido un corchazo(de agua)");

                return true;
            } else {

                System.out.println("Jugador " + nuevoJuego.getJugadores().get(i).getId() + " se ha salvado.");

            }

            if (i == turnos - 1) {
                i = 0;
            }
        }
            
           return false;
    }

    @Override
    public void menu(Juego nuevoJuego) {

        System.out.println("Bienvenido a la ruleta de corchazos(de agua)");

        if(ronda(nuevoJuego)) {

            System.out.println("EL juego terminó");
        }

    }

}
