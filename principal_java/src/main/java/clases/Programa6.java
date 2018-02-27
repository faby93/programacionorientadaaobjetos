package clases;

import java.util.Scanner;

/**
 * Created by fabio on 26/02/2018.
 */

public class Programa6 {
    int numero;
    Scanner sc = new Scanner(System.in);
    public void pares(){
        System.out.println("Dame numero");
        numero = sc.nextInt();
        if(numero%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
