package disenio_seleccion;
import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {

        String nombre;
        double cuota;
        int horas;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cuota:");
        cuota = entrada.nextDouble();
        System.out.println("Ingrese el numero de horas");
        horas = entrada.nextInt();
        Empleado empleado = new Empleado(nombre,cuota,horas);

        System.out.println(empleado.presentar());
    }
}
