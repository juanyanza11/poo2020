package herenciavolumen;

public class Cono extends FiguraVol{
    private double radio, altura, volCono;

    public Cono(double radio, double altura, String nombre) {
        this.radio = radio;
        this.altura = altura;
        this.nombreF = nombre;
    }
    public double obtenerVolCOno(){
        volCono = (1/3)* (Math.PI*Math.pow(radio,2)*altura);
        return volCono;
    }
}
