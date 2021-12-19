package Ejerccicio_vehiculo;

public class Instanciador {
    public static void main(String [] args) {

        Vehiculo harleyDavidson = new Moto();
        harleyDavidson.setNombre("Harley-Davidson");
        harleyDavidson.setCantidadRuedas(2);

        //no reconoce el método de subclase Moto por que es un Vehiculo
        //harleyDavidson.setCilindrada(200.3f);

        Moto harley = new Moto();
        harley.setCilindrada(200.3f); // este objeto SI es una Moto
        harley.setNombre("Harley");

        Auto Bmw = new Auto();
        Bmw.setNombre("bmw");
        Bmw.setCantidadRuedas(4);
        Bmw.setCantidadPuertas(5);

        Bmw.describirVehiculo();

        String nombreHarley = harley.nombre;
        String nombreMercedes = Bmw.nombre;
        System.out.println("\n Nombre de Moto: " + nombreHarley + "\n Nombre de Auto: "+ nombreMercedes);
    }
}
