
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
public class extra_8 {
       /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese numeros");
        int n;
        int contP=0, contI=0, cont=0;
        do {            
            n=leer.nextInt();
            if (n>0) {
                cont=cont+1;
            }
            if (n%2==0) {
                contP=contP+1;
            } else {
                contI=contI+1;
            }
        } while (n%5!=0);
        System.out.println("Cantidad de numeros leidos: "+cont);
        System.out.println("Cantidad de numeros pares:"+contP);
        System.out.println("Cantidad de numeros impares:"+contI);
    }
}
               

             
                  
                  
        
              
     
            
              
        
      
        
    


