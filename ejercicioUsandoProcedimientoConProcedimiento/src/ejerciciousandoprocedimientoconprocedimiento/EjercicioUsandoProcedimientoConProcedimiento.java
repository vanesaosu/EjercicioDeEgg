/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciousandoprocedimientoconprocedimiento;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class EjercicioUsandoProcedimientoConProcedimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int a,b;
        
       System.out.println("ingrese un numero");
       a= leer.nextInt();
       System.out.println("ingrese otro  numero");
       b= leer.nextInt();
       resultado(a,b);
       
       
        
    }
    public static void resultado(int a, int b){
        if( a % b == 0){
           System.out.println(a + "es multiplo de " + b); 
        } else{
            System.out.println(a + "no es multiplo de "+ b);
        }
    }
    
}
