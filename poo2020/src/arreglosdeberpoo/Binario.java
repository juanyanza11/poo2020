package arreglosdeberpoo;
import java.util.Arrays;

public class Binario {
    private String num = "";
    private int decimal = 0;
    private  int posicion = 0;
public Binario(String numero){
    num = numero;
}

    /**
     * Metodo parse para convertir un String a un arreglo de enteros
     * Todo en base al length de la cadena
     * @return nums[]
     */
    public int[] parse(){
        int[] nums = new int[num.length()];
        for(int i=0; i<num.length(); i++){
            nums[i] = Character.getNumericValue(num.charAt(i));
        }
        return nums;
    }

    /**
     * Operación para transformar de binario a decimal
     * Se comienza de la última posición del array
     * @return
     */
    public int obtenerDecimal(){
        for (int i = parse().length-1; i >=0 ; i--) {
            double mult = Math.pow(2,posicion);
            decimal += parse()[i] * mult;
            posicion++;
        }
    return decimal;
    }

}

