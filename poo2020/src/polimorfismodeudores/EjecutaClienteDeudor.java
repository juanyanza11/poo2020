package polimorfismodeudores;

import java.util.Scanner;

public class EjecutaClienteDeudor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean band = true;
        int count = 0;
        String cadena = "\t\t\t\t\t\t\t\t\t\tREPORTE CLIENTES DEUDORES\nNo. Cliente\t\tNombre\t\tNo. Cuenta\t\t" +
                "Interés por pagar/mensual\t\tTOTAL INTERESES\t\tTOTAL A PAGAR\n";
        do {

            System.out.println("BIENVENIDO");
            System.out.println("1. PRESTAMO HIPOTECARIO");
            System.out.println("2. PRESTAMO VEHICULO");
            System.out.println("3. PRESTAMO PERSONAL");
            System.out.println("4. SALIR");
            System.out.println("Digite una opción");
            int opcion = entrada.nextInt();
            int c = opcion;
            if (c == 4){
                band = false;
            }
            entrada.nextLine();

            switch (opcion){
                case 1:
                    count += 1;
                    System.out.println("Ingrese su nombre:");
                    String nombre = entrada.nextLine();
                    System.out.println("Ingrese su número de cedula:");
                    String cedula = entrada.nextLine();
                    System.out.println("Ingrese su numero de cuenta:");
                    String numeroC = entrada.nextLine();
                    System.out.println("Ingrese el capital a recibir:");
                    double capital = entrada.nextDouble();
                    System.out.println("Ingrese el plazo en años del prestamo hipotecario:");
                    double plazos = entrada.nextDouble();

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    PrestamoHipotecario pH = new PrestamoHipotecario(nombre, cedula, capital, plazos, numeroC);
                    pH.calcularInteres();
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%5d%20s%12s%20.3f%30.3f%20.3f\n", cadena, count,
                            pH.getNombre(), pH.getNumeroC(), pH.getInteres(),pH.totalInteres(),
                            pH.totalInteres()+capital);
                    break;
                case 2:
                    count += 1;
                    System.out.println("Ingrese su nombre:");
                     nombre = entrada.nextLine();
                    System.out.println("Ingrese su número de cedula:");
                     cedula = entrada.nextLine();
                    System.out.println("Ingrese su numero de cuenta:");
                     numeroC = entrada.nextLine();
                    System.out.println("Ingrese el capital a recibir:");
                     capital = entrada.nextDouble();
                    System.out.println("Ingrese el plazo en años del prestamo vehicular:");
                     plazos = entrada.nextDouble();

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    PrestamoAuto pA = new PrestamoAuto(nombre, cedula, capital, plazos,numeroC);
                    pA.calcularInteres();
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%5d%20s%12s%20.3f%30.3f%20.3f\n", cadena, count, pA.getNombre()
                            , pA.getNumeroC(), pA.getInteres(), pA.totalInteres(), pA.totalInteres()+capital);
                    break;
                case 3:
                    count += 1;
                    System.out.println("Ingrese su nombre:");
                    nombre = entrada.nextLine();
                    System.out.println("Ingrese su número de cedula:");
                    cedula = entrada.nextLine();
                    System.out.println("Ingrese su numero de cuenta:");
                    numeroC = entrada.nextLine();
                    System.out.println("Ingrese el capital a recibir:");
                    capital = entrada.nextDouble();
                    System.out.println("Ingrese el plazo en años del prestamo personal:");
                    plazos = entrada.nextDouble();

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    PrestamoPersonal pP = new PrestamoPersonal(nombre, cedula, capital, plazos,numeroC);
                    pP.calcularInteres();
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%5d%20s%12s%20.3f%30.3f%20.3f\n", cadena, count, pP.getNombre()
                            , pP.getNumeroC(), pP.getInteres(), pP.totalInteres(), pP.totalInteres()+capital);
                    break;
                case 4:
                    System.out.println("---- SALIENDO ----");
                    break;
                default:
                    System.out.println("-- DIGITE UNA OPCION CORRECTA --");
                    break;
            }

        }while(band);
        System.out.printf("%s\nTOTAL %d CLIENTES\n",cadena,count);
    }
}
