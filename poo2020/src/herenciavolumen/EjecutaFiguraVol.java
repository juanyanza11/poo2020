package herenciavolumen;

import java.util.Scanner;

public class EjecutaFiguraVol {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int opcion1, opcion2;
        boolean band = true;

        do {
            System.out.println("------------------------------------");
            System.out.println("VOLUMEN FIGURAS GEOMETRICAS");
            System.out.println("------------------------------------");
            System.out.println("1. CUBO");
            System.out.println("2. CILINDRO");
            System.out.println("3. CONO");
            System.out.println("4. ESFERA");
            System.out.println("------------------------------------");
            System.out.println("ESCOGER OPCION");
            System.out.println("------------------------------------");
            opcion1 = entrada.nextInt();
            if (opcion1 == 1){
                nombre = "CUBO";
                System.out.println("Ingrese el valor de las aristas del cubo:");
                double aristas = entrada.nextDouble();
                Cubo cubo = new Cubo(aristas, nombre);
                System.out.printf("EL VOLUMEN DEL %s es %.2f\n", cubo.getNombreF(), cubo.obtenerVolCubo());
            }else{
                if (opcion1 == 2){
                    nombre = "CILINDRO";
                    System.out.println("Ingrese el valor del radio del cilindro");
                    double radioCil = entrada.nextDouble();
                    System.out.println("Ingrese el valor de la altura del cilindro");
                    double alturaCil = entrada.nextDouble();
                    Cilindro cil = new Cilindro(radioCil, alturaCil, nombre);
                    System.out.printf("EL VOLUMEN DEL %s ES %.2f\n", cil.getNombreF(), cil.obtenerVolCilindro());
                }else{
                    if (opcion1 == 3){
                        nombre = "CONO";
                        System.out.println("Ingrese el valor del radio del cono");
                        double radioCono = entrada.nextDouble();
                        System.out.println("Ingrese el valor de la altura del cono");
                        double alturaCono = entrada.nextDouble();
                        Cono cono = new Cono(radioCono, alturaCono, nombre);
                        System.out.printf("EL VOLUMEN DEL %s ES %.2f\n", cono.getNombreF(), cono.obtenerVolCOno());
                    }else{
                        if (opcion1 == 4){
                            nombre = "ESFERA";
                            System.out.println("Ingrese el radio de la esfera");
                            double radioEsf = entrada.nextDouble();
                            Esfera esfera = new Esfera(radioEsf,nombre);
                            System.out.printf("EL VOLUMEN DEL %s ES %.2f\n", esfera.getNombreF(), esfera.obtenerVolEsf());
                        }
                    }
                }
            }
            System.out.printf("DESEA INGRESAR OTRA FIGURA\n1. Si\n2.No");
            opcion2 = entrada.nextInt();

            if (opcion2 == 2){
                band = false;
            }
        }while (band);
    }
}
