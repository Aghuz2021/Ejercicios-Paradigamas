package EjercicioSorting;

import java.util.List;

public class BubbleSort {

    public static void bubbleSort(List<Ordenable> miLista) {
        for (int i = 0; i < miLista.size(); i++) {
            for (int j = 0; j < miLista.size() - 1; j++) {
                if (miLista.get(j).esMayor(miLista.get(j + 1))) {
                    Ordenable temporal = miLista.get(j);
                    miLista.set(j, miLista.get(j + 1));
                    miLista.set(j + 1, temporal);
                }
            }
        }
    }

}
