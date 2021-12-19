package Ejercicio_Equal_Protected;

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal("Ave", 10);
        Animal animal2 = new Animal("Ave", 10);

        animal.alimentar(2);
        System.out.println("Se llamo al metodo alimentar: " + Animal.getContador()+" veces");


        Perro perro = Perro.crearPerro("Mamifero", 15, "Coker");
        Perro perro2 = Perro.crearPerro("Mamifero", 15, "Caniche");


        perro.alimentar(2);
        System.out.println("Se llamo al metodo alimentar: " + Animal.getContador()+" veces");

        System.out.println("\nequals de animal: "  + animal.equals(animal2));
        System.out.println("equals de perro: " + perro.equals(perro2));
    }
}
