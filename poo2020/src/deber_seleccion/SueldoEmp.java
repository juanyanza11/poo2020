package deber_seleccion;

public class SueldoEmp {
    private double cuota, sueldo;
    private int horas;
    private String nombre;

    public SueldoEmp(double cuota, int horas, String nombre){
        this.cuota = cuota;
        this.horas = horas;
        this.nombre = nombre;
    }

    public Double calcularSueldo(){
        if (horas < 50){
            sueldo = cuota * horas;
        }
        else{
            sueldo = (cuota * 50) + (horas - 50) * (3*cuota);
        }
        return sueldo;
    }
}
