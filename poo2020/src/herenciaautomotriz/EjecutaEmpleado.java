package herenciaautomotriz;
import herencia.Administrativo;

import java.util.Scanner;
public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion1 = 0;
        boolean band = true;
        int numEmp = 0;
        String cadena = "\t\t\tREPORTE DE NÓMINA QUINCENAL\nRFC\t\t\t\tNOMBRE\t\t\t\tDEPTO" +
                "\t\t\t\tPUESTO\t\t\t\tSUELDO QUINCENA\n";
        do {
            System.out.println("INGRESE UN TIPO DE EMPLEADO");
            System.out.println("1. Administrativo");
            System.out.println("2. Mecanico");
            System.out.println("3. Vendedor");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1){
                String dep = "ADMINISTRATIVO";
                System.out.println("Ingrese su nombre:");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese su puesto:");
                String puesto = entrada.nextLine();
                System.out.println("Ingrese su RFC");
                String rfc = entrada.nextLine();
                System.out.println("Ingrese su sueldo mensual");
                double mensual = entrada.nextDouble();
                EmpAdmvo adm = new EmpAdmvo(mensual, nombre,rfc,dep,puesto);
                cadena = String.format("%s%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t%s\t\t\t\t%.2f\n",
                        cadena, adm.getRfc(), adm.getNombre(),
                        adm.dep, adm.getPuesto(), adm.calcularSueldoQad());
            }else{
                if (opcion == 2){
                    String dep = "MECANICO";
                    System.out.println("Ingrese su nombre:");
                    String nombre = entrada.nextLine();
                    System.out.println("Ingrese su puesto:");
                    String puesto = entrada.nextLine();
                    System.out.println("Ingrese su RFC");
                    String rfc = entrada.nextLine();
                    System.out.println("Ingrese la cantidad de trabajos realizados");
                    int numeroTr = entrada.nextInt();
                    System.out.println("Ingrese el valor total de los trabajos realizados");
                    double valorTra = entrada.nextDouble();
                    EmpMecanico empMec = new EmpMecanico(valorTra, numeroTr,nombre,rfc,dep,puesto);
                    cadena = String.format("%s%s\t\t\t%s\t\t\t%s\t\t\t%s\t\t\t%.2f\n"
                            ,cadena, empMec.getRfc(), empMec.getNombre(),
                            empMec.dep, empMec.getPuesto(), empMec.obtenerSueldoQmec());
                }else{
                    if (opcion == 3){
                        String dep = "VENDEDOR";
                        double salariomin = 400;
                        System.out.println("Ingrese su nombre:");
                        String nombre = entrada.nextLine();
                        System.out.println("Ingrese su puesto:");
                        String puesto = entrada.nextLine();
                        System.out.println("Ingrese su RFC");
                        String rfc = entrada.nextLine();
                        System.out.println("Ingrese el valor total de las ventas realizadas");
                        double valorV = entrada.nextDouble();
                        EmpVendedor empV = new EmpVendedor(valorV, salariomin, nombre,rfc,dep,puesto);
                        cadena = String.format("%s%s\t\t\t%s\t\t\t%s\t\t\t%s\t\t\t%.2f\n"
                                ,cadena, empV.getRfc(), empV.getNombre(),
                                empV.dep, empV.getPuesto(), empV.obtenerSueldoQven());

                    }
                }
            }
            numEmp = numEmp + 1 ;
            System.out.printf("Desea Ingresar otro empleado\n1. Si\n2. No\n");
            opcion1 = entrada.nextInt();
            entrada.nextLine();
            if (opcion1 == 2){
                band = false;

            }
        }while (band);
        System.out.printf("%s\nTOTAL %d EMPLEADOS",cadena, numEmp);
    }
}
