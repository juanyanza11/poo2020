package deber_seleccion;
import java.util.Scanner;
public class EjecutaEstudianteNota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        double nota1, nota2, nota3, nota4;

        /**
         * Se definen las entradas
         */
        System.out.println("Ingrese el Nombre del estudiante:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la nota 1:");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese la nota 2:");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese la nota 3:");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese la nota 4:");
        nota4 = entrada.nextDouble();
        /**
         * Se envian los parámetros al constructor habiendo definido el objeto
         */
        EstudianteNota estudiantenota = new EstudianteNota(nota1,nota2,nota3,nota4,nombre);

        System.out.println(estudiantenota.presentar());
    }
}
