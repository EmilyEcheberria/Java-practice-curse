
package House;

public class Direccion {

     private String calle;
    private int numero;
    private Provincia provincia;
    private int piso;
      private char nro;

    public Direccion(String calle, int numero, Provincia provincia, int piso, char nro) {
        this.calle = calle;
        this.numero = numero;
        this.provincia = provincia;
        this.piso = piso;
        this.nro = nro;
    }

    public Direccion() {
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public int getPiso() {
        return piso;
    }

    public char getNro() {
        return nro;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setNro(char nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", provincia=" + provincia + ", piso=" + piso + ", nro=" + nro + '}';
    }

}