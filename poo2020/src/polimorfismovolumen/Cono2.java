package polimorfismovolumen;

public class Cono2 extends FiguraVol2{
    private double radio, altura;

    public Cono2(double radio, double altura, String nombre) {
        this.radio = radio;
        this.altura = altura;
        this.nombreF = nombre;
    }

    @Override
    public void calcularVol() {
        vol = ((Math.PI * Math.pow(radio,2)*altura))/3;

    }
}
