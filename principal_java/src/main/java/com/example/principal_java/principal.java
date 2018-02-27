package com.example.principal_java;

import java.util.Scanner;

import clases.Carro;
import clases.Motocicleta;
import clases.Programa1;
import clases.Programa10;
import clases.Programa2;
import clases.Programa3;
import clases.Programa4;
import clases.Programa5;
import clases.Programa6;
import clases.Programa7;
import clases.Programa8;
import clases.Programa9;

public class principal {
    public static void main(String[] args) {
        /*
       //Carro Nuevo
        Carro cnuevo= new Carro("mazda");
        cnuevo.setModelo(2000);
        cnuevo.datosVehiculo();
        System.out.println();

        //Carro Usado
        Carro cusado =new Carro("Nissan");
        cusado.setModelo(1990);
        cusado.setColor("rojo");
        cusado.datosVehiculo();

        //Motocicleta
        Motocicleta moto=new Motocicleta("generica");
        moto.setColor("amarilla");
        moto.setModelo(2000);
        moto.datosVehiculo();
        moto.setCasco(true);
        moto.setCantGasolina(20);
        imprimeAutos(cnuevo,moto,cusado);
*/

/*

        //Programa 1
        Programa1 p1 = new Programa1();
        p1.AreaTriangulo();

        //Programa 2
       Programa2 P2 =new Programa2();
        P2.calcularporciento();

        //Programa 3
        Programa3 P3 =new Programa3();
        P3.conversion();*/

        //Programa 4
        /*Programa4 P4= new Programa4();
        P4.convertirhora();*/


        //Programa 5
       /* Programa5 P5 = new Programa5();
        P5.dobletriple();*/

        //Programa 6
        /*Programa6 P6 = new Programa6();
        P6.pares();*/

        //Programa 7
        /*Programa7 P7 = new Programa7();
        P7.numerosRomanos();*/

        //Programa 8
        /*Programa8 P8 = new Programa8();
        P8.nombres();

        Programa9 P9 = new Programa9();
        P9.serie();*/

        /*Programa10 P10 = new Programa10();
        P10.factorial();*/
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Area del Triangulo");
        System.out.println("2. IVA");
        System.out.println("3. Conversión de Grados");
        System.out.println("4. Notación de la Hora");
        System.out.println("5. El doble y el triple");
        System.out.println("6. Pares");
        System.out.println("7. Numeros Romanos");
        System.out.println("8. Repetición de nombres");
        System.out.println("9. Del 1 al 500");
        System.out.println("10. Factorial");
        System.out.println();
        System.out.println("Dame una opcion");

        int opcion = sc.nextInt();

        switch (opcion){
            case 1:
                Programa1 p1 = new Programa1();
                p1.AreaTriangulo();
                break;
            case 2:
                Programa2 p2 = new Programa2();
                p2.calcularporciento();
                break;
            case 3:
                Programa3 p3 = new Programa3();
                p3.conversion();
                break;
            case 4:
                Programa4 p4 = new Programa4();
                p4.convertirhora();
                break;
            case 5:
                Programa5 p5 = new Programa5();
                p5.dobletriple();
                break;
            case 6:
                Programa6 p6 = new Programa6();
                p6.pares();
                break;
            case 7:
                Programa7 p7 = new Programa7();
                p7.numerosRomanos();
                break;
            case 8:
                Programa8 p8 = new Programa8();
                p8.nombres();
                break;
            case 9:
                Programa9 p9 = new Programa9();
                p9.serie();
                break;
            case 10:
                Programa10 p10 = new Programa10();
                p10.factorial();
                break;
            default:
                System.out.println("Opcion Incorrecta");




        }




}

    public static void imprimeAutos(Carro ...c){
        System.out.println();
        System.out.println("imprimiendo");
        for(Carro carro:c)
            carro.datosVehiculo();
    }












}

