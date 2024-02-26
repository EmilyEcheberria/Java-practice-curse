
package Modelo;

public class Consultorio {
    private String nombre;
    private String descripcion;

    public Consultorio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Consultorio() {

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
        return "TipoHabitacion{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}