package herenciafigura;

public class Triangulo extends Figura {
    private double baseT;
    private double alturaT;
    private double areaT;

    public Triangulo(double baseT, double alturaT, String nombre) {
        this.baseT = baseT;
        this.alturaT = alturaT;
        this.nombreF = nombre;
    }
    public double obtenerAreaT(){
        areaT = (baseT*alturaT)/2;
        return areaT;
    }


}
