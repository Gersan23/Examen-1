/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Persona;
import Modelo.ArrayPersonas;
import Modelo.PersonaException;
import Vista.VentanaPersonas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class ControladorPersonas implements ActionListener {
    VentanaPersonas ventana;
    
    public ControladorPersonas(VentanaPersonas ventana){
        this.ventana = ventana;
    }
    
    public void actionPerformed(ActionEvent evento)
  {
    
    if(evento.getActionCommand().equalsIgnoreCase("Agregar"))
    {
        try {
            ventana.agregar();
        } catch (PersonaException ex) {
            Logger.getLogger(ControladorPersonas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }else{
        if(evento.getActionCommand().equalsIgnoreCase("Salir")){
            System.exit(0);
        }
    }   
  }

    
    
    
}
