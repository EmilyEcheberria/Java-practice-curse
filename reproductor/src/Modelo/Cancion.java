
package Modelo;

import java.io.Serializable;
import java.net.URL;

public class Cancion implements Comparable, Serializable {
    private URL url;
    private String nombre;

    public Cancion() {
    }

    public URL getUrl() {
        return this.url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre.replace(".mp3", "");
    }

    public int compareTo(Object objeto) {
        Cancion cancion = (Cancion)objeto;
        String nombreObjeto = cancion.getNombre().toLowerCase();
        String nombreThis = this.getNombre().toLowerCase();
        return nombreThis.compareTo(nombreObjeto);
    }
}
