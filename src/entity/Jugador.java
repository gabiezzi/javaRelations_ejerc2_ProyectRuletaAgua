/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Gabi
 */
public class Jugador {
    private  int id;
    private Boolean mojado;

    public Jugador(int id) {
      
        this.id = id;
        this.mojado = false;
    }

    public Jugador() {
        
        mojado = false;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", mojado=" + mojado + '}';
    }

    
    
    }

