package arreglosdeberpoo;

import taller_repeticion.Cajero;

public class Cedula {
    /**
     * Variables utilizadas así como la constante
     */
    private String cedula, cadena;
    private int dv =0;
    private int producto = 0;
    private int residuo = 0;
    private int suma = 0;
    private int[] coef = {2, 1, 2, 1, 2, 1, 2, 1, 2};

    /**
     * Metodo Constructor que espera la cedula en String
     * @param ci
     */
    public Cedula(String ci) {
        cedula = ci;
    }

    /**
     * Metodo parse para transformar el String en array de ints
     * @return nums
     */
    public int[] parse() {
        int[] nums = new int[cedula.length()];
        for (int i = 0; i < cedula.length(); i++) {
            nums[i] = Character.getNumericValue(cedula.charAt(i));
        }
        return nums;
    }

    /**
     * Metodo para devolver el dígito verificador
     * @return dv
     */
    public int obtenerDigitoV() {
        suma = 0;
        residuo = 0;
        for (int i = 0; i < 9; i++) {
            producto = parse()[i] * coef[i];
            //  Condición que si los productos con la constante son mayores o iguales a 19 se resta 9
            if (producto >= 10) {
                producto = producto - 9;
            }
            suma = suma + producto;
        }
        // el residuo forma parte del calculo del digito verificador
        /*
        fuente: https://medium.com/@bryansuarez/cómo-validar-cédula-y-ruc-en-ecuador-b62c5666186f
         */
        residuo = suma%10;
        dv = 10 - residuo;
// en caso del digito verificador ser 10 se le asigna 0
    if (dv == 10){
                dv = 0;
            }

            return dv;
        }

    /**
     * Metodo para presentar si una cedula es valida o no
     * @return
     */
        public String presentar () {
            if (parse()[9] == obtenerDigitoV()) {
                cadena = String.format("Numero de CI. %s\nDigito verificador: %d", cedula, obtenerDigitoV());
            } else {
                cadena = String.format("Cedula Incorrecta");
            }
            return cadena;
        }
    }

