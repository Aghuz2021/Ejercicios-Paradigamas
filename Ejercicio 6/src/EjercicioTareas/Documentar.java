package EjercicioTareas;

public class Documentar extends TareasBase implements Tareas {
    private String descripcion;

    public Documentar(String descripcion) {
        super("Documentar");
        this.descripcion = descripcion;
    }

    @Override
    public void ejecutar() {
        System.out.println(descripcion);
        System.out.println("Se esta ejecutando");

    }

    @Override
    public String getNombre() {
        return nombre;
    }
}