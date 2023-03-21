
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
public class extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra= leer.next();
        
        if(letra.equals("A")||letra.equals("E")||letra.equals("I")||letra.equals("O")||letra.equals("U")){
            System.out.println("Correcto");
        } else{ 
            System.out.println("Incorrecto");
            
        }
            
       
                
        
    }
    
}
