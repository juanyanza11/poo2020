package disenio_repeticion;

import java.util.Scanner;

public class EjecutaSueldoEmpFor {
    public static void main(String[] args) {
        String nombre;
        double cuota;
        int horas, numeroEmp;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero de empleados a calcular el sueldo");
        numeroEmp = entrada.nextInt();

        System.out.println("Ingrese la cuota por hora:");
        cuota = entrada.nextDouble();
        entrada.nextLine(); // Limpiar buffer

        for (int i = 0; i < numeroEmp ; i++) {
            System.out.println("Ingrese el nombre del empleado:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese el número de horas trabajadas:");
            horas = entrada.nextInt();

            SueldoEmp sueldoEmp = new SueldoEmp(cuota,horas,nombre);
            System.out.printf("El sueldo del empleado %s es: %.3f\n",nombre, sueldoEmp.calcularSueldo());

            entrada.nextLine();
        }
        System.out.println("-- Fin Proceso --");
    }
}
