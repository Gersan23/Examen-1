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
    private Object procedencia;
    private Object residencia;
   

    public Persona(String estatus, String identificacion, Object procedencia, Object residencia){

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
    
    public void setProcedencia(Object procedencia){
        this.procedencia = procedencia;
    }
    public Object getProcedencia(){
        return procedencia;
    }
    
//------------------------------------------------------------------------------
    
    public void setResidencia(Object residencia){
        this.residencia = residencia;
    }
    public Object getActual(){
        return residencia;
    }
    
}
