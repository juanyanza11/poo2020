package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaDatosEstudiantes {
    public static void main(String[] args) {
        String [] nombres = new String[5];
        int [] edad = new int[5];
        String[] universidad = new String[5];
        String[] celular = new String[5];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("Ingrese el nombre del estudiante #%d\n",i+1);
            nombres[i] = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante:");
            edad[i] = entrada.nextInt();
            entrada.nextLine();
            System.out.println("Ingrese la Universidad del estudiante:");
            universidad[i] = entrada.nextLine();
            System.out.println("Ingrese el numero de celular");
            celular[i] = entrada.nextLine();
        }
        DatosEstudiante dE = new DatosEstudiante(nombres,celular,universidad,edad);
        System.out.println(dE.presentar());

    }
}
