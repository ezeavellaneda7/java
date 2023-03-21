
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
public class extra_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de nros");
        int cantnro=leer.nextInt();
        int nro, cont=cantnro, max=0, min=9999;
        double suma=0;
        while(cont>0){
            System.out.println("Ingrese los nros");
            nro=leer.nextInt();
            cont--;
            if(nro>max){
               max=nro; 
            } else{
                
            } if(nro<min){
                min=nro;
            }
           suma+=nro; 
            
        }
         System.out.println("El numero maximo es: " + max + " El numero minimo es: " + min + " y el promedio es:" + suma/cantnro);        
    }

}
