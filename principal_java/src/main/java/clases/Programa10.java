package clases;

import java.util.Scanner;

/**
 * Created by fabio on 27/02/2018.
 */

public class Programa10 {
    int numero,total=1;
    Scanner sc = new Scanner(System.in);
    public void factorial(){
        System.out.println("Introduce un numero ");
        numero = sc.nextInt();
        for (int i = 1; i<=numero; i++){
            total = total * i;
        }
        System.out.println("El factorial del numero es "+total);
    }
}
