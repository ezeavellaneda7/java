
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
public class extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         int A=1 ,B=2 ,C=3 , D=4,aux ;
    
        System.out.println(A + "-" + B + "-" + C + "-" + D);
    
    aux=B;
    B=C;
    C=A;
    A=D;
    D=aux;
    
        System.out.println(A + "-" + B + "-" + C + "-" + D);
    }
    
}
