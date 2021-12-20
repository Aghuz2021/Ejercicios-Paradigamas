package Ejercicio_Preguntas;

public class Main {

    public static void main(String[] args) {
        Ejemplo ejemplo = new Ejemplo(null, null, 0);

        String ficha1 = ejemplo.componerFicha("Juan", "Perez", 30);
        System.out.println(ficha1);

        String ficha2 = ejemplo.componerFicha("Juan", "Perez");
        System.out.println(ficha2);


        String ficha3 = ejemplo.componerFicha("Juan");
        System.out.println(ficha3);


        //Esta subclase agrega el argumento domicilio

        SubEjemplouno ejemploUno = new SubEjemplouno("", null, 0, "Av rivadavia 12345");


        String fichaUno1 = ejemploUno.componerFicha("Juan", "Lopez", 40);
        System.out.println(fichaUno1);

        String fichaUno2 = ejemploUno.componerFicha("Juan", "Lopez");
        System.out.println(fichaUno2);


        String fichaUno3 = ejemploUno.componerFicha("Juan");
        System.out.println(fichaUno3);

        System.out.println("");
        //Esta subclase agrega el argumento telefono

       SubEjemplodos ejemploDos= new SubEjemplodos(null, null, 0, 1512341234);


        String fichaDos1 = ejemploDos.componerFicha("Juan", "Garcia", 50);
        System.out.println(ficha1);

        String fichaDos2 = ejemploDos.componerFicha("Juan", "Garcia");
        System.out.println(fichaDos2);


        String fichaDos3 = ejemploDos.componerFicha("Juan");
        System.out.println(fichaDos3);


        ejemploDos.setNombre("Maria");
        ejemploUno.setNombre("Jose");
        String nombreUno = ejemploUno.nombre;
        String nombreDos = ejemploDos.nombre;
        System.out.println("\n Nombre ejemplos1: " + nombreUno + "\n Nombre ejemplo2: " + nombreDos);


    }
}