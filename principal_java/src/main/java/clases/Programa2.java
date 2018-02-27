package clases;

import java.util.Scanner;

/**
 * Created by fabio on 22/02/2018.
 */

public class Programa2 {
    float precioproducto; //El precio del producto Original
    float porcentaje; //El precio despues de aplicar el 16%
    float total;
    Scanner sc = new Scanner(System.in);

    public void calcularporciento(){
        System.out.println("ingresa el precio del producto");
        precioproducto = sc.nextInt();
        porcentaje = (16*precioproducto)/100;
        total = precioproducto + porcentaje;
        System.out.println("El precio de producto con iva es: "+total);
    }



}
