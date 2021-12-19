package Ejercicio_conjunto;

public class InterPrueba implements conjunto  {
    @Override
    public boolean pertenece(Object o) {
        return ((o instanceof Integer) && (((Integer) o) % 2 == 0));
    }
}
