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
    private int posicion;
    private boolean zonaIndigena;
    
    public Pais(String nombre, int posicion, boolean zonaIndigena){
        setNombre(nombre);
        setPosicion(posicion);
        setZonaIndigena(zonaIndigena);
    }
    
//------------------------------------------------------------------------------
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }    
    public String getNombre(){
        return nombre;
    }

//------------------------------------------------------------------------------
    
    public void setPosicion(int posicion){
        this.posicion = posicion;
    }
    public int getPosicion(){
        return posicion;
    }
 
//------------------------------------------------------------------------------

    public void setZonaIndigena(boolean zonaIndigena){
        this.zonaIndigena = zonaIndigena;
    }
    public boolean getZonaIndigena(){
        return zonaIndigena;
    }

}
