package Ejercicio_Error;

public class Error {
    public  static  void  main ( String [] args ) {
        try {
            int contador = 1;
            for (int i = 1; i > 0; i *=1000) {
                int[] enteros = new int[i];
                System.out.println("Array " + contador + ": " + enteros);
                contador++;
            }
        } catch(OutOfMemoryError e) {}
    }
    }

