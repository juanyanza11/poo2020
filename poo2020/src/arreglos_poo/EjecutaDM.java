package arreglos_poo;
import java.util.Scanner;
public class EjecutaDM {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double [] numeros = new double[15];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Ingrese el elemento %d del array: \n", i+1);
            numeros[i] = entrada.nextDouble();
        }
        DesvicacionMedia dm = new DesvicacionMedia(numeros);
        System.out.println(dm.presentar());
    }
}
