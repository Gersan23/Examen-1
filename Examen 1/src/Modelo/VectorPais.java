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
public class VectorPais
{
  Pais vectorPais[];
  
//----------------------------------------------------------------------
  
  public VectorPais(int tamVector)
  {
    vectorPais = new Pais[tamVector];
  }
  
//---------------------------------------------------------------------- 
  public void setValor(Pais valor, int posicion)
  {
    vectorPais[posicion] = valor;
  }//fin del metodo setValor 
  
//----------------------------------------------------------------------
  
  public Pais getValor(int posicion)
  {
    Pais valor = null;
    if((posicion >= 0)&&(posicion<vectorPais.length))
    {
      valor = vectorPais[posicion];
    }//fin del if
    return valor;
  }//fin del metodo getValor
  
//----------------------------------------------------------------------
  
  
}
