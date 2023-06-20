/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probandoswitch;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ProbandoSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        
        System.out.println("Ingrese una opcion");
        opcion = leer.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("desea una hamburguesa ");
                break;
            case 2:
                System.out.println("desea una hamburguesa con pure  ");
                break;
            case 3:
                System.out.println("desea una milanesa con papas  ");
                break;
            default:
                System.out.println("La opcion que ingreso es incorrecta por favor vuelva a leer el menu ");
        }
    }
    
}
