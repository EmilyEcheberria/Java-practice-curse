
package House;

public class Provincia {
    private String nombre;
    private Pais pais;

    public Provincia(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public Provincia() {
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    @Override
    public String toString() {
        return "Provincia{" + "Pais=" + pais + ", nombre=" + nombre '}';
    }

}