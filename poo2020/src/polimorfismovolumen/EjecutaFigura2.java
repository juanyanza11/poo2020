package polimorfismovolumen;
import java.util.Scanner;

public class EjecutaFigura2 {
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
                // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                Cubo2 cubo = new Cubo2(aristas, nombre);
                cubo.calcularVol();
                // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                System.out.printf("EL VOLUMEN DEL %s es %.2f\n", cubo.getNombreF(), cubo.getVol());
            }else{
                if (opcion1 == 2){
                    nombre = "CILINDRO";
                    System.out.println("Ingrese el valor del radio del cilindro");
                    double radioCil = entrada.nextDouble();
                    System.out.println("Ingrese el valor de la altura del cilindro");
                    double alturaCil = entrada.nextDouble();
                    // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                    Cilindro2 cil = new Cilindro2(radioCil, alturaCil, nombre);
                    cil.calcularVol();
                    // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                    System.out.printf("EL VOLUMEN DEL %s ES %.2f\n", cil.getNombreF(), cil.getVol());
                }else{
                    if (opcion1 == 3){
                        nombre = "CONO";
                        System.out.println("Ingrese el valor del radio del cono");
                        double radioCono = entrada.nextDouble();
                        System.out.println("Ingrese el valor de la altura del cono");
                        double alturaCono = entrada.nextDouble();
                        // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                        Cono2 cono = new Cono2(radioCono, alturaCono, nombre);
                        cono.calcularVol();
                        // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                        System.out.printf("EL VOLUMEN DEL %s ES %.2f\n", cono.getNombreF(), cono.getVol());
                    }else{
                        if (opcion1 == 4){
                            nombre = "ESFERA";
                            System.out.println("Ingrese el radio de la esfera");
                            double radioEsf = entrada.nextDouble();
                            // CREACION DEL OBJETO Y ENVIO DE PARAMETROS AL CONSTRUCTOR
                            Esfera2 esfera = new Esfera2(radioEsf,nombre);
                            esfera.calcularVol();
                            // ACUMULACIÓN DE CADENAS PARA EL FORMATO DE LA PRESENTACIÓN
                            System.out.printf("EL VOLUMEN DEL %s ES %.2f\n", esfera.getNombreF(), esfera.getVol());
                        }
                    }
                }
            }
            System.out.printf("DESEA INGRESAR OTRA FIGURA\n1. Si\n2. No\n");
            opcion2 = entrada.nextInt();

            if (opcion2 == 2){
                band = false;
            }
        }while (band);
    }
}
