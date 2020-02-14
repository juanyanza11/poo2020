package disenio_repeticion;

import java.util.Scanner;

public class EjecutaSueldoEmp {
    public static void main(String[] args) {
        String nombre;
        double cuota;
        int horas, opcion;
        boolean bandera;
        bandera = true; // Variable bandera inicializada en verdadero
        /**
         * Entradas /datos del empleado/
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cuota por hora:");
        cuota = entrada.nextDouble();
        entrada.nextLine(); // Limpiar buffer
        do {
            System.out.println("Ingrese el nombre del empleado:");
            nombre = entrada.nextLine();

            System.out.println("Ingrese el número de horas trabajadas:");
            horas = entrada.nextInt();

            SueldoEmp sueldoEmp = new SueldoEmp(cuota,horas,nombre);
            System.out.printf("El sueldo del empleado %s es: %.3f\n",nombre, sueldoEmp.calcularSueldo());

            // Opcion para seguir ingresando datos por teclado
            System.out.println("Desea calcular el sueldo de otro empleado? si = 1/no = 0");
            opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 0){
                bandera = false;
                System.out.println("-- Fin Proceso --");
            }
        }while(bandera == true);

    }
}
