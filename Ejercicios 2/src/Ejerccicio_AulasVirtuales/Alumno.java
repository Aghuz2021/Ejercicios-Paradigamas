package Ejerccicio_AulasVirtuales;
import java.time.LocalDate;
public class Alumno extends Persona {

    protected Alumno(int dni, String nombre, LocalDate fechaNacimiento,
                     int telefono, String curso, String division, double legajo){

        super(dni, nombre, fechaNacimiento, telefono, curso, division);
            this.legajo = legajo;
        }

        private double legajo;

        public double getLegajo() {return legajo;}

        public void setLegajo(double legajo) {this.legajo = legajo;}

    }

