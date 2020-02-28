package herenciavolumen;

public class Esfera extends FiguraVol{
    private double radio, volEs;

    public Esfera(double radio, String nombre) {
        this.radio = radio;
        this.nombreF = nombre;
    }

    public double obtenerVolEsf(){
        volEs = (4/3) * (Math.PI *Math.pow(radio, 3));
        return volEs;
    }
}
