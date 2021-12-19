package Ejercicio_Stack;

public class StackOverflowError {

    public static void main(String[] args) {
        crearObjeto();
    }

    public static Pila crearObjeto() {
        Pila p = new Pila(1);
//		simula un StackOverFlow
//		crearObjeto();
        return p;
    }
}
