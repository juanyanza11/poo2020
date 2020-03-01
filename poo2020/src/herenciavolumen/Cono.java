package herenciavolumen;
/**
 * CLASE HIJA QUE HEREDA PARAMETROS EN COMUN DE LA CLASE PADRE FIGURAVOL
 */
public class Cono extends FiguraVol{
    private double radio, altura, volCono;

    public Cono(double radio, double altura, String nombre) {
        this.radio = radio;
        this.altura = altura;
        this.nombreF = nombre;
    }
    public double obtenerVolCOno(){
        volCono = ((Math.PI * Math.pow(radio,2)*altura))/3;
        return volCono;
    }
}
