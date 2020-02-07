package diseñoPOO;
import java.util.Scanner;

public class EjecutaCerveza {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidad;
        double precio;
        String nombre;
        String tipo;

        System.out.println("Ingrese el precio por unidad: ");
    precio = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese el Nombre de la cerveza: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la cantidad: ");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese el tipo de cerveza");
        entrada.nextLine();
    tipo = entrada.nextLine();

    Cerveza cerveza = new Cerveza(precio, cantidad, nombre, tipo);
        System.out.println("------------------------------------------");
    String presentar = cerveza.presentar();
        System.out.println(presentar);
        System.out.println("------------------------------------------");

    }
}
