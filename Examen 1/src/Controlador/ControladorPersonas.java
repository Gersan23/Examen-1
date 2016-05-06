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
import javax.swing.JOptionPane;

/**
 *
 * @author erick
 */
public class ControladorPersonas implements ActionListener {
    
    private VentanaPersonas ventanaPersonas;
    private Persona persona;
    private ArrayPersonas array;
    

    public ControladorPersonas(VentanaPersonas ventanaPersonas, ArrayPersonas array) {
        this.ventanaPersonas = ventanaPersonas;
        this.array = array;
        //his.guiBuscarEstudiante = new GuiBuscarEstudiante();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int codigo = this.ventanaPersonas.getCodigoPorFuente(ae.getSource());

        try{
            procesar_accion(codigo);
        }catch(PersonaException e){
            this.ventanaPersonas.setMensajes(e.getMessage());
            if(e.isLimpiarInterfaz()){
                this.ventanaPersonas.limpiar();
            }
        }
    }

    public void procesar_accion(int codigo) throws PersonaException {
        Persona persona;
        switch (codigo) {
            case AGREGAR:
                if (ventanaPersonas.verificar()) {
                    throw new PersonaException(
                            "Procure llenar los datos requeridos",
                            false);
                }

                persona = new Persona(ventanaPersonas.getTexIdentificacion(), ventanaPersonas.getTextEstatus());
                ventanaPersonas.limpiar();
                JOptionPane.showMessageDialog(null, array.agregarPersona(persona));

                break;
   
        }
    }

}

