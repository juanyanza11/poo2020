package herenciafigura;

public class Rectangulo extends Figura{
    private double base;
    private double altura;
    private double areaR;

    public Rectangulo(double base, double altura, String nombre) {
        this.base = base;
        this.altura = altura;
        this.nombreF = nombre;
    }
    public double obtenerAreaR(){
        areaR = base * altura;
        return areaR;
    }


}
