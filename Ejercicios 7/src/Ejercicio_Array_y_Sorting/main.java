package Ejercicio_Array_y_Sorting;
import java.util.*;
import static java.util.Arrays.sort;
public class main {
        public static void main(String[] args) {
            //Crear una lista de números desordenada
            // Usar java.util.Collections.sort(lista) para ordenar la lista
            //Usar el metodo lista.toArray() para convertir de lista a array.
            List<Integer> numerosDesordenados = new ArrayList<>();
            numerosDesordenados.add(7);
            numerosDesordenados.add(80);
            numerosDesordenados.add(13);
            numerosDesordenados.add(1);
            numerosDesordenados.add(30);

            System.out.println("LISTA DESORDENADA\n"+ numerosDesordenados);

            Collections.sort(numerosDesordenados);

            System.out.println("LISTA ORDENADA CON COLLECTIONS SORT\n"+ numerosDesordenados);

            //Uso el metodo toArray() para convertir de lista a array.
            Integer[] List_A_Array = new Integer[numerosDesordenados.size()];
            List_A_Array= numerosDesordenados.toArray(List_A_Array);
            System.out.print("IMPRIMO LOS VALORES DE LA CONVERCION DE LISTA A ARRAY\n[");
            for(int s : List_A_Array){
                System.out.print(s+ " ,");
            }
            System.out.print("]\n");
            System.out.println("-------------------------------------");

            //Crear un array de ints con varios valores.
            // Usar java.util.Arrays.sort(array) y ver que ordena el array.
            //Usar java.util.Arrays.asList(array) y transformar el array en una lista

            int[] arrayInts = {4, 8, 6, 9, 2, 3, 1};
                System.out.print("MUESTRO ARRAY DESORDENADO:\n[");
                    for(int arrayInt : arrayInts){
                        System.out.print(arrayInt+ " ,");
            }
                    System.out.print("]\n");

            //utilizo java.util.Arrays.sort(array) y ver que ordena el array.
            sort(arrayInts);
            System.out.print("MUESTRO ARRAY ORDENADO POR METODO SORT:\n[");
            for(int arrayInt : arrayInts){
                System.out.print(arrayInt+ " ,");
            }
            System.out.print("]\n");

            List Array_A_Lista = new ArrayList();
            Array_A_Lista = Arrays.asList(arrayInts);
            System.out.println("IMPRIMO LOS VALORES DE LA CONVERSION DE ARRAY A LISTA:\n"+ numerosDesordenados);
        }
    }

