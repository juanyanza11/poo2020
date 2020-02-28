package herenciafigura;
public class Cuadrado extends Figura{
    private double lado, areaC;
    public Cuadrado(double lado, String nombre) {
        this.lado = lado;
        this.nombreF = nombre;
    }

    public double obtenerAreaC(){
        areaC = Math.pow(lado,2);
        return areaC;
    };
}
