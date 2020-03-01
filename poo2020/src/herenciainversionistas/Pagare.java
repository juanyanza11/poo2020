package herenciainversionistas;
/**
 * CLASE HIJA QUE HEREDA PARAMETROS EN COMUN DE LA CLASE PADRE INVERSIONISTA
 */
public class Pagare extends Inversionista{
    private double capital;

    public Pagare(String numeroCuenta, double capital,String nombre, double plazo ) {
        this.numeroCuenta = numeroCuenta;
        this.capital = capital;
        this.nombre = nombre;
        this.plazo = plazo;
    }

    public double calcularInteres(){
        double interes = capital * (taza / 100) * plazo;
        return interes;
    }

}
