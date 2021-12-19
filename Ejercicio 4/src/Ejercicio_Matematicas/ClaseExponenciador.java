package Ejercicio_Matematicas;

public class ClaseExponenciador extends HacedorDeCuenta {

    public ClaseExponenciador(int n) {
        super(n);

    }
    @Override
    public int hacerCuenta(int n2) {
        int resultado = (int) Math.pow(n,n2);

        return resultado ;
    }

}
