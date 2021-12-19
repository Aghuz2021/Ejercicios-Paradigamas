package Ejercicio_ColaDeBanco;
import java.util.Deque;
import java.util.LinkedList;
    public class main {
        public static void main(String[] args) {
            Persona persona1= new Persona(34739771, "agus", 28);
            Persona persona2= new Persona(32514744,"juan", 32);
            Persona persona3= new Persona(3252122, "ivan", 61);
            Persona persona4= new Persona(3252128, "eliana", 61);

            Deque<Persona> miLista= new LinkedList<>();

            miLista.add(persona1);
            miLista.add(persona2);
            miLista.add(persona3);
            System.out.println("Lista perosnas en la cola: ");
            for(Persona miListas : miLista){
                System.out.println(miListas);
            }

            ColaDeBanco cola1= new ColaDeBanco(miLista);
            //agrego una perosona a la cola
            Persona persona5= new Persona(3472584, "Lyon", 61);
            cola1.agregarPersona(persona5);

            System.out.println(cola1.atender());
            System.out.println(miLista);

        }
    }


