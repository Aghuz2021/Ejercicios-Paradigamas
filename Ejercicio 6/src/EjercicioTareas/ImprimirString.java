package EjercicioTareas;
import java.util.List;
public class ImprimirString extends  TareasBase implements Tareas {
    List<String> tipoDocumento;

    public ImprimirString(List<String> tipoDocumento) {
        super("Imprimir");
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public void ejecutar() {
        System.out.println("Se esta ejecutando");

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public List<String> guardar() {
        int cont = 0;
        while (cont < tipoDocumento.size()) {
            for (String elemento : tipoDocumento) {
                tipoDocumento.set(cont, elemento + " Asignada");
                cont++;

            }
        }
        return tipoDocumento;
    }
}
