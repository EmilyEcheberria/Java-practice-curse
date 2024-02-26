
package Modelo;

public class Recepcion {
    private int nro;
    private Ubicacion ubicacion;

    public Recepcion(int nro, Ubicacion ubicacion) {
        this.nro = nro;
        this.ubicacion = ubicacion;
    }

    public Recepcion( ) {
      }

    public int getNro() {
        return nro;
     }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Recepcion{" + "nro=" + nro + ", ubicacion=" + ubicacion + '}';
    }

}