package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaEstudiante {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean band = true;
        int n = 0;
        List<Estudiante> estudiante = new ArrayList<Estudiante>();
        System.out.println("SISTEMA DE INGRESO DE ESTUDIANTES");
        do {
            System.out.println("Digite 1 para almacenar nuevo est");
            System.out.println("Digite 2 para presentar");
            System.out.println("Digite 3 para salir");
            int op = entrada.nextInt();
            entrada.nextLine();

            switch (op){
                case 1:
                    System.out.printf("Estudiante N° %d\n", n+1);
                    System.out.println("Ingrese el nombre");
                    String nombre = entrada.nextLine();
                    System.out.println("Ingrese cedula");
                    String ci = entrada.nextLine();
                    System.out.println("Ingrese carrera");
                    String carrera = entrada.nextLine();
                    System.out.println("Ingrese el correo");
                    String correo = entrada.nextLine();
                    System.out.println("Ingrese la edad");
                    int edad = entrada.nextInt();
                    entrada.nextLine();
                    Estudiante est = new Estudiante(nombre, ci, correo,carrera, edad);
                    estudiante.add(est);
                    n += 1;
                    break;
                case 2:
                    String cadena = String.format(ANSI_BLUE+"%-10s%-10s%-10s%-10s%-10s"+ANSI_RESET, "Nombre",
                            "Ci", "Carrera", "Edad", "Correo");
                    System.out.println(cadena);
                    for (Estudiante e: estudiante
                    ) {
                        System.out.printf("\033[31m-------------------------------------------------\033[0m\n");
                        System.out.printf("%-10s%-10s%-10s%-10d%-10s\n",e.getNombre(),e.getCi(),e.getCarrera(),
                                e.getEdad(), e.getCorreo());
                        System.out.println("\033[31m-------------------------------------------------\033[0m\n");

                    }
                    break;
                case 3:
                    band = false;
                    break;
                case 4:
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;

            }

        }while (band);
    }
}
