/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdejavacursoenegg;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer= new Scanner(System.in);
         
         System.out.println("Ingrese un num");
         int num1 =leer .nextInt();
         
          System.out.println("Ingrese otro  un num");
         int num2 =leer .nextInt();
         
         int multi = num1*num2;
         
         System.out.println("la multiplicacion de los dos numeros son : "+ multi);
    }
    
}
