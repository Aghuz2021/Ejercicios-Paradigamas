package Ejercicio_Matematica;

public class Multiplicador {
    private int n;

    public Multiplicador(int n) {
        this.n = n;
    }

    public int multiplicar(int n2) {
        return this.n * n2;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
