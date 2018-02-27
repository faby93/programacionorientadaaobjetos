package clases;

/**
 * Created by fabio on 21/02/2018.
 */

public class Motocicleta extends Carro implements OperacionesDatos{
    boolean casco;
    int cantGasolina;
    public Motocicleta() {
        super("TINTO");
    }

    public Motocicleta(String nombre){
        super(nombre);
    }

    @Override
    public void datosVehiculo(){
        super.datosVehiculo();
    }

    public boolean isCasco(){
        return casco;
    }

    public void setCasco(boolean casco){
        this.casco = casco;
    }

    public void setCantGasolina(int cantGasolina)
    {
        this.cantGasolina = cantGasolina;
    }

    @Override
    public void limpiar() {

    }

    @Override
    public void aumentar() {

    }

    @Override
    public void verificar() {

    }
}
