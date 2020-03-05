package polimorfismoinversionistas;
/**
 * SUPERCLASE QUE HEREDA ATRIBUTOS EN COMUN ENTRE LAS CLASES HIJAS
 */
public abstract class Inversionista {
    protected String nombre;
    protected double plazo;
    protected double taza = 3;
    protected String numeroCuenta;
    protected double interes;

    public abstract void calcularInteres();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    public double getTaza() {
        return taza;
    }

    public void setTaza(double taza) {
        this.taza = taza;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}
