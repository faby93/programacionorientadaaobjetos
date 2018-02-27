package clases;

/**
 * Created by fabio on 20/02/2018.
 */

public class Carro {
    int modelo;

    public String color;
    public String nombre;
    public Carro(String nombre){
        this.nombre=nombre;
    }
        public void datosVehiculo(){
        int y=90;
            System.out.println("Modelo "+modelo+" "+nombre);
            System.out.println("Velocidad"+y+"km");

        }
        public void setModelo(int m){

            modelo=m;
        }

    public void setColor(String color) {
        this.color= color;
    }
}
