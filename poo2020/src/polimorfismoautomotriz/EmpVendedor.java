package polimorfismoautomotriz;

/**
 * CLASE HIJA QUE HEREDA PARAMETROS EN COMUN DE LA CLASE PADRE EMPLEADO
 */
public class EmpVendedor extends Empleado {
    private double ventaR, salarioMin, sueldoquincenal;

    public EmpVendedor(double ventaR, double salarioMin, String nombre, String rfc, String dep, String puesto) {
        this.ventaR = ventaR;
        this.salarioMin = salarioMin;
        this.nombre = nombre;
        this.rfc = rfc;
        this.dep = dep;
        this.puesto = puesto;
    }

    @Override
    public void calcularSueldo() {
        sueldo = salarioMin + (0.02*ventaR);

    }
}
