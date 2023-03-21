
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
public class ej_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nro");
        int nro = leer.nextInt();
        
        for (int i=0; i<nro; i++ ){
           for(int j=0; j<nro;j++){
               if(i==0 || i==nro -1|| j==0||j==nro-1 ){
                   System.out.print("*");
                   
               }else{
                   System.out.print(" ");
               } 
                   
           } 
            System.out.println("");
        }
                
                   
        
    }
    
}
