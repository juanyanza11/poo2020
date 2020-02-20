package arreglos_poo;

        import java.util.Arrays;

public class Producto {
    int[] b1 = new int[4];
    int[] a1 = new int[4];
    int sumatoria = 0;
    String cadena;
    public Producto(int [] a, int [] b){
        a1 = a;
        b1 = b;
    }

    public int obtener(){
        for (int i = 0; i < a1.length; i++) {
            sumatoria = sumatoria + (a1[i] * b1[i]);
        }
        return sumatoria;
    }

    public  String presentar(){
        cadena = "La sumatoria del producto del vectora A "
                + Arrays.toString(a1)+" por el vector B "+Arrays.toString(b1)+" es: "+ obtener();
        return cadena;
    }
}
