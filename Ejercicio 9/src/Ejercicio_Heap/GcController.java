package Ejercicio_Heap;
import Ejercicio_Stack.Pila;
public class GcController {
    public static void main(String[] args) {

        //tres variables con objetos distintos
        Pila pila1 = new Pila(1);
        Pila pila2 = new Pila(2);
        Pila pila3 = new Pila(3);

        //una variable que tiene tres objetos sucesivos distintos
        Pila pila = new Pila(0);
        pila1 = pila2;
        pila1 = pila3;
        pila1 = pila;

        //tres variables que apunten al mismo mobjeto
        pila3 = pila1;
        pila2 = pila1; //los objetos con par�metros 1,2 y 3 ser�an recolectados

        crearYRecoectar(1);
        crearMil();
    }

    private static void crearMil() {
        //crea 1000 objetos que no son recolectados por el gc
        Pila pila = new Pila(0);
        Pila temp;

        for (int i = 0; i < 1000; i++) {
            temp = new Pila(i);
//			referencias a objetos para que no sean recolectados
//			temp.pila = pila;
//			pila = temp;
            System.gc();
            System.out.println(pila);
            i++;
        }
    }

    private static Pila crearYRecoectar(int numero) {
        //crea un objeto que ser� recolectado por el gc
        Pila b = new Pila(0);
        Pila a = new Pila(numero);
        b = a;
        System.gc(); //gc recolecta el objeto que contiene el 0
        return a;
    }
}
