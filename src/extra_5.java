
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
public class extra_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
           System.out.println("Ingrese la opcion de socio:");
        String op=leer.next();
        System.out.println("Ingrese el valor del tratamiento");
        int val=leer.nextInt();
        switch(op){
            case "A":
                System.out.println("El valor con el descuento es de: "+(val-(val*50/100)));
                break;
            case "B":
                System.out.println("El valor con el descuento es de: "+(val-(val*35/100)));
                break;
            case "C":
                System.out.println("No recibe descuento, el valor es:"+ val);
                break;
        }
                
    }
    
}
    


