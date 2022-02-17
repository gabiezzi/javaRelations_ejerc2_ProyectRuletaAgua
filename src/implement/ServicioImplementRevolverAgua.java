/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import entity.RevolverAgua;
import service.ServicioRevolverAgua;

/**
 *
 * @author Gabi
 */
public class ServicioImplementRevolverAgua implements ServicioRevolverAgua {

    @Override
    public boolean mojar(int posicionActual , int posicionAgua) {
        return posicionActual == posicionAgua;
    }
    
    @Override
    public RevolverAgua llenarRevolver(){

        int posicionActual = (int)(Math.random()*6+1);
        int posicionAgua = (int)(Math.random()*6+1);
        
        System.out.println("posicionAgua = " + posicionAgua);
        System.out.println("posicionActual = " + posicionActual);
        
        return new RevolverAgua(posicionActual, posicionAgua);
    }
    
    @Override
    public int siguienteChorro(int posicionActual) {
        
        if(posicionActual == 6)
        posicionActual = 1;
        else{
          posicionActual= posicionActual +1;
        }
    return posicionActual;
    }

}
