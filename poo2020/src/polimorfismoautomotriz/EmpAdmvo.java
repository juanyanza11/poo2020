package polimorfismoautomotriz;

/**
 * CLASE HIJA QUE HEREDA PARAMETROS EN COMUN DE LA CLASE PADRE EMPLEADO
 */
public class EmpAdmvo extends Empleado {
    private double sueldoquincenal;
    private double sueldoMen;

    public EmpAdmvo(double sueldoMen, String nombre, String rfc, String dep, String puesto) {
        this.sueldoMen = sueldoMen;
        this.nombre = nombre;
        this.rfc = rfc;
        this.dep = dep;
        this.puesto = puesto;
    }

    @Override
    public void calcularSueldo() {
        sueldo = sueldoMen / 2;

    }
}
