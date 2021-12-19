package Ejercicio_Autos;

import Ejercicio_Autos.Autos.Auto;

public class Instanciador {
    public static void main(String [] args) {

        Auto uno = new Auto("Fiat", "Uno", 1994);

        FabricaDeAutos.setAnio(2021); //si no se setea el año devuelve un null, si se quiere hacer getAnio de un null devuelve NullPointerException
        FabricaDeAutos fabrica = new FabricaDeAutos("Fiat");
        Auto duna = fabrica.fabricarAutos("Argos");

        System.out.println(duna.getAnio());

    }
}
