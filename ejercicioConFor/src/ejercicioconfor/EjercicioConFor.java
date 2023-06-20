/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioconfor;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class EjercicioConFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
    //ingresado seguido de tantos asteriscos como indique su valor.
         Scanner leer = new Scanner(System.in);
         
    
        System.out.println("Ingrese un num ");
         int n1= leer.nextInt();
        
        System.out.println("Ingrese un otro num ");
        int n2= leer.nextInt();
        
        System.out.println("Ingrese nuevamente otro num ");
        int n3= leer.nextInt();
        
        System.out.println("Ingrese  por ultimo otro  num ");
        int n4= leer.nextInt();
 
    if (n1<=20) {
         System.out.print(n1);
        for (int i = 0; i < n1; i++) {
            System.out.print("*");
        }
                }else {
        System.out.print("El numero ingresado en invalido");
 
 
    } System.out.println(" ");
    if (n2<=20) {
        System.out.print(n2);
        for (int i = 0; i < n2; i++) {
            System.out.print("*");
        }
        }else {
        System.out.print("El numero ingresado en invalido");
 
    }System.out.println(" ");
    if (n3<=20) {
        System.out.print(n3);
        for (int i = 0; i < n3; i++) {
            System.out.print("*");
 
    }
        }else {
        System.out.print("El numero ingresado en invalido");
 
    } System.out.println(" ");
    if (n4<=20) {
        System.out.print(n4);
        for (int i = 0; i < n4; i++) {
            System.out.print("*");
 
    }
    }else {
        System.out.print("El numero ingresado es invalido");
 
    }
 
 
 
    System.out.println(" ");
    }
    
}
