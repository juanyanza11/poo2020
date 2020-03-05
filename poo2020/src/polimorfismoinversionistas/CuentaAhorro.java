package polimorfismoinversionistas;

/**
 * CLASE HIJA QUE HEREDA PARAMETROS EN COMUN DE LA CLASE PADRE INVERSIONISTA
 */
public class CuentaAhorro extends Inversionista {
    private double capital;

    public CuentaAhorro(String numeroCuenta, double capital, String nombre, double plazo ) {
        this.capital = capital;
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.plazo = plazo;
        this.taza = getTaza();

    }

    @Override
    public void calcularInteres() {
        interes = capital * (taza / 100) * plazo;
    }


}
