package Ejercicio_Stack;

import java.util.LinkedList;
import java.util.List;
public class Pila {
    private static List<Integer> resultados = new LinkedList<>();
    int numero;
    public Pila pila;

    public Pila(int numero) {
        this.numero = numero;

    }

    public static void main(String[] args) {
        ejecutarOperacion(2,4,"resta");
    }

    public static void ejecutarOperacion(int n1, int n2, String operacion) {
        if(operacion.equals("suma")) {
            sumar(n1, n2);
        } else if (operacion.equals("resta")) {
            restar(n1, n2);
        } else {
            System.err.println("ingrese 'suma' o 'resta' ");
        }
    }

    public static int sumar(int a, int b) {
        castear(a);
        castear(b);
        Integer c = a + b;
        System.out.println(c);
        return c;
    }

    public static int restar(int a, int b) {
        castear(a);
        castear(b);
        Integer c = a - b;
        System.out.println(c);
        return c;
    }

    public static Integer castear(int a) {
        Integer b;
        b = (Integer) a;
        resgistrarResultado(b);
        return b;
    }

    public static List<Integer> resgistrarResultado(Integer b) {
        if (resultados == null) {
            resultados = new LinkedList<>();
        }
        resultados.add(b);
//		simula un ouTOfBounds
//		resultados.get(10);
        return resultados;
    }

//	elimina el objeto antes que el gc collector
//	@Override
//	protected void finalize() throws Throwable{
//		System.out.println("borrando objeto" + numero);
//		super.finalize();
//	}
}
