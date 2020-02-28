package herenciaautomotriz;

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

    public double obtenerSueldoQmec(){
        sueldoquincenal = (valorTrab*numeroTrab)*0.04;
        return sueldoquincenal;
    }

}
