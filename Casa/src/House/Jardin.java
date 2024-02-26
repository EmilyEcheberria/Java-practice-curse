package House;
public class Jardin {
    private double mCuadrados;

    public Jardin() {
    }
    public Jardin(double mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    public double getmCuadrados() {
        return mCuadrados;
    }

    public void setmCuadrados(double mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    @Override
    public String toString() {
        return "Jardin{" + "mCuadrados=" + mCuadrados + '}';
    }

}