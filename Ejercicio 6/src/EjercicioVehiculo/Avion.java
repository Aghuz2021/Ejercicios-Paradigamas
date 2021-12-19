package EjercicioVehiculo;

public class Avion extends Vehiculo implements Volador{

    @Override
    public void volar() {
        System.out.println("Vehiculo.Avion volando");

    }
}
