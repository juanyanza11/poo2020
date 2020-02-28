package herenciafigura;

public class Circulo extends Figura {
    private double radio, areaC;

    public Circulo(double radio, String nombre) {
        this.radio = radio;
        this.nombreF = nombre;
    }
    public double obtenerAreaCirculo(){
        areaC = Math.PI * (Math.pow(radio,2));
        return areaC;
    }
}
