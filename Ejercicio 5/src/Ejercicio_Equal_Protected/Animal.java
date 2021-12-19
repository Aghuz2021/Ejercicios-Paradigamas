package Ejercicio_Equal_Protected;

public class Animal {
    protected String especie;
    protected Integer peso;
    private static int contador;

    public Animal(String especie, Integer peso) {
        this.especie = especie;
        this.peso = peso;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Animal.contador = contador;
    }

    public void alimentar(Integer peso) {
        this.contador++;
        this.peso  = this.peso + peso;
        System.out.println(this.especie + ": despues de comer peso: " + this.peso);
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return this.peso == animal.peso && this.especie == animal.especie;
    }


}
