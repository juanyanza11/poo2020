package matrizpoo;
import java.util.Scanner;

public class EjecutaMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [][] a = new int[3][3];
        int [][] b = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.printf("Ingrese el elemento de la matriz A (%d,%d)",i,j);
                a[i][j] = entrada.nextInt();
                System.out.printf("Ingrese el elemento de la matriz B (%d,%d)",i,j);
                b[i][j] = entrada.nextInt();
            }
        }

        Matriz m = new Matriz(a,b);

        System.out.printf("Matriz A: %s", m.presentar(a));
        System.out.println("\n+");
        System.out.printf("Matriz B: %s",m.presentar(b));
        System.out.printf("Matriz C: %s", m.presentar(m.obtenerSuma()));
    }
}
