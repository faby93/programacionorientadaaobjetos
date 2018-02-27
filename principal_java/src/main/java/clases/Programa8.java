package clases;

import java.util.Scanner;

/**
 * Created by fabio on 26/02/2018.
 */

public class Programa8 {
    String nombre = "";
    int numero;
    Scanner sc = new Scanner(System.in);

    public void nombres() {

        System.out.println("Dame Nombre ");
        nombre = sc.nextLine();
        System.out.println("Dame numero para repetir nombre");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(nombre);
        }

        System.out.println("el nombre se repitio "+numero+" veces");



    }
}
