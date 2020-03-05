package polimorfismoautomotriz;

/**
 * CLASE HIJA QUE HEREDA PARAMETROS EN COMUN DE LA CLASE PADRE EMPLEADO
 */
public class EmpMecanico extends Empleado {
    private int numeroTrab;
    private double sueldoquincenal, valorTrab;

    public EmpMecanico(double valorTrab, int numeroTrab, String nombre, String rfc, String dep, String puesto) {
        this.valorTrab = valorTrab;
        this.numeroTrab = numeroTrab;
        this.nombre = nombre;
        this.rfc = rfc;
        this.dep = dep;
        this.puesto = puesto;
    }

    @Override
    public void calcularSueldo() {
        sueldo = (valorTrab*numeroTrab)*0.04;

    }
}
