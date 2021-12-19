package Ejercicio_Equals2;

public class main {
    public static void main(String [] args) {
        Persona Agus= new Persona(123123, true, "Agus");
        Persona Leo = new Persona(123123, true, "Leo");

System.out.println("Según la definicion si dos objetos Persona tienen el mismo DNI y sexo, deben ser la misma persona.\n" +
        "Aca demostramos que Agus y Leo al tener mismo DNI Y SEXO son la misma persona: ");
        System.out.println("RESULTADO DEL COMPARABLE: -> "+ Agus.equals(Leo));

        /* No fue una buena decisión,
         * El problema que trajo adjudicar el mismo DNI a mas de una persona, fue que
         * al momento de unificar los registros de hombres y mujeres en un mismo sistema,
         * aquellos DNI repetidos pasaron de ser un dato alfanumérico, entrando en conflicto
         * con algunos sistemas informáticos de la actualidad  que  sobreentienden que
         * el DNI es un tipo de dato numérico.
         * */
    }
}

