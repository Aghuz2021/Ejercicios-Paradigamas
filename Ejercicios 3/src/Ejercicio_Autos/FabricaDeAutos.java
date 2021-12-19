package Ejercicio_Autos;

import Ejercicio_Autos.Autos.Auto;

public class FabricaDeAutos {
    private static int anio;
    private String marca;

    public FabricaDeAutos(String marca) {
        this.marca = marca;
    }

    public static int getAnio() {return anio;}

    static void setAnio(int anio) {FabricaDeAutos.anio = anio;}

    public String getMarca() {return marca;}

    private void setMarca(String marca) {this.marca = marca;}

    public Auto fabricarAutos(String modelo)  {
        if(anio == 0) {
            return null;
        }
        Auto auto = new Auto(this.marca, modelo, FabricaDeAutos.anio);
        return auto;
    }
}
