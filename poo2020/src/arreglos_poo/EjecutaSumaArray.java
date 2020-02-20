package arreglos_poo;
import java.util.Scanner;
public class EjecutaSumaArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // declaracion de variables
        int vectorA [] = new int [10];
        int vectorB [] = new int [10];
        // entrada y lectura de datos
        for (int i = 0; i < vectorA.length; i++) {
            System.out.printf("Introduzca el valor del vector A en la posicion %d\n",i+1);
            vectorA[i] = teclado.nextInt();
            System.out.printf("Introduzca el valor del vector B en la posicion %d\n", i+1);
            vectorB[i] = teclado.nextInt();
        }
        // creacion del objeto
        SumaArray sumaArray = new SumaArray(vectorA, vectorB);
        //  salida de datos
        System.out.println(sumaArray.presentar());
    }
}