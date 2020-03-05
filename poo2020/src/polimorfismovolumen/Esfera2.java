package polimorfismovolumen;

public class Esfera2 extends FiguraVol2{
    private double radio;

    public Esfera2(double radio, String nombre) {
        this.radio = radio;
        this.nombreF = nombre;
    }

    @Override
    public void calcularVol() {
        vol = (4* Math.PI *Math.pow(radio, 3))/3;
    }
}
