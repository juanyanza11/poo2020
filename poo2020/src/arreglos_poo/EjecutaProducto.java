package arreglos_poo;
import java.util.Scanner;
public class EjecutaProducto {

    public static void main(String[] args) {
            int [] a = new int[10];
            int [] b = new int[10];
            Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.printf("Ingrese un numero del vector A en la posición %d:", i+1);
            a[i] = entrada.nextInt();
            System.out.printf("Ingrese un numero del vector B en la posición %d:", i+1);
            b[i] = entrada.nextInt();
        }
        Producto producto = new Producto(a,b);
        System.out.println(producto.presentar());


    }
}
