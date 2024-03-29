
package House;

public class Ventana {
    private Marca  smarca;
    private double ancho;
    private double  largo;
    private String nombre;

    public Ventana() {
    }

    public Ventana(Marca marca, double ancho, double largo, String nombre) {
        this.marca = marca;
        this.ancho = ancho;
        this.largo = largo;
        this.nombre = nombre;
    }

    public Marca getMarca() {
        return marca;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public void setAncho(double ancho) {
        this.ancho =  ancho;
    }

    public void setLargo(double largo) {
         this.largo = largo;
    }

      public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ventana{" + "marca=" + marca + ", ancho=" + ancho + ", largo=" + largo + ", nombre=" + nombre + '}';
    }

}