package Ejercicio_veterinario;

public class Veterinario {
    public static void main(String [] args) {

        Animal firulais = new Animal();
        Animal gardfield = new Animal();

        Alimento carneRoja = new Alimento();
        Alimento pollo = new Alimento();

        carneRoja.setNombre("Carne roja");
        carneRoja.setPeso(0.5f);
        carneRoja.setEspecie("gato");

        carneRoja.describirAlimento();

        pollo.setNombre("Pollo");
        pollo.setPeso(1.5f);
        pollo.setEspecie("perro");

        pollo.describirAlimento();



        firulais.setId(123456789);
        firulais.setEspecie("perro");
        firulais.setNombre("Firulais");
        firulais.setAltura(60.6f);
        firulais.setPeso(30.5f);
        firulais.setSonido("guau");

        firulais.presentarAnimal();

        firulais.comer(carneRoja);
        firulais.comer(pollo);

        gardfield.setId(987654310);
        gardfield.setEspecie("gato");
        gardfield.setNombre("Gardfield");
        gardfield.setAltura(25.80f);
        gardfield.setPeso(10.5f);
        gardfield.setSonido("miau");

        gardfield.presentarAnimal();

        gardfield.comer(pollo);
        gardfield.comer(carneRoja);


    }
}
