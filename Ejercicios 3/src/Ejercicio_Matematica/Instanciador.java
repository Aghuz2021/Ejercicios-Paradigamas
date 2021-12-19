package Ejercicio_Matematica;

public class Instanciador {
    public static void main(String[] args) {
        int suma = Matematica.sumar(5, 4);
        System.out.println(suma);

        int multiplicacion = Matematica.multiplicar(2, 4);
        System.out.println(multiplicacion);


        Multiplicador multiplicador = Matematica.dameMultiplicador(10);
        System.out.println(multiplicador.multiplicar(2));


    }
}
