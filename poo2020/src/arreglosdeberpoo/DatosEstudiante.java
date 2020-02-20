package arreglosdeberpoo;

public class DatosEstudiante {
    private String [] nom = new String[5];
    private String [] cel = new String[5];
    private String [] uni = new String[5];
    private int [] edad = new int[5];
    private String cadena = "";

    public DatosEstudiante(String[] nombre, String[] celular, String[]universidad,int[] edad1){
        nom = nombre;
        cel = celular;
        uni = universidad;
        edad = edad1;
    }

    public String presentar(){
        for (int i = 0; i < cel.length; i++) {
            cadena = String.format("%s\nNombre: %s\nEdad: %d\nUniversidad: %s\nCelular: %s\n" +
                            "------------------------------"
                    ,cadena,nom[i],edad[i],uni[i],cel[i]);
        }
        return cadena;
    }
}
