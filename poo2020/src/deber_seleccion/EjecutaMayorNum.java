package deber_seleccion;
import java.util.Scanner;
public class EjecutaMayorNum {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /**
         * Entradas de los numeros a determinar el mayor
         */
        int [] numeros = new int [4];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Ingrese un numero #%d\n", i + 1);
            numeros[i] = entrada.nextInt();
        }
            MayorNum numm = new MayorNum(numeros);

            System.out.printf("El número mayor es: %d\n", numm.retornarMayor());
        }

    }

