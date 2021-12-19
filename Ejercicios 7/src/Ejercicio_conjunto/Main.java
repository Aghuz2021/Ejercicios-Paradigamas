package Ejercicio_conjunto;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Integer numero= 8;
        int numero2= 7;
        InterPrueba conjuntopPar= new InterPrueba();
        System.out.println(conjuntopPar.pertenece(numero2));

        List<Object> miLista= new ArrayList<>();
        miLista.add("Agus");
        miLista.add("Sanchez");

        Objetos misObj= new Objetos(miLista);
        System.out.println(misObj.pertenece("sanchez"));
        System.out.println(misObj.pertenece("Agus"));



    }
}
