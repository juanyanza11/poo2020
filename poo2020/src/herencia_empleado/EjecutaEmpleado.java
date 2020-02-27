package herencia_empleado;
import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Ingrese una opción para calcular el sueldo:\n1. Por Horas\n2. Por fijo mensual\n");
        int opcion = entrada.nextInt();
        String nombre, cargo, dep;
        double horas, cuota, valor;
        entrada.nextLine();
        switch (opcion){
            case 1:
                /**
                 * Caso para empleados con horas trabajadas
                 */
                System.out.println("Ingrese su nombre:");
                nombre = entrada.nextLine();
                System.out.println("Ingrese su cargo");
                cargo = entrada.nextLine();
                System.out.println("Dependencia: ");
                dep = entrada.nextLine();
                System.out.println("Ingrese las horas trabajadas:");
                horas = entrada.nextDouble();
                System.out.println("Ingrese la cuota por hora:");
                cuota = entrada.nextDouble();
                EmpleadoPorHora emp1 = new EmpleadoPorHora(nombre, cargo, dep, cuota, horas);
                System.out.printf("Empleado: %s\nCargo: %s\nDependencia: %s\nCuota: %.2f\nHoras: %.1f\nSueldo: %.2f",
                        emp1.getNombre(), emp1.getCargo(), emp1.getDependencia(), emp1.getCuota(),emp1.getHoras(),
                        emp1.obtenerSueldo());
                break;
            case 2:
                /**
                 * Caso para empleados con sueldo fijo mensual
                 */
                System.out.println("Ingrese su nombre:");
                nombre = entrada.nextLine();
                System.out.println("Ingrese su cargo");
                cargo = entrada.nextLine();
                System.out.println("Dependencia: ");
                dep = entrada.nextLine();
                System.out.println("Ingrese valor mensual");
                valor = entrada.nextDouble();
                EmpleadoAsalariado emp2 = new EmpleadoAsalariado(nombre, cargo, dep,valor );
                System.out.printf("Empleado: %s\nCargo: %s\nDependencia: %s\nSueldo: %.2f",
                        emp2.getNombre(), emp2.getCargo(), emp2.getDependencia(), emp2.obtenerSueldo());
                break;

        }
    }
}
