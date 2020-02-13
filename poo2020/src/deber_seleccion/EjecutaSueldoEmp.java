package deber_seleccion;
import java.util.Scanner;

public class EjecutaSueldoEmp {
    public static void main(String[] args) {
        String nombre;
        double cuota;
        int horas;
        /**
         * Entradas /datos del empleado/
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cuota por hora:");
        cuota = entrada.nextDouble();
        System.out.println("Ingrese el número de horas trabajadas:");
        horas = entrada.nextInt();

        SueldoEmp sueldoEmp = new SueldoEmp(cuota,horas,nombre);
        System.out.printf("El sueldo del empleado %s es: %.3f",nombre, sueldoEmp.calcularSueldo());
    }
}
