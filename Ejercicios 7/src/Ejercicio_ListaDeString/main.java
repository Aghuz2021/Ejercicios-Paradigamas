package Ejercicio_ListaDeString;

import java.util.*;

public class main {
    //Lista de strings
    public static void main(String[] args) {

        List<String> nombresList = new LinkedList<>();
            nombresList.add("Agus");
            nombresList.add("Mario");
            nombresList.add("Juan");
            nombresList.add("Leo");
            nombresList.add("Luciano");
            nombresList.add("Mariano");
            nombresList.add("Leo");
            nombresList.add("Cletus");
            nombresList.add("Michael");
            nombresList.add("Michael");
            nombresList.add("Roberto");
            nombresList.add("Michael");
            nombresList.add("Lili");

        System.out.println("ITERACION FOR NORMAL:");
        for (int i = 0; i < nombresList.size(); i++) {
            System.out.println(" Name:"+  nombresList.get(i) + ", ");

        }
        System.out.println("ITERACION FOR COLLECCIONES:");
        for (String nombre  : nombresList) {
            System.out.println("Name:" + nombre + ", ");

        }

        System.out.println("INSERTO NUEVO NOMBRE EN BASE A SU INDICE");
            nombresList.set(3, "Maradona");
            nombresList.set(0, "Santiado B");
            System.out.println(nombresList);

        System.out.println("\nREMUEVO UN NOMBRE EN BASE A SU INDICE");
            nombresList.remove(8);
            nombresList.remove("Michael");
            System.out.println(nombresList);
            System.out.print("¿El nombre Michael esta?-> ");
            System.out.println(nombresList.contains("Michael"));

        borrarTodos("Michael", nombresList);
            System.out.println("\nNueva lista, Se elimino todos los nombres de Michael");
            System.out.println(nombresList);
            System.out.print("¿El nombre Michael esta?-> ");
            System.out.println(nombresList.contains("Michael"));
    }

    public static List<String> borrarTodos(String nombre, List<String> lista) {
        int contador = 0;
        for (String elemento : lista) {
            if (elemento.equals(nombre)) {
                contador++;
            }
        }
        for (int i = 0; i <= contador; i++) {
            lista.remove(nombre);
        }

        return lista;
    }

}