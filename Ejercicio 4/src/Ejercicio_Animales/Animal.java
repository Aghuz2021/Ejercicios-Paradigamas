package Ejercicio_Animales;
import java.util.ArrayList;
import java.util.List;

abstract public class Animal {
    protected String nombre;
    protected String especie;
    protected static List<Animal> listaDeAnimales = new ArrayList<Animal>();

    public Animal(String nombre, String especie) {};

    public String getNombre() {return nombre;}

    private void setNombre(String nombre) {this.nombre = nombre;}

    public static List<Animal> getListaDeAnimales() {return listaDeAnimales;}

    private static void setListaDeAnimales(List<Animal> listaDeAnimales) {Animal.listaDeAnimales = listaDeAnimales;}

    abstract public String hacerRuido();

    public  void descrbir() {
        System.out.println(" Esta es una descripción de un animal");
    }

    public static void agregarAnimal(Animal animal) {
        Animal.getListaDeAnimales().add(animal);
    }

    public static void  escucharTodos(List<Animal> listaDeAnimales) {
        listaDeAnimales = Animal.getListaDeAnimales();

        for (Animal animal : listaDeAnimales) {
            System.out.println((animal.getNombre() + " hace: " + animal.hacerRuido()));
        }

    }
}
