package Ejercicio_Animales;

public class Main {
    public static void main(String[] args) {

        Animal serpienteLili = new Serpiente("lili");
        serpienteLili.descrbir();

        Animal serpienteManu = new Serpiente("MANU");
        serpienteManu.descrbir();

        Animal osoPablo = new Oso("Pablo");
        osoPablo.descrbir();

        Animal osoFrodo = new Oso("FRODO");
        osoFrodo.descrbir();

        Animal pandaAgustin = new Panda("AGUSTIN");
        pandaAgustin.descrbir();

        Animal.agregarAnimal(pandaAgustin);
        Animal.agregarAnimal(serpienteManu);
        Animal.agregarAnimal(osoFrodo);
        Animal.agregarAnimal(serpienteLili);
        Animal.agregarAnimal(osoPablo);

        Animal.escucharTodos(Animal.getListaDeAnimales());



        //Animal animal = new Animal("Carlos");  // no se puede crear una instancia de animal

        String Frodo = osoFrodo.nombre;
        String Agustin = pandaAgustin.nombre;
        String Lili = serpienteLili.nombre;
        System.out.println("\n oso: " + Frodo + "\n panda: " + Agustin + "\n serpiente: " + Lili);
    }
}
