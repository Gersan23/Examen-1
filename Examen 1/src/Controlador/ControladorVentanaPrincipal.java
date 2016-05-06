/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Gersan*/

import Factories.SalvadorArchivos;
import Factories.SalvadorXML;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Vista.VentanaPersonas;
import Vista.VentanaIntercambios;
import Modelo.ConfigManager;

/**
 *
 * @author Luisza
 */
public class ControladorVentanaPrincipal implements ActionListener {

    private VentanaPersonas ventanaPer;
    private VentanaIntercambios ventanaI;
    private ConfigManager config_manager;
    

    public ControladorVentanaPrincipal() {
        ventanaPer = new VentanaPersonas();
        ventanaI = new VentanaIntercambios();
        config_manager = ConfigManager.getInstance();
        config_manager.load_config();
        
        
    }

  

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Salir")) {
            config_manager.save_config();
           
            System.exit(0);
        }else{
            if(e.getActionCommand().equalsIgnoreCase("Crear")) {
            config_manager.save_config();
            
            ventanaPer.show();
        }else{
                if(e.getActionCommand().equalsIgnoreCase("Intercambios")){
                    config_manager.save_config();
                    
                    ventanaI.show();
                }
            }
        if(e.getActionCommand().equalsIgnoreCase("XML")){
            this.config_manager.setProperty("formato", "xml");
            
        }
    }
    
    } 
    
}

