
import java.util.Scanner;

/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.
 */

/**
 *
 * @author Admin
 */
public class ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un nro");
        int nromax = leer.nextInt();
        int suma=0, nro;
        do {
        System.out.println("Ingrese los nros a sumar ");
         nro= leer.nextInt();
         suma+=nro;
            System.out.println("suma= " + suma );    
         }  while(nromax>=suma);
    }          
}    
    

