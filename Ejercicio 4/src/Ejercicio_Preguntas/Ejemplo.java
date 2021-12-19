package Ejercicio_Preguntas;

public class Ejemplo {
    protected String nombre;
    protected String apellido;
    protected int edad;


    public String getNombre() {return nombre;}
    protected void setNombre(String nombre) {this.nombre = nombre;}




    public Ejemplo(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    //Ejemplo de sobrecarga: La sobrecarga de métodos permite construir varios métodos con el mísmo nombre y diferente
    //cantidad, tipo y orden de argumentos


    public String componerFicha(String nombre, String apellido, int edad) {
        String ficha = "Ejemplo: \n Nombre: " + nombre + " " + apellido + "\n  Edad: " + edad;
        return ficha;
    }


    public String componerFicha(String apellido, String nombre ) {
        String ficha = "Ejemplo: \n Nombre: " + nombre + " " + apellido;
        return ficha;
    }

    public String componerFicha(String nombre) {
        String ficha = "Ejemplo: \n Nombre: " + nombre;
        return ficha;

    }


}
