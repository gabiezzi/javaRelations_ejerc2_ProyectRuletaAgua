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

        return new RevolverAgua();
    }
    
    @Override
    public int siguienteChorro(int posicionActual) {

        return posicionActual+1;
    }

}
