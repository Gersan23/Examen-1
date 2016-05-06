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
public class Persona {
    private String estatus;
    private String identificacion;
    private String procedencia;
    private String residencia;
   

    public Persona(String estatus, String identificacion, String procedencia, String residencia){

        setEstatus(estatus);
        setIdentificacion(identificacion);
        setProcedencia(procedencia);
        setResidencia(residencia);
    }

//------------------------------------------------------------------------------    
    
    public void setEstatus(String estatus){
        this.estatus = estatus;
    }
    public String getEstatus(){
        return estatus;
    }
//------------------------------------------------------------------------------
    
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
    public String getIdentificacion(){
        return identificacion;
    }

//------------------------------------------------------------------------------
    
    public void setProcedencia(String procedencia){
        this.procedencia = procedencia;
    }
    public Object getProcedencia(){
        return procedencia;
    }
    
//------------------------------------------------------------------------------
    
    public void setResidencia(String residencia){
        this.residencia = residencia;
    }
    public Object getActual(){
        return residencia;
    }
    
}
