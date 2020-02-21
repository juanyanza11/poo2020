package arreglosdeberpoo;

public class DatosEstudiante {
    /**
     * Creación de variables
     */
    private String [] nom = new String[5];
    private String [] cel = new String[5];
    private String [] uni = new String[5];
    private int [] edad = new int[5];
    private String cadena = "";

    /**
     * Metodo Constructor que recibe parametros del metodo principal
     * @param nombre
     * @param celular
     * @param universidad
     * @param edad1
     */
    public DatosEstudiante(String[] nombre, String[] celular, String[]universidad,int[] edad1){
        nom = nombre;
        cel = celular;
        uni = universidad;
        edad = edad1;
    }

    /**
     * Metodo de presentación que acumula cadenas mediante String.format
     * @return cadena
     */
    public String presentar(){
        for (int i = 0; i < cel.length; i++) {
            cadena = String.format("%s\nNombre: %s\nEdad: %d\nUniversidad: %s\nCelular: %s\n" +
                            "------------------------------"
                    ,cadena,nom[i],edad[i],uni[i],cel[i]);
        }
        return cadena;
    }
}
