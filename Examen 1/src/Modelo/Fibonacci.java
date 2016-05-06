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
public class Fibonacci {
    public static void main(String arg[]){
        
        public static int fibonacci(int n){
            if(n == 0 || n == 1){
                return 1;
            }
            else{
                return fibonacci(n-1)+fibonacci(n-2);
            }
        }
    }
    
}
