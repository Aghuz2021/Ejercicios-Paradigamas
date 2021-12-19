package Ejerccicio_AulasVirtuales;
import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Alumno> alumnos;
    private Docente docente;
    private List<Persona> participantes;

    public Materia(String nombre, Docente docente) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<Alumno>();
        this.docente = docente;
        this.participantes = new ArrayList<Persona>();
    }

    @SuppressWarnings("unused")
    private void setNombre(String nombre) {this.nombre = nombre;}
    public String getNombre() {return nombre;}

    @SuppressWarnings("unused")
    private void setAlumnos(List<Alumno> alumnos) {this.alumnos = alumnos;}
    public List<Alumno> getAlumnos() {return alumnos;}


    @SuppressWarnings("unused")
    private void setDocente(Docente docente) {this.docente = docente;}
    public Docente getDocente() {return docente;}


    @SuppressWarnings("unused")
    private void setParticipantes(List<Persona> participantes) {this.participantes = participantes;}
    public List<Persona> getParticipantes() {return participantes;}


    public void registrarAlumno(Alumno alumno ) {
        this.getAlumnos().add(alumno);
    }

    public List<Persona> crearListaDeParticipantes() {

        this.getParticipantes().add(docente);
        for(Alumno alumno : this.alumnos ) {
            this.getParticipantes().add(alumno);
        }

        return participantes;
    }

    public void mostrarLista() {
        if (participantes.size() > 0) {
            System.out.println(" Materia: "+ this.getNombre());
            System.out.println(" Participantes: ");
            for (Persona persona : this.participantes) {
                System.out.print(" ");
                System.out.println(persona.getNombre());
            }
        } else {
            System.out.println("Para mostrar la lista de perticipantes primero "
                    + "debe ser creada con el metodo crearListaDeParticipantes");
        }

    }

    public void mostrarListaDetallada() {
        if (participantes.size() > 0) {
            for (Persona persona : this.participantes) {
                persona.describir();
            }
        } else {
            System.out.println("Para mostrar la lista detallada de perticipantes primero "
                    + "debe ser creada con el m�todo crearListaDeParticipantes");
        }

    }

}