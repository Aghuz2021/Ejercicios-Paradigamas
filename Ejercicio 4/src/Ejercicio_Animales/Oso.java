package Ejercicio_Animales;

public class Oso extends Animal {
    protected static String especie = "Oso";
    protected String nombre;

    public Oso(String nombre) {
        super(nombre, Oso.especie);
        this.nombre = nombre;

    }

    public String hacerRuido() {
        return "Rrrrrr";

    }

    @Override
    public void descrbir() {
        super.descrbir();
        System.out.println("  METODO describir \n DESDE LA CLASE Oso \n  " +
                " Nombre de animal: " + nombre + " \n Especie: " + especie + "\n");
    }


    public static String getEspecie() {
        return especie;
    }



    private static void setEspecie(String especie) {
        Oso.especie = especie;
    }


    public String getNombre() {
        return nombre;
    }



    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
