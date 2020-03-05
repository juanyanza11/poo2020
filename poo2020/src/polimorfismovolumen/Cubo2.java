package polimorfismovolumen;

public class Cubo2 extends FiguraVol2{
    private double arista;

    public Cubo2(double arista, String nombre) {
        this.arista = arista;
        this.nombreF = nombre;
    }

    @Override
    public void calcularVol() {
        vol = Math.pow(arista, 3);
    }
}
