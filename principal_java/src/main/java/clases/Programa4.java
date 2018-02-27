package clases;

import java.util.Scanner;

/**
 * Created by fabio on 22/02/2018.
 */

public class Programa4 {
int hora;
    Scanner sc =new Scanner(System.in);
public void convertirhora(){
    System.out.println("dame la hora");
    hora=sc.nextInt();
    if (hora>24){
        System.out.println("hora invalida");
    }
    if(hora<12){
        System.out.println("Son las "+ hora+"");
    }
    else{
        System.out.println("Son las "+ (hora-12));
    }
}
}
