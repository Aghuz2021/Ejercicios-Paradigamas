package EjercicioVehiculo;

public abstract class Vehiculo {
    private  static boolean esVolador(Vehiculo unVehiculo){
        if (unVehiculo instanceof Volador) return true;
        else return false;
    }
    public static void hacerVolar(Vehiculo unVehiculo) {
        if (unVehiculo instanceof Volador) {
            ((Volador) unVehiculo).volar();
        } else System.out.println("Este vehiculo no vuela");
    }
}
