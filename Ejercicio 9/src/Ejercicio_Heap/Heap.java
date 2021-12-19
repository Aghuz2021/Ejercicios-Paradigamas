package Ejercicio_Heap;
import Ejercicio_Stack.Pila;
import  java.util.ArrayList ;
import  java.util.List ;

public class Heap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        crearObjetosInfinito();
    }

    private static Pila crearObjetosInfinito() {
        int i = 0;
        Pila pila = new Pila(i);
        Pila temp;

        while (true) {
            temp = new Pila(i);
//			simula un OutOfMemory
//			temp.pila = pila;
//			pila = temp;
            System.out.println(pila);
        }
    }
}
