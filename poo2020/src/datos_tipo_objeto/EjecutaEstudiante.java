package datos_tipo_objeto;

import arreglosdeberpoo.Cedula;

import java.util.Scanner;

public class EjecutaEstudiante {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";


    public static void main(String[] args) {

        // Declaracion de variables
        int contador;
        String cadena = String.format("%-20s%-10s\n", "Cedula", "Nombre");
        Estudiante estudiante;
        boolean band = true;
        Estudiante[] estudiantes = new Estudiante[1];
        Scanner entrada = new Scanner(System.in);
        for (contador = 0; contador < estudiantes.length; contador++) {
            System.out.println("Ingreso de nuevo estudiante");

            Estudiante est = new Estudiante();
            System.out.println("Ingrese su nombre");
            est.setNombre(entrada.nextLine());
            System.out.println("Ingrese su cedula");
            est.setCi(entrada.nextLine());
            System.out.println("Ingrese su edad");
            est.setEdad(entrada.nextInt());
            entrada.nextLine();
            System.out.println("Ingrese su carrera");
            est.setCarrera(entrada.nextLine());
            System.out.println("Ingrese su correo");
            est.setCorreo(entrada.nextLine());
            // Asignamos el objeto est a la variable estudiante
            estudiantes[contador] = est;

        }
        System.out.println("Lista de estudiantes");
        int acum = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            acum = acum + estudiantes[i].getEdad();

            cadena = String.format("%s%-20s%-10s\n",cadena, estudiantes[i].getCi(),estudiantes[i].getNombre());
        }

        // Obtencion de los valores que contiene
        // el tipo de dato Estudiante
        System.out.println(ANSI_BLUE+cadena);
        System.out.println("El promedio de edades es: "+acum);
        System.out.println(ANSI_RED+"FIN DEL PROGRAMA");
        System.out.println("");
    }

            }
