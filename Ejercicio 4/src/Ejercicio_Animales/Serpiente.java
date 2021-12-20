package Ejercicio_Animales;

public class Serpiente extends Animal {

    private static String especie = "Serpiente";
    private String nombre;


    public Serpiente(String nombre) {
        super(nombre, Serpiente.especie);
        this.nombre = nombre;

    }


    public String hacerRuido() {
        return "S s s s s";

    }

    @Override
    public void descrbir() {
        super.descrbir();
        System.out.println("  METODO describir \n DESDE LA CLASE Serpiente \n  " +
                " Nombre de animal: " + nombre + " \n Especie: " + especie + "\n");
    }


    public static String getEspecie() {
        return especie;
    }



    private static void setEspecie(String especie) {
        Serpiente.especie = especie;
    }


    public String getNombre() {
        return nombre;
    }



    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
