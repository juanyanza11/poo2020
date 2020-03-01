package herenciadeudores;
/**
 * CLASE HIJA QUE HEREDA PARAMETROS EN COMUN DE LA CLASE PADRE CLIENTEDEUDOR
 */
public class PrestamoPersonal extends ClienteDeudor{
    private double interesM, total;
    public PrestamoPersonal(String nombre, String ci,double capital, double plazos, String numeroC) {
        this.nombre = nombre;
        this.capital= capital;
        this.ci = ci;
        this.plazos = plazos;
        this.numeroC = numeroC;
    }
    public double calcularInteresPer(){
        double meses = plazos * 12;
        double j = 11.07/12;
        double i = j/100;
        double a = 1+ i;
        interesM = capital* (Math.pow(a, meses)*i/(Math.pow(a, meses)-1));
        return interesM;
    }
    public double totalInteres(){
        double meses = plazos * 12;
        total = (calcularInteresPer() * meses) - capital;
        return total;
    }
}
