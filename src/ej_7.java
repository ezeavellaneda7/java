
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
public class ej_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int errores=-1, correctos=0;
        String palabra;         
        String inicial, fin; int letras;
        
         do {
        System.out.println(" Ingrese una palabra");
       palabra= leer.nextLine();
        inicial=palabra.substring(0,1);
        letras= palabra.length();
        fin=palabra.substring(letras-1,letras);
            
        if(palabra.length()>5 || ! inicial.equals("x") || ! fin.equals("o")){
        errores=errores+1;  
        }
        else { 
            correctos=correctos+1;
        
        }
    
    } while
                 (!palabra.equals("&&&&&"));
        System.out.println("Los intentos correctos fueron: " +correctos);
        System.out.println("Los intentos incorrectos fueron: " +errores);
        
                    
             
                
    }
    
}
