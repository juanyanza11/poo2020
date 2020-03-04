package polimorfismo_poo;

public class EmpleadoPorHoras2 extends Empleado12{
    // Atributos propios de la clase
    private double horas;
    private double cuota;

    public EmpleadoPorHoras2(double horas, double cuota) {
        this.horas = horas;
        this.cuota = cuota;
    }

    @Override
    public void calcularSueldoQuincena() {
        sueldo = cuota * horas;
    }


    // También se extienden los atributos de la clase padre Empleado12


}
