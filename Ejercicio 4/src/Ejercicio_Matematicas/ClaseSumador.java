package Ejercicio_Matematicas;
public class ClaseSumador extends HacedorDeCuenta {

    public ClaseSumador(int n){
        super(n);
    }

    @Override
    public int hacerCuenta(int n2) {
        return n + n2;
    }
    public String toString() {
        return "suma: "+ (n) +" + "+ (n) +" = "+ hacerCuenta(n);
    }
}
