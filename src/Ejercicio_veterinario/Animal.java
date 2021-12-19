package Ejercicio_veterinario;

public class Animal {
    private long id;
    private String nombre;
    private String especie;
    private float altura;
    private float peso;
    private String sonido;
    private Alimento alimento;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSonido(){
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public Alimento getAlimento(Alimento alimento) {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public void presentarAnimal() {
        System.out.println(" Hola !! soy " + nombre + ",\n soy un: " + especie + ", \n mido: "
                + altura + " cm" + ", \n peso: " + peso +" kg" + ", \n hago: "
                + sonido + "\n");

    }

    public void comer(Alimento alimento) {
        if (alimento.getEspecie().equals(this.getEspecie())) {
            float pesoTotal = peso + alimento.getPeso();

            System.out.println(" Soy " + nombre + ", \n y comí  " + alimento.getPeso()
                    + " kg de " + alimento.getNombre() +  ", \n por lo tanto ahora peso: "
                    + pesoTotal + " kg \n");
        } else {
            System.out.println(" " + nombre + ": Yo no como " + alimento.getNombre() + " \n");
        }
    }
}
