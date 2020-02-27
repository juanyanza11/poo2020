package herencia_empleado;

public class EmpleadoAsalariado extends Empleado{
        private double valor_mes;
        private double sueldo;

    /**
     * Metodo constructor Empleado asalariado
     * @param nombre
     * @param cargo
     * @param dep
     * @param valor_mes
     */
    public EmpleadoAsalariado(String nombre, String cargo, String dep, double valor_mes) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dep;
        this.valor_mes = valor_mes;
    }

    public double obtenerSueldo(){
        sueldo = valor_mes;
        return sueldo;
    }
}
