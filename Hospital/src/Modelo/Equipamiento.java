
package Modelo;

public class Equipamiento {
    private String nombre;
    private String descripcion;

    public Equipamiento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Equipamiento() {
     }

    public String getNombre() {
        return nombre;
     }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Equipamiento{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}