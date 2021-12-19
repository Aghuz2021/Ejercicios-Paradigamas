package Ejerccicio_AulasVirtuales;
import java.time.LocalDate;

public abstract class Persona {

    protected int dni;
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected int telefono;
    protected String curso;
    protected String division;

    protected Persona(int dni, String nombre, LocalDate fechaNacimiento,
                      int telefono, String curso, String division) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.curso = curso;
        this.division = division;

    }

    public int getDni() { return dni;}
    protected void setDni(int dni) {this.dni = dni;}

    public String getNombre() {return nombre;}
    protected void setNombre(String nombre) {this.nombre = nombre;}

    public LocalDate getFechaNacimiento() {return fechaNacimiento;}
    protected void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}

    public int getTelefono() {return telefono;}
    protected void setTelefono(int telefono) {this.telefono = telefono;}

    public String getCurso() {return curso;}
    protected void setCurso(String curso) {this.curso = curso;}

    public String getDivision() {return division;}
    protected void setDivision(String division) {this.division = division;}

    public void describir() {
        System.out.println("\n DNI: " + dni + ", \n Nombre: " + nombre +
                ", \n Fecha de Nacimiento: " + fechaNacimiento +
                ", \n Telefono: " + telefono + ", \n Curso: "  +
                curso + ", \n Division: " + division + ". \n");
    }

}