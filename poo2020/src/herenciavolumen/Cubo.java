package herenciavolumen;

public class Cubo extends FiguraVol{
    private double arista, volC;

    public Cubo(double arista, String nombre) {
        this.arista = arista;
        this.nombreF = nombre;
    }

    public double obtenerVolCubo(){
        volC = Math.pow(arista, 3);
        return volC;
    }

}
