package herenciavolumen;

public class Cilindro extends FiguraVol{
    private double radio, altura, volCil;

    public Cilindro(double radio, double altura, String nombre) {
        this.radio = radio;
        this.altura = altura;
        this.nombreF = nombre;
    }

    public double obtenerVolCilindro(){
        volCil = Math.PI *Math.pow(radio, 2)* altura;
        return volCil;
    }
}
