package Ejerccicio_AulasVirtuales;

import java.time.LocalDate;
public class Docente extends Persona {
    private double cuil;

    protected Docente(int dni, String nombre, LocalDate fechaNacimiento,
                      int telefono, String curso,String division, double cuil) {

        super(dni, nombre, fechaNacimiento, telefono, curso, division);
        this.cuil = cuil;
    }

    @SuppressWarnings("unused")
    private void setCuil(double cuil) {this.cuil = cuil;}
    public double getCuil() {return cuil;}



}