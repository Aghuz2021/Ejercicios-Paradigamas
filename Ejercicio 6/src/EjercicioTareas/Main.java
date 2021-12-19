package EjercicioTareas;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombreDocs = new ArrayList<>();
        nombreDocs.add("DNI");
        nombreDocs.add("CORREOS");
        nombreDocs.add("FINAL PRESUPUESTO");
        ImprimirString imprimir1 = new ImprimirString(nombreDocs);
        Documentar documentar1 = new Documentar("documento 1");

        List<Tareas> tareaList = new ArrayList<>();
        tareaList.add(imprimir1);
        tareaList.add(documentar1);

        List<String> otraLista = imprimir1.guardar();

        for (String elemento : otraLista) {
            System.out.println(elemento);
        }
    }

    static void procesarBatch(List<Tareas> tareasList) {

        for (Tareas tarea : tareasList) {
            System.out.println("La tarea a ejecutar es: " + tarea.getNombre());
            tarea.ejecutar();
        }
    }
}
