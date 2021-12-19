package Ejercicios_Salud;

public class ProfesionalSalud {

    protected long id;
    protected String nombre;
    protected double dni;
    protected String hospital;

    public long getId() {
        return id;
    }
    protected void setId(long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getDni() {
        return dni;
    }
    protected void setDni(double dni) {
        this.dni = dni;
    }
    public String getHospital() {
        return hospital;
    }
    protected void setHospital(String hospital) {
        this.hospital = hospital;
    }



}