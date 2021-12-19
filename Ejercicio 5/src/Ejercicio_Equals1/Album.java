package Ejercicio_Equals1;
import java.util.Objects;
public class Album {
    protected String artista;
    protected String titulo;
    public Album(String artista, String titulo) {
        this.artista = artista;
        this.titulo = titulo;
    }
    public String getArtista() {
        return artista;
    }
}
