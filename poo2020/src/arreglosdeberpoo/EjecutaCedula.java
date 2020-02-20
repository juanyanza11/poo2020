package arreglosdeberpoo;
import java.util.Scanner;
public class EjecutaCedula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cedula = "";

        System.out.println("Ingrese su numero de cedula: ");
        cedula = entrada.nextLine();

        Cedula ci = new Cedula(cedula);
        System.out.println(ci.presentar());

    }
}
