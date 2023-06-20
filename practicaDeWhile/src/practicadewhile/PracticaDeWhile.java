/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicadewhile;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PracticaDeWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta ="S";
        
        while(respuesta.equalsIgnoreCase("S")){
            System.out.println("Desea continuar?");
            respuesta= leer.nextLine();
        }
    }
    
}
