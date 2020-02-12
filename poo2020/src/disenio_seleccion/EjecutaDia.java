package disenio_seleccion;
import java.util.Scanner;
public class EjecutaDia {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
            do {
                System.out.println("Ingrese un número entre 1 y 7");
                numero = entrada.nextInt();
            }while(numero>7 || numero<1);



        Dia dia = new Dia();
        dia.getDia();
        dia.setDia(numero);

        System.out.println(dia.calcularDia());
    }
}
