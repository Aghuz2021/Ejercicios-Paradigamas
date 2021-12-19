package Ejercicio_Equal_Protected;

public class Perro extends Animal{
    private String raza;

    private Perro(String especie, Integer peso, String raza) {
        super(especie, peso);
        this.raza = raza;
    }

    public static Perro crearPerro(String especie, Integer peso, String raza) {
        return new Perro(especie,peso,raza);
    }

    @Override
    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        Perro perro = (Perro) o;
        return this.raza == perro.raza;
    }

}
