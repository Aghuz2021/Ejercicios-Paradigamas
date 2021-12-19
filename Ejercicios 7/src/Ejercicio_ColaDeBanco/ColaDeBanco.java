package Ejercicio_ColaDeBanco;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ColaDeBanco {
    Deque<Persona> personasList = new LinkedList<>();

    public ColaDeBanco(Deque<Persona> personasList) {
        this.personasList = personasList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

    public Deque<Persona> agregarPersona(Persona persona) {
        if (!personasList.contains(persona)) {
            if (persona.edad > 60) {
                personasList.addFirst(persona);
            } else {
                personasList.add(persona);
            }
        }
        return personasList;
    }

    public Persona atender() {
        Persona atendida = personasList.element();
        personasList.remove(personasList.element());
        return atendida;

    }
}