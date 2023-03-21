
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
public class ej_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         {
        double num1, num2;
        int opcion;
        
     do{

         System.out.println("MENU:");
         System.out.println("1. Sumar");
         System.out.println("2. Restar");
         System.out.println("3. Multiplicar");
         System.out.println("4. Dividir");
         System.out.println("5. Salir");
         System.out.println("Elija un a opción: ");
         opcion = leer.nextInt();
         
         switch(opcion) {
         case 1: 
                System.out.println("Ingrese un numero positivo: ");
                num1 = leer.nextInt();
                System.out.println("Ingrese otro numero positivo: ");
                num2 = leer.nextInt();
                System.out.println("La suma de los numkeros es: " + (num1+num2) );
                break;
         case 2: 
                System.out.println("Ingrese un numero positivo: ");
                num1 = leer.nextInt();
                System.out.println("Ingrese otro numero positivo: ");
                num2 = leer.nextInt();
                System.out.println("La resta de los numeros es: " + (num1-num2));
                break;
         case 3: 
                System.out.println("Ingrese un numero positivo: ");
                num1 = leer.nextInt();
                System.out.println("Ingrese otro numero positivo: ");
                num2 = leer.nextInt();
                System.out.println("La multiplicacion de los nume3ros es: " + (num1*num2));
                break;
         case 4: 
                System.out.println("Ingrese un numero positivo: ");
                num1 = leer.nextInt();
                System.out.println("Ingrese otro numero positivo: ");
                num2 = leer.nextInt();
                System.out.println("La division de los numeros es: " + (num1/num2));
                break;
         case 5: System.out.println("Adios");
         break;
         default: System.out.println("Opcion incorrecta."); 
        }
         System.out.println("");
     }
     while(opcion != 5);
         
     }
    

    
}
    }
    

