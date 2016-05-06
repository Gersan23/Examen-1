/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.ArrayList;
/*
 *
 * @author Erick
 */
public class ArrayPersonas {
    
    private ArrayList<Persona> arregloPersona;
    private String matrizDatos[][];

    public ArrayPersonas() {

        this.arregloPersona = new ArrayList<Persona>();
    }

    public void setArregloPersona(ArrayList<Persona> arregloPersona) {
        this.arregloPersona = arregloPersona;
    }

    public String agregarPersona(Persona persona) throws PersonaException {

        if (verificarPersona(persona.getIdentificacion())) 
            throw new PersonaException(
                    "Ya existe una persona con ese numero de cedula ",
                    false);
        
        arregloPersona.add(persona);
        return "Se agrego con exito";
    }

    public boolean verificarPersona(String identificacion) {

        boolean dev = false;
        if (arregloPersona.size() != 0) {

            for (int i = 0; i < arregloPersona.size(); i++) {
                if (arregloPersona.get(i).getIdentificacion().equalsIgnoreCase(identificacion)) {

                    dev = true;

                    break;

                }
            }

        }
        return dev;
    }

    
}
