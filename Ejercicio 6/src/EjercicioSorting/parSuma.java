package EjercicioSorting;

public class parSuma implements Ordenable {
    int suma;

    public parSuma(int numeroA, int numeroB) {
        this.suma = numeroA + numeroB;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParSuma{");
        sb.append("suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Boolean esMayor(Object objeto) {
        parSuma o = (parSuma) objeto;
        return (this.suma > o.suma);
    }
}