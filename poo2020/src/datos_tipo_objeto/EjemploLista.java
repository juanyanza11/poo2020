package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;

public class EjemploLista {

    public static void main(String[] args) {
        // Creacion de una lista en java
        // Para almacenar datos de tipo String

        List<String> universidades = new ArrayList<String>();
        universidades.add("\033[31mUTPL\033[0m");
        System.out.println(universidades);
        System.out.println("Tamaño de la lista "+universidades.size());
        universidades.add("\033[21mespol\033[0m");
        System.out.println("Tamaño de la lista "+universidades.size());
        universidades.add("\033[21mUNL\033[0m");
        System.out.println("Tamaño de la lista "+universidades.size());
        universidades.remove(1);
        System.out.println(universidades);
        universidades.set(1, "\33[21mUIDE\33[0m");
        // Agregamos un nuevo valor en una posicion intermedia

        universidades.add(1, "UNL");
        // recorremos las posiciones de la lista
        System.out.println("VALORES DE LA LISTA");
        for (int i = 0; i < universidades.size(); i++) {
            System.out.println(universidades.get(i));
        }

        for (String univ:universidades
             ) {
            System.out.println(univ);
        }
    }


}
