package clases;

import java.util.Scanner;

/**
 * Created by fabio on 26/02/2018.
 */

public class Programa7 {
    int num;
    Scanner sc = new Scanner(System.in);

    public void numerosRomanos(){
        System.out.println("Introduce un numero entre 1 y 7 ");
        num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            default:
                System.out.println("error");

        }
    }
}
