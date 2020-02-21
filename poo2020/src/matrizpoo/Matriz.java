package matrizpoo;

public class Matriz {
    private int[][] a1 = new int[3][3];
    private int[][] b1 = new int[3][3];
    private int[][] c1 = new int[3][3];

    public Matriz(int[][] a, int[][] b){
    a1 = a;
    b1 = b;
    }

    public int[][] obtenerSuma(){
        for (int i = 0; i < a1.length ; i++) {
            for (int j = 0; j < b1.length; j++) {
                c1[i][j] = a1[i][j] + b1[i][j];
            }
        }
        return c1;
    }

    public String presentar(int[][] matriz){
        String cadena = "";
        for (int k=0; k < a1.length; k++){
            for (int c=0; c < a1.length; c++){
                cadena = String.format("%s%d\t\t",cadena,matriz[k][c]);
            }
            cadena = String.format("\n%s\n",cadena);

        }

        return cadena;
    }
}
