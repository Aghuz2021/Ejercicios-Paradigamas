package Ejercicio_Persona;
import java.util.List;
public class Gamer {
    private long id;
    private String nombre;
    private String UsuarioEnLinea;
    private String apodo;
    private List<String> juegos;
    private List<String> titulos;
    private int partidasGanadas;
    private int partidasPerdidas;
    private float puntajeGneral;
    private String juegoPreferido;
    private int horasJugadas;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuarioEnLinea() {
        return UsuarioEnLinea;
    }

    public void setUsuarioEnLinea(String usuarioEnLinea) {
        UsuarioEnLinea = usuarioEnLinea;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public List<String> getJuegos() {
        return juegos;
    }

    public void setJuegos(List<String> juegos) {
        this.juegos = juegos;
    }

    public List<String> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<String> titulos) {
        this.titulos = titulos;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public float getPuntajeGneral() {
        return puntajeGneral;
    }

    public void setPuntajeGneral(float puntajeGneral) {
        this.puntajeGneral = puntajeGneral;
    }

    public String getJuegoPreferido() {
        return juegoPreferido;
    }

    public void setJuegoPreferido(String juegoPreferido) {
        this.juegoPreferido = juegoPreferido;
    }

    public int getHorasJugadas() {
        return horasJugadas;
    }

    public void setHorasJugadas(int horasJugadas) {
        this.horasJugadas = horasJugadas;
    }
}
