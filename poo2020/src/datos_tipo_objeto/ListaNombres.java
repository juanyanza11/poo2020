package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean band = true;
        int c = 0;
        List<String> nombres = new ArrayList<String>();


        do {
            System.out.println("1. Agregar un nuevo nombre");
            System.out.println("2. Presentar lista de nombres");
            System.out.println("3. Salir");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese un nombre");
                    String nombre = entrada.nextLine();
                    nombres.add(c, nombre);
                    break;
                case 2:
                    System.out.println(nombres);
                    break;
                case 3:
                    band = false;
                    break;
            }
            }while (band);

        }
    }

