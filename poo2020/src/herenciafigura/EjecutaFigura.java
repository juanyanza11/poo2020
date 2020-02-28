package herenciafigura;
import java.util.Scanner;
public class EjecutaFigura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int opcion = 0;
        boolean band = true;

        do {
            System.out.println("Ingrese el nombre de la figura: triangulo/cuadrado/rectangulo/circulo");
            nombre = entrada.nextLine();
            if (nombre.equals("Triangulo")|| nombre.equals("triangulo")){
                System.out.println("Ingrese la base del triangulo:");
                double baseT = entrada.nextDouble();
                System.out.println("Ingrese la altura del triangulo");
                double alturaT = entrada.nextDouble();
                Triangulo triangulo = new Triangulo(baseT, alturaT, nombre);
                System.out.printf("El area del %s es %.3f\n", triangulo.getNombreF(), triangulo.obtenerAreaT());
            }else{
                if (nombre.equals("Cuadrado")|| nombre.equals("cuadrado")){
                    System.out.println("Ingrese un lado del cuadrado");
                    double ladoC = entrada.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(ladoC, nombre);
                    System.out.printf("El area del %s es %.3f\n", cuadrado.getNombreF(), cuadrado.obtenerAreaC());

                }else{
                    if (nombre.equals("Circulo")||nombre.equals("circulo")){
                        System.out.println("Ingrese el radio del circulo:");
                        double radio = entrada.nextDouble();
                        Circulo circulo = new Circulo(radio, nombre);
                        System.out.printf("El area del %s es %.3f\n", circulo.getNombreF(), circulo.obtenerAreaCirculo());

                    }else{
                        if (nombre.equals("Rectangulo")|| nombre.equals("rectangulo")){
                            System.out.println("Ingrese la base del rectangulo");
                            double baseR = entrada.nextDouble();
                            System.out.println("Ingrese la altura del rectangulo");
                            double alturaR = entrada.nextDouble();
                            Rectangulo rectangulo = new Rectangulo(baseR,alturaR,nombre);
                            System.out.printf("El area del %s es %.3f\n", rectangulo.getNombreF(),
                                    rectangulo.obtenerAreaR());

                        }
                    }
                }
            }
            System.out.printf("Desea Ingresar otra figura\n1. Si\n2. No\n");
            opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion == 2){
                band = false;
            }
        }while (band);

    }
}
