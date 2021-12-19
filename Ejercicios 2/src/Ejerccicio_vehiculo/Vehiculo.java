package Ejerccicio_vehiculo;

public class Vehiculo {
    protected String nombre;
    protected int cantidadRuedas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public void describirVehiculo() {
        System.out.println("  Este vehiculo es un/a: " + nombre +
                ", \n  y tiene " + cantidadRuedas + " ruedas.");
    }
}
