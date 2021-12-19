package Ejercicio_Futbol;

public class Futbolista {
    private String nombre;
    private String equipo;
    private int cantidadGoles;
    private static  Futbolista maximoGoleador = null;

    public Futbolista(String nombre, String equipo, int cantidadGoles) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.cantidadGoles = cantidadGoles;
    }

    public String getNombre() {return nombre;}

    private void setNombre(String nombre) {this.nombre = nombre;}

    public String getEquipo() {return equipo;}

    private void setEquipo(String equipo) {this.equipo = equipo;}

    public int getCantidadGoles() {return cantidadGoles;}
    public static Futbolista getMaximoGoleador() {return maximoGoleador;}

    static void setMaximoGoleador(Futbolista maximoGoleador) {
        Futbolista.maximoGoleador = maximoGoleador;
    }

    public void anotarGol() {
        this.cantidadGoles++;

        if (this.cantidadGoles > Futbolista.maximoGoleador.cantidadGoles) {
            Futbolista.setMaximoGoleador(this);
        }

    }
}
