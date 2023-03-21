
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ej_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
       System.out.print("Ingrese un número entero: ");
        int num= leer.nextInt();
        if ((num % 2)==0) {
            System.out.println("El número " + num + " es par.");
        } else{
            System.out.println("El número " + num + " es impar.");
        }
    }
    }
    

