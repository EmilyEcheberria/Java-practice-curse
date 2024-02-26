
package House;

public class Casa implements AbstraccionCasa {
    private String nombre;
    private double mCuadrados;
    private Habitacion habitacion;
    private Jardin habitacion;
    private Direccion direccion;

    public Casa() {
    }

    public class(String nombre, double mCuadrados, Habitacion habitacion, Jardin jardin, Direccion direccion) {
        this.nombre = nombre;
        this.mCuadrados = mCuadrados;
        this.habitacion =habitacion;
        this.jardin = jardin;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getmCuadrados() {
        return mCuadrados;
    }

    public Room getHabitacion() {
        return habitacion;
    }

    public Jardin getJardin() {
        return jardin;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setmCuadrados(double mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    public void setRoom(Habitacion habitacion) {
        this.Habitacion = habitacion;
    }

    public void setGarden(Jardin jardin) {
        this.Jardin = jardin;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Casa{" + "nombre=" + nombre + ", mCuadrados=" + mCuadrados + ", habitacion=" + habitacion + ", jardin=" + jarden + ", direccion=" + direccion + '}';
    }

    @Override
    public void crearCasa() {

    }

}