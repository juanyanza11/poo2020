package herenciadeudores;
/**
 * CLASE HIJA QUE HEREDA PARAMETROS EN COMUN DE LA CLASE PADRE CLIENTEDEUDOR
 */
public class PrestamoHipotecario extends ClienteDeudor{
    private double interesM, total;

    public PrestamoHipotecario(String nombre, String ci,double capital, double plazos, String numeroC) {
        this.nombre = nombre;
        this.capital= capital;
        this.ci = ci;
        this.plazos = plazos;
        this.numeroC = numeroC;
    }
    public double calcularInteresHip(){
        double meses = plazos * 12;
        double i = 0.25/100;
        double a = 1+ i;
        interesM = capital* (Math.pow(a, meses)*i/(Math.pow(a, meses)-1));
        return interesM;
    }
    public double totalInteres(){
        double meses = plazos * 12;
        total = (calcularInteresHip() * meses) - capital;
        return total;
    }
}
