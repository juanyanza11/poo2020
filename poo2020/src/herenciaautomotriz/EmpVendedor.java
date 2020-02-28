package herenciaautomotriz;

public class EmpVendedor extends  Empleado{
    private double ventaR, salarioMin, sueldoquincenal;

    public EmpVendedor(double ventaR, double salarioMin, String nombre, String rfc, String dep, String puesto) {
        this.ventaR = ventaR;
        this.salarioMin = salarioMin;
        this.nombre = nombre;
        this.rfc = rfc;
        this.dep = dep;
        this.puesto = puesto;
    }
    public double obtenerSueldoQven(){
        sueldoquincenal = salarioMin + (0.02*ventaR);
        return sueldoquincenal;
    }
}
