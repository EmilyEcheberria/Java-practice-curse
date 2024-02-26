
package House;

public class Marca {
    private String nombre;
    public Marca(String nombre) {
        this.nombre = nombre;
    }

    public Marca() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Marca{" + "nombre=" + nombre + '}';
    }

}