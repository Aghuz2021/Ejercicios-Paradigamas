package Ejercicio_veterinario;

public class Alimento {

    private String nombre;
    private String especie;
    private float peso;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void describirAlimento() {
        System.out.println(" " + nombre + ":" + " Este alimento es para la especie: "
                + especie + ", \n y tiene un peso de:  " + peso + " kg. \n");
    }

}
