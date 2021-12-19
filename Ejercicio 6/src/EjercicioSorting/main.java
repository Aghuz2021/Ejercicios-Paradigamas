package EjercicioSorting;
import java.util.ArrayList;
import java.util.List;
public class main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Pablo", 1, "m");
        Persona persona2 = new Persona("Maria", 1, "f");
        Persona persona3 = new Persona("Jesus", 0, "m");
        Persona persona4 = new Persona("Lucia", 10, "f");
        Persona persona5 = new Persona("Patricia", 5, "f");
        Persona persona6 = new Persona("Ivan", 10, "m");
        Persona persona7 = new Persona("alberto", 7, "m");
        Persona persona8 = new Persona("Jaime", 8, "m");
        List<Ordenable> personasList = new ArrayList<>();
        personasList.add(persona1);
        personasList.add(persona2);
        personasList.add(persona3);
        personasList.add(persona4);
        personasList.add(persona5);
        personasList.add(persona6);
        personasList.add(persona7);
        personasList.add(persona8);
        BubbleSort.bubbleSort(personasList);
        System.out.println(personasList);

        Par pareja1 = new Par(3, 4);
        Par pareja2 = new Par(1, 3);
        Par pareja3 = new Par(5, 5);
        Par pareja4 = new Par(9, 4);
        Par pareja5 = new Par(5, 3);
        Par pareja6 = new Par(3, 5);
        Par pareja7 = new Par(7, 4);
        Par pareja8 = new Par(1, 4);


        parSuma pareja21 = new  parSuma(3, 4);
        parSuma pareja22 = new  parSuma(1, 3);
        parSuma pareja23 = new  parSuma(3, 5);
        parSuma pareja24 = new  parSuma(6, 4);
        parSuma pareja25 = new  parSuma(5, 3);
        parSuma pareja26 = new  parSuma(5, 5);
        parSuma pareja27 = new  parSuma(7, 4);
        parSuma pareja28 = new  parSuma(0, 3);
        List<Ordenable> ordenableList = new ArrayList<>();

        ordenableList.add(pareja21);
        ordenableList.add(pareja22);
        ordenableList.add(pareja23);
        ordenableList.add(pareja24);
        ordenableList.add(pareja25);
        ordenableList.add(pareja26);
        ordenableList.add(pareja27);
        ordenableList.add(pareja28);
        BubbleSort.bubbleSort(ordenableList);
        System.out.println(ordenableList);
        ;

    }
}
