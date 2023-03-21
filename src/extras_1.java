
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
public class extras_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        
        int dias=0, horas=0, min;
        
        

        System.out.println("Ingrese el tiempo en minutos");

        min = leer.nextInt();

        do {
            dias = dias + 1;
            min = min - 1440;
        } while (min >= 1440);

        do {
            horas = horas + 1;
            min = min - 60;
        } while (min >= 60);

       System.out.println("Los días son: " +dias);
            System.out.println("Las horas son: " +horas);
            System.out.println("Los minutos son: "+min);       
        }
            
        }      
             
        
        
                        
        
        
            
             
    
  
    

