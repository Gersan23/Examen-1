/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;
//import Modelo.Curso;
import Modelo.Persona;
//import Modelo.Matricula;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.AyudanteOS;
import utilidades.Escritor;
import utilidades.Lector;

/**
 *
 * @author luisza
 */
public class SalvadorXML implements SalvadorArchivos{

    private Escritor escritor;
    private AyudanteOS ayudaos;

    public SalvadorXML() {
        escritor = new Escritor();
        ayudaos = new AyudanteOS();
    }
    
    public void guardarEstudiante(ArrayList<Persona> persona) {
        try {
            escritor.with_obj_in_file_xml(
                    ayudaos.get_config_file("personas.xml"),
                    persona);
        } catch (IOException ex) {
            Logger.getLogger(SalvadorXML.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    
    }
}
    
