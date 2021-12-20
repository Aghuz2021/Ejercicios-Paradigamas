package Ejercicio_Preguntas;

public class SubEjemplodos extends Ejemplo {

    private long telefono;

    public SubEjemplodos(String nombre, String apellido, int edad, long telefono) {
        super(nombre, apellido, edad);
        this.telefono = telefono;
    }

    //Ejemplo de sobreescritura: Sobreescribir métodos heredados permite definir comportamientos específicos para cada subclase

    @Override
    public String componerFicha(String nombre, String apellido, int edad) {
        String ficha = "SubEjemploDos: \n Nombre: " + nombre + " " + apellido + "\n  Edad: " + edad +  "\n Telefono: " + telefono;
        return ficha;
    }


    @Override
    public String componerFicha(String apellido, String nombre) {
        String ficha = "SubEjemploDos: \n Nombre: " + nombre + " " + apellido + "\n  Edad: " + "\n Telefono: " + telefono;
        return ficha;
    }

    @Override
    public String componerFicha(String nombre) {
        String ficha = "SubEjemploDos: \n Nombre: " + nombre + " "   + "\n Telefono: " + telefono;
        return ficha;
    }


}
