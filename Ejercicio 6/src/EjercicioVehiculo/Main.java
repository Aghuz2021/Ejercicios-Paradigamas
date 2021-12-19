package EjercicioVehiculo;
public class Main {
    public static void main(String[] args) {
        Lancha lancha1 = new Lancha();
        Auto auto1 = new Auto();
        Helicoptero helicoptero1 = new Helicoptero();
        Avion avion1 = new Avion();

        Vehiculo unVehiculo = lancha1;
        unVehiculo= auto1;
        //unVehiculo = helicoptero1;
        //unVehiculo = avion1;

        Vehiculo.hacerVolar(unVehiculo);

       /* if (unVehiculo instanceof Vehiculo.Volador) {
            Vehiculo.Volador volador1 = (Vehiculo.Volador) unVehiculo;
        } else System.out.println("No se puede castear");*/
    }
}