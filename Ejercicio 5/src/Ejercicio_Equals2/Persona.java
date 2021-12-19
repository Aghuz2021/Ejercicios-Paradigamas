package Ejercicio_Equals2;

public class Persona {
    private int DNI;
    private boolean sexo;
    private String nombre;

    public Persona(int DNI, boolean sexo,String nombre) {
        this.DNI = DNI;
        this.sexo = sexo;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass() ) return false;
        Persona persona = (Persona) p;
        return DNI == persona.DNI && sexo == persona.sexo;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
