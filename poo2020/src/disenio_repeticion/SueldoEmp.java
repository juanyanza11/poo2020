package disenio_repeticion;

public class SueldoEmp {
    private double cuota, sueldo;
    private int horas;
    private String nombre;

    /**
     * Metodo constructor
     * @param cuota
     * @param horas
     * @param nombre
     */
    public SueldoEmp(double cuota, int horas, String nombre){
        this.cuota = cuota;
        this.horas = horas;
        this.nombre = nombre;
    }

    /**
     * Metodo para calcular sueldo
     * @return sueldo
     */
    public Double calcularSueldo(){
        if (horas <= 40){
            sueldo = cuota * horas;
        }
        else{
            sueldo = (cuota * 40) + (horas - 40) * (3*cuota);
        }
        return sueldo;
    }
}
