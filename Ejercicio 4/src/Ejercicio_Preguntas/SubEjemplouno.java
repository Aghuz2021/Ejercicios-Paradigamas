package Ejercicio_Preguntas;

public class SubEjemplouno extends Ejemplo{

    private String domicilio;


    public SubEjemplouno(String nombre, String apellido, int edad,  String domicilio) {
        super(nombre, apellido, edad);
        this.domicilio = domicilio;
    }

    //Ejemplo de sobreescritura: Sobreescribir métodos heredados permite definir comportamientos específicos para cada subclase

    @Override
    public String componerFicha(String nombre, String apellido, int edad) {
        String ficha = "SubEjemploUno: \n Nombre: " + nombre + " " + apellido + "\n  Edad: " + edad +  "\n Domicilio: " + domicilio;
        return ficha;
    }


    @Override
    public String componerFicha(String apellido, String nombre) {
        String ficha = "SubSubEjemploUno: \n Nombre: " + nombre + " " + apellido +  "\n Domicilio: " + domicilio;
        return ficha;
    }

    @Override
    public String componerFicha(String nombre) {
        String ficha = "SubEjemploUno: \n Nombre: " + nombre + " " + "\n Domicilio: " + domicilio;
        return ficha;
    }


}
