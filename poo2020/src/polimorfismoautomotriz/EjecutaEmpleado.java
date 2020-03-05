package polimorfismoautomotriz;

import java.util.Scanner;

public class EjecutaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean band = true;
        int numEmp = 0;
        String cadena = "\t\t\t\t\t\tREPORTE DE NÓMINA QUINCENAL\nRFC\t\t\t\tNOMBRE\t\t\tDEPTO" +
                "\t\t\tPUESTO\t\t\tSUELDO QUINCENA\n";
        do {
            System.out.println("INGRESE UN TIPO DE EMPLEADO");
            System.out.println("1. Administrativo");
            System.out.println("2. Mecanico");
            System.out.println("3. Vendedor");
            System.out.println("4. SALIR");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 4){
                band = false;
            }

            if (opcion == 1){
                numEmp = numEmp + 1 ;
                String dep = "ADMINISTRATIVO";
                System.out.println("Ingrese su nombre:");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese su puesto:");
                String puesto = entrada.nextLine();
                System.out.println("Ingrese su RFC");
                String rfc = entrada.nextLine();
                System.out.println("Ingrese su sueldo mensual");
                double mensual = entrada.nextDouble();

                // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                EmpAdmvo adm = new EmpAdmvo(mensual, nombre,rfc,dep,puesto);
                adm.calcularSueldo();
                // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                cadena = String.format("%s%s%20s%20s%10s%20.2f\n",
                        cadena, adm.getRfc(), adm.getNombre(),
                        adm.dep, adm.getPuesto(), adm.getSueldo());
            }else{
                if (opcion == 2){
                    numEmp = numEmp + 1 ;
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

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    EmpMecanico empMec = new EmpMecanico(valorTra, numeroTr,nombre,rfc,dep,puesto);
                    empMec.calcularSueldo();
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%s%20s%15s%15s%20.2f\n"
                            ,cadena, empMec.getRfc(), empMec.getNombre(),
                            empMec.dep, empMec.getPuesto(), empMec.getSueldo());
                }else{
                    if (opcion == 3){
                        numEmp = numEmp + 1 ;
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

                        // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                        EmpVendedor empV = new EmpVendedor(valorV, salariomin, nombre,rfc,dep,puesto);
                        empV.calcularSueldo();
                        // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                        cadena = String.format("%s%s%20s%15s%15s%20.2f\n"
                                ,cadena, empV.getRfc(), empV.getNombre(),
                                empV.dep, empV.getPuesto(), empV.getSueldo());

                    }
                }
            }

        }while (band);
        System.out.printf("%s\nTOTAL %d EMPLEADOS",cadena, numEmp);
    }
}
