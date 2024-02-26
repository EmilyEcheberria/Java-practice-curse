
package House;

public class Habitacion {
    private String nombre;
    private Puerta puerta;
    private Ventana ventana;
    private String descripcion;
    private Electrodomesticos elec;

    public Habitacion(String nombre, Puerta puerta, Ventana ventana, String descripcion, Furniture furniture, Electrodomestico elec) {
        this.nombre = nombre;
        this.puerta = puerta;
        this.ventana = ventana;
        this.descripcion = descripcion;
        this.elec = elec;
    }

    public Habitacion() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setElec(Electrodomesticos elec) {
        this.elec = elec;
    }

    public String getNombre() {
        return nombre;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Electrodomestico getElec() {
        return elec;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "nombre=" + nombre + ", puerta=" + puerta + ", ventana=" + ventana + ", descripcion=" + descripcion + ", elec=" + elec + '}';
    }








}