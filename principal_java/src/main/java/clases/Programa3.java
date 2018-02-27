package clases;

import java.util.Scanner;

/**
 * Created by fabio on 22/02/2018.
 */

public class Programa3 {
    double k,f,c;
    Scanner sc = new Scanner(System.in);


    public void conversion(){
        System.out.println("ingrese los grados centigrados");
        c = sc.nextFloat();
        k = c + 273;
        f = (c*1.8)+32;
        System.out.println("grados kelvin "+k);
        System.out.println("grados farenheit "+f);
    }


}
