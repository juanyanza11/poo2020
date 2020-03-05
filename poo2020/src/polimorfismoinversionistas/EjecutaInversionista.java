package polimorfismoinversionistas;

import java.util.Scanner;

public class EjecutaInversionista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombreC, numeroC;
        String cadena = "\t\t\t\tREPORTE INVERSIONITAS\nNo. Cliente\t\tNombre\t\tNo. Cuenta\t\tInterés Ganado\n";
        double capitalI, plazo;
        boolean band = true;
        int menu;
        int count = 0;

        do {
            System.out.println("BIENVENIDO");
            System.out.println("Tipo de cuenta inversión:");
            System.out.println("1. CUENTA DE AHORRO");
            System.out.println("2. CUENTA MAESTRA");
            System.out.println("3. PAGARE");
            System.out.println("4. SALIR");
            System.out.println("Digite una opción:");
            int opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 4){
                band = false;
            }
            switch (opcion){
                case 1:
                    count += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numeroC = entrada.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombreC = entrada.nextLine();
                    System.out.println("Ingrese el capital invertido");
                    capitalI = entrada.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = entrada.nextDouble();

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    CuentaAhorro cA = new CuentaAhorro(numeroC, capitalI, nombreC, plazo);
                    cA.calcularInteres();
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%5d%20s%12s%15.3f\n",cadena,count, cA.getNombre(), cA.getNumeroCuenta()
                            ,cA.getInteres());
                    break;
                case 2:
                    count += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numeroC = entrada.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombreC = entrada.nextLine();
                    System.out.println("Ingrese el capital invertido");
                    capitalI = entrada.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = entrada.nextDouble();

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    CuentaMaestra cM = new CuentaMaestra(numeroC,capitalI, nombreC, plazo);
                    cM.calcularInteres();
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%5d%20s%12s%15.3f\n",cadena,count, cM.getNombre(), cM.getNumeroCuenta()
                            ,cM.getInteres());
                    break;
                case 3:
                    count += 1;
                    System.out.println("Ingrese su N° de cuenta:");
                    numeroC = entrada.nextLine();
                    System.out.println("Ingrese su nombre:");
                    nombreC = entrada.nextLine();
                    System.out.println("Ingrese el capital invertido");
                    capitalI = entrada.nextDouble();
                    System.out.println("Ingrese el plazo de la inversión en años:");
                    plazo = entrada.nextDouble();

                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    Pagare pg = new Pagare(numeroC, capitalI, nombreC, plazo);
                    pg.calcularInteres();
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    cadena = String.format("%s%5d%20s%12s%15.3f\n",cadena,count, pg.getNombre(), pg.getNumeroCuenta()
                            ,pg.getInteres());
                    break;
                default:
                    System.out.println("Digite una opción correcta");

            }


        }while(band);
        System.out.printf("%s\nTOTAL %d INVERSIONES\n",cadena,count);
    }
}
