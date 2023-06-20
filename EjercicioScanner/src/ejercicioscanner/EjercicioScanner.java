/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscanner;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class EjercicioScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Explorando que es el scanner");
        
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Ingresa tu edad");
        int edad= leer.nextInt();
        
        System.out.println("Sabremos si fuiste aceptado o no");
        boolean aceptado =leer.nextBoolean();
        
        System.out.println("El promedio es : ");
        double promedio = leer.nextDouble();
        
        
    }
    
}
