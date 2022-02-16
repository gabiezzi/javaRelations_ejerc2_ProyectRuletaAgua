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
    public Jugador ingresaJugadorNuevo(){
        
        return new Jugador();
    }
    
    
    @Override
    public boolean disparo(Jugador jugador, int posicionActual,int posicionAgua) {

        if (nuevoServicioRevolver.mojar(posicionActual, posicionAgua)) {
            
            jugador.setMojado(false);
            
            nuevoServicioRevolver.siguienteChorro(posicionActual);
            
            return true;
            

        }
        
        
        nuevoServicioRevolver.siguienteChorro(posicionActual);

        return false;
    }

}
