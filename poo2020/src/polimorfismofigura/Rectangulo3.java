package polimorfismofigura;

public class Rectangulo3 extends Figura3{
    private double base;

    public Rectangulo3(double base, double altura, String nombreF) {
        this.base = base;
        this.altura = altura;
        this.nombreF = nombreF;
    }

    private double altura;

    @Override
    public void calcularArea() {
        area = base*altura;
    }
}
