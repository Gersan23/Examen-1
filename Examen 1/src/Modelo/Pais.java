/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Gersan
 */
public class Pais {
    
    private String nombre;
    
    public Pais(String nombre){
        setNombre(nombre);
    }
    
//------------------------------------------------------------------------------
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }    
    public String getNombre(){
        return nombre;
    }
    
    
}
