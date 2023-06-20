/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11delaguia;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio11DeLaGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase;
		String fraseNueva;
		String letra;
		
		Scanner ingreso = new Scanner(System.in);
		frase = ingreso.nextLine();
		
		fraseNueva = "";
		
		for(int i = 0; i < frase.length(); i++) {
			letra = frase.substring(i,i+1);
			switch (letra) {
				case "a":
				case "A":
					fraseNueva += "@";
					break;
				case "e":
				case "E":
					fraseNueva += "#";
					break;
				case "i":
				case "I":
					fraseNueva += "$";
					break;
				case "o":
				case "O":
					fraseNueva += "%";
					break;
				case "u":
				case "U":
					fraseNueva += "*";
					break;
				default:
					fraseNueva += letra;
					break;
			}
		}
		
		System.out.println(fraseNueva);
		ingreso.close();
	}
    }
    

