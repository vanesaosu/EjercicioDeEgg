/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicadefunciones;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PracticaDeFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Ingrese su nombre: ");
       String nombre = teclado.nextLine();
       
       saludar(nombre);
       
       int a,b,c;
       System.out.println("ingrese un numero");
       a= teclado.nextInt();
       System.out.println("ingrese otro  numero");
       b= teclado.nextInt();
       c= mayor(a,b);
       System.out.println("el mayor es: "+ c);
    }
    
    public static void saludar(String nombre){
        System.out.println("hola , como estas hoy?" +nombre);
    }
    
    public static  int  mayor( int a,int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
    
}
