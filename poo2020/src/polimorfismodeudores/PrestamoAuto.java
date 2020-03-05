package polimorfismodeudores;

/**
 * CLASE HIJA QUE HEREDA PARAMETROS EN COMUN DE LA CLASE PADRE CLIENTEDEUDOR
 */
public class PrestamoAuto extends ClienteDeudor {
    private double interesM, total;

    public PrestamoAuto(String nombre, String ci,double capital, double plazos, String numeroC) {
        this.nombre = nombre;
        this.capital= capital;
        this.ci = ci;
        this.plazos = plazos;
        this.numeroC = numeroC;
    }

    public double totalInteres(){
        double meses = plazos * 12;
        calcularInteres();
        total = (getInteres() * meses) - capital;
        return total;
    }

    @Override
    public void calcularInteres() {
        double meses = plazos * 12;
        double f = 6.5/12;
        double i = f/100;
        double a = 1+ i;
        interes = capital* (Math.pow(a, meses)*i/(Math.pow(a, meses)-1));
    }
}
