package disenio_seleccion;

public class Empleado {
    private String nombre, cadena;
    private Double cuota, sueldo;
    private int horas;

    /**
     * Creación del constructor Empleado
     * @param nombre
     * @param cuota
     * @param horas
     */
    public Empleado(String nombre, double cuota, int horas){
        this.nombre = nombre;
        this.cuota = cuota;
        this.horas = horas;
    }

    /**
     * Calculo del Sueldo
     * @return sueldo
     */
    public Double calcularSueldo() {
        if (horas <= 40){
            sueldo = cuota * horas;
        }else{
            if (horas > 40){
                sueldo = (40*cuota)+(horas-40)*(cuota*2);

            }
        }
        return sueldo;
    }

    /**
     * Metodo para presentar el sueldo y nombre del empleado
     * @return cadena
     */
    public String presentar(){
        cadena = String.format("Nombre Empleado: %s\nSueldo: %.3f",nombre,calcularSueldo());
        return cadena;
    }
}
