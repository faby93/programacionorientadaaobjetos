package clases;

/**
 * Created by fabio on 26/02/2018.
 */

public abstract class Conductor  implements OperacionesDatos{
    public void metodo1(){
        System.out.println("Es el metodo 1");
    }
    @Override
    public void aumentar(){
        System.out.println("Esta Aumentando!");
    }

    public abstract void comoConducir();


}
