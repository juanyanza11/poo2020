package herenciavolumen;
/**
 * CLASE HIJA QUE HEREDA PARAMETROS EN COMUN DE LA CLASE PADRE FIGURAVOL
 */
public class Esfera extends FiguraVol{
    private double radio, volEs;

    public Esfera(double radio, String nombre) {
        this.radio = radio;
        this.nombreF = nombre;
    }

    public double obtenerVolEsf(){
        volEs = (4* Math.PI *Math.pow(radio, 3))/3;
        return volEs;
    }
}
