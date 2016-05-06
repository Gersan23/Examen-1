/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;
import Modelo.Persona;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author luisza
 */
public interface SalvadorArchivos {
    
    void guardarPersona(ArrayList<Persona> persona);
    ArrayList<Persona> obtenerPersona();
    
}
