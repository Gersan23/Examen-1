/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package Controlador;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Erick
 */
public class ValidadorCedula {
    
    private final static String cedulapattern="\\d";
    
    
    
    public boolean validaCedula(String cedula){
        Pattern pat = Pattern.compile(cedulapattern, Pattern.CASE_INSENSITIVE);
        Matcher mat = pat.matcher(cedula);
        return mat.find();
    }
    
}


