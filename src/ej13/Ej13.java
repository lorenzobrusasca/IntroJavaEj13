/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;

import java.util.Scanner;

/**
 *
 * @author Lorenzo
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    /*
    Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

*/
    
    ///CLARAMENTE ME SALIÓ A MEDIAS
    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
        System.out.println("Ingrese la cant de elementos");
        int elem = leer.nextInt();
        
        for (int i = 0; i < elem; i++) {
            
            System.out.print("*"+" ");
            
        }
        
        System.out.println("");
     
        for (int i = 0; i < elem-2; i++) {
            System.out.print("*");
            
            for (int j = 0; j < elem+1; j++) {
                System.out.print(" ");  
            }
            
            System.out.print("*");
            
            System.out.println("");
        }
        
         for (int i = 0; i < elem; i++) {
            
            System.out.print("*"+" ");
            
        }
                    
        }
        
        
        
    }
    

