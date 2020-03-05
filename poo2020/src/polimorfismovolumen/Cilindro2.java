package polimorfismovolumen;

public class Cilindro2 extends FiguraVol2{
    private double radio, altura;

    public Cilindro2(double radio, double altura, String nombre) {
        this.radio = radio;
        this.altura = altura;
        this.nombreF = nombre;
    }

    @Override
    public void calcularVol() {
        vol = Math.PI *Math.pow(radio, 2)* altura;
    }
}
