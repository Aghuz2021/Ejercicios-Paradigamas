package Ejercicio_Animales;

public class Panda extends Oso{

    public Panda(String nombre) {
        super(nombre);
    }

    @Override
    public void descrbir() {
        super.descrbir();
        System.out.println("  METODO describir \n DESDE LA CLASE Panda \n  " );
    }
}
