package Ejercicio_Matematicas;
public class Main {
    public static void main(String[] args) throws Exception {
        ClaseSumador sumador = new ClaseSumador(10);
        System.out.println(sumador);
        ClaseMultiplicador multiplicador = new ClaseMultiplicador(10);
        System.out.println(multiplicador);

        ClaseExponenciador Exponenciador = new ClaseExponenciador(2);
        int potencia = Exponenciador.hacerCuenta(3);
        System.out.println("Exponenciador resultado = "+ potencia);
    }
}