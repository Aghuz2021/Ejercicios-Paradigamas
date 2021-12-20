package Ejercicio_Matematicas;
public class ClaseMultiplicador extends HacedorDeCuenta {
    public ClaseMultiplicador(int n){
        super(n);
    }

    @Override
    public int hacerCuenta(int n2) {
        return  n * n2;
    }
    public String toString() {
        return "Multiplicacion: "+ (n) +" x "+ (n) +" = "+ hacerCuenta(n);
    }
}
