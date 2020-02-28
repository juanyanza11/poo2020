package herenciaautomotriz;

public class EmpAdmvo extends  Empleado{
    private double sueldoquincenal;
    private double sueldoMen;

    public EmpAdmvo(double sueldoMen, String nombre, String rfc, String dep, String puesto) {
        this.sueldoMen = sueldoMen;
        this.nombre = nombre;
        this.rfc = rfc;
        this.dep = dep;
        this.puesto = puesto;
    }

    public double calcularSueldoQad(){
        sueldoquincenal = sueldoMen / 2;
        return sueldoquincenal;
    }

}
