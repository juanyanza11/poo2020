package deber_seleccion;

public class MayorNum {
    private int[] num;
    private int nummayor;

    /**
     * Metodo Constructor que recibe un array de enteros
     * @param num
     */
    public MayorNum(int[] num) {
        this.num = num;
    }

    /**
     * Metodo para determinar el mayor de un conjunto de 4 numeros en un array
     *
     * @return mayor
     */
    public int retornarMayor() {
        for (int i = 0; i < num.length; i++) {
            if (num[i] > nummayor) {
                nummayor = num[i];
            }
        }
        return nummayor;
    }
}
