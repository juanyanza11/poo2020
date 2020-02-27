package herencia_empleado;

public class EmpleadoPorHora  extends Empleado{
    /**
     * Metodo constructor de EmpleadoPorHora
     * @param nombre
     * @param cargo
     * @param dep
     * @param cuota
     * @param horas
     */
    public EmpleadoPorHora(String nombre, String cargo, String dep, double cuota, double horas) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dep;
        this.cuota = cuota;
        this.horas = horas;
    }

    private double cuota;
    private double horas;
    private double sueldo;

    /**
     * Metodo para calcular el sueldo
     * @return sueldo
     */
    public double obtenerSueldo(){
        sueldo = horas * cuota;
        return sueldo;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
