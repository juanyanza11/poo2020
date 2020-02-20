package arreglos_poo;

import java.util.Arrays;

public class SumaArray {
    // declaracion de variables
    private int vectorA [] = new int [10];
    private int vectorB [] = new int [10];
    private int vectorC [] = new int [10];
    private String cadena = String.format("Arreglo1\t+\tArreglo2\t=\tArreglo3" +
            "\n----------------------------------------\n");

    /**
     * Metodo constructor del objeto SumaArray
     * @param vectorA
     * @param vectorB
     */
    public SumaArray(int[] vectorA, int[] vectorB){
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    /**
     * Metodo para obtener la suma del tercer arreglo
     * @return
     */
    public int[] calcularSuma(){
        for (int i = 0; i < vectorC.length; i++) {
            vectorC[i]= vectorA[i]+  vectorB[i];
        }
        return vectorC;
    }

    /**
     * Metodo para obtener la salida de datos
     * @return
     */
    public String presentar(){
        for (int x = 0; x < vectorC.length; x++) {
            cadena = String.format("%s%d\t\t\t\t\t%d\t\t\t\t%d\n",
                    cadena, vectorA[x], vectorB[x], calcularSuma()[x]);
        }
        return cadena;
    }
}
