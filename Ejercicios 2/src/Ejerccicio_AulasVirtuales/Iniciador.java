package Ejerccicio_AulasVirtuales;
import java.time.LocalDate;
public class Iniciador {
    public static void main(String [] args) {

        //crea a los participantes de una materia

        Persona diego = new Docente(20798534, "Diego Garcia",
                LocalDate.of(1980, 01, 12), 1123657892,  "1", "B", 202079853);

        Docente Martin = new Docente(27458923, "Martin Massera",
                LocalDate.of(1985, 04, 22), 1134657682, "1", "B", 291037829);

        Alumno fernando = new Alumno(34419695, "Fernando Martinez",
                LocalDate.of(1989, 02, 13), 1534961302, "1", "B", 15517);

        Alumno juan = new Alumno(42456764, "Juan Perez",
                LocalDate.of(1994, 11, 25), 1577744371, "1", "B", 7112);

        Alumno paula = new Alumno(34419695, "Paula Fernandez",
                LocalDate.of(1991, 02, 3), 1177334623, "1", "B", 2341);


        //crea una materia

        Materia paradigmas = new Materia("Programación", (Docente) Martin);

        //agrega alumnos
        paradigmas.registrarAlumno(fernando);
        paradigmas.registrarAlumno(juan);
        paradigmas.registrarAlumno(paula);


        paradigmas.crearListaDeParticipantes();
        paradigmas.mostrarLista();
        paradigmas.mostrarListaDetallada();

        System.out.println("Docentes dni:");
        int dniDiego = diego.dni;
        int dniSandra = Martin.dni;
        System.out.println("\n DNI de Diego:" + dniDiego + "\n DNI de Sandra: "+ dniSandra );

    }
}
