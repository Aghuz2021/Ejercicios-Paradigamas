package EjercicioAnimales;
import java.util.ArrayList;
import java.util.List;
public class Main {
        public static void main(String[] args) {

            Paloma paloma1= new Paloma("cletus");
            Aguila aguila1= new Aguila("LILI");
            Leon leon1= new Leon("ASLAN");
            Hiena hiena1= new Hiena("HIENA");
            Pez pez1= new Pez("DORIS");
            Ballena ballena1= new Ballena("BALLENA FRANCA");
            List<Animal> animalList= new ArrayList<>();
            animalList.add(paloma1);
            animalList.add(aguila1);
            animalList.add(hiena1);
            animalList.add(pez1);
            animalList.add(ballena1);
            animalList.add(leon1);
            Animal.showDeAnimales(Animal.dameAcuaticos(animalList));
            System.out.println("");
            Animal.imprimirLista(animalList);

        }
    }


