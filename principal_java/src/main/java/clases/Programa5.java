package clases;



import java.util.Scanner;

/**
 * Created by fabio on 22/02/2018.
 */

public class Programa5 {
    int num;
    Scanner sc =new Scanner(System.in);
    public void dobletriple(){
        System.out.println("dame un numero");
        num = sc.nextInt();
       if(num<50) {
           System.out.println("El doble del numero es: "+(num*2));
       }
       else {
           if(num>=50){
               System.out.println("El triple del numero es: "+(num*3));
           }

       }
    }

    
}
