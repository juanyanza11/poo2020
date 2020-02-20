package arreglosdeberpoo;
import java.util.Arrays;
import java.util.Scanner;

public class EjecutaBinario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String numero;
        int acum = 0;
        int posicion = 0;
        System.out.println("Ingrese un numero");
        numero = entrada.nextLine();

        Binario bin = new Binario(numero);

        System.out.println("Numero decimal: "+bin.obtenerDecimal());
        System.out.printf("Numero Binario en Arreglo: %s", Arrays.toString(bin.parse()));

    }
}
