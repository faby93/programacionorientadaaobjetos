package clases;


import java.util.Scanner;

/**
 * Created by fabio on 22/02/2018.
 */

public class Programa1 {
    float base,altura,area;
    Scanner sc = new Scanner(System.in);

    public void AreaTriangulo()
    {
        System.out.println("ingrese a la base");
        base = sc.nextFloat();
        System.out.println("ingresa la altura");
        altura = sc.nextFloat();
        area = (base*altura)/2;
        System.out.println("El area del triangulo es: "+area);
    }
}
