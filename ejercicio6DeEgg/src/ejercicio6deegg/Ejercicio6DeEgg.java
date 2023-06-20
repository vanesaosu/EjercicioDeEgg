/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6deegg;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio6DeEgg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese un numero");
       int num1 =leer.nextInt();
       
       System.out.println("Ingrese otro numero");
       int num2 =leer.nextInt();
       
       if(num1 > num2){
           System.out.println("num1 es mayor que el segundo numero ingresado");
       }else{
          System.out.println("num2 es mayor que el primero numero ingresado"); 
       }
    }
    
}
