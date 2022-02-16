/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.Juego;
import entity.Jugador;
import service.ServicioJuego;
import implement.ServicioImplementJugador;

/**
 *
 * @author Gabi
 */
public class ServicioImplementJuego implements ServicioJuego {
    
    ServicioImplementJugador nuevoServicioJugador ;

    public ServicioImplementJuego() {
        
    nuevoServicioJugador = new ServicioImplementJugador();
        
        
    }
    
    
    @Override
    public Juego llenarJuego(){
        
        
        
        return new Juego();
    }
    
    
    @Override
    public String ronda(boolean mojado){
        
        if (mojado){
            
        }
        
        
       
    }
    
    @Override
    public void menu(){
        
        
        
        
        
    }
    
}
