package diseniopoo2;

import java.util.Scanner;

public class EjecutaEstudianteNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double bim1, bim2;
/**
 * Entradas del programa
 * Para la entrada de doubles usar ,
 */

        System.out.println("Ingrese nombre del Estudiante:");
        String nombreE = entrada.nextLine();

        System.out.println("Ingrese Asignatura:");
        String materia = entrada.nextLine();

        do {
            System.out.println("Ingrese la nota de primer bimestre:");
            bim1 = entrada.nextDouble();

            if (bim1 > 20 || bim1 < 0) {
                System.out.println("--- Entrada Incorrecta ---");
            }

        } while (bim1 > 20 || bim1 < 0);

        do {
            System.out.println("Ingrese la nota de segundo bimestre:");
            bim2 = entrada.nextDouble();

            if (bim2 > 20 || bim2 < 0) {
                System.out.println("--- Entrada Incorrecta ---");
            }

        } while (bim2 > 20 || bim2 < 0);


        // Creacion del objeto Con parámetros enviados usando entradas del Scanner

        EstudianteNotas estudianteNotas = new EstudianteNotas(bim1, bim2, nombreE, materia);


        String presentar = estudianteNotas.presentar();
        System.out.println("-------------------------------------------------");
        System.out.println(presentar);
        System.out.println("-------------------------------------------------");

    }
}
