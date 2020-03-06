package datos_tipo_objeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class EjecutaVehiculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean band = true;
        int n = 0;
        List<Vehiculo> vehiculo = new ArrayList<Vehiculo>();
        System.out.println("SISTEMA DE INGRESO DE VEHICULOS");
        do {
            System.out.println("Digite 1 para almacenar nuevo");
            System.out.println("Digite 2 para presentar");
            System.out.println("Digite 3 para salir");
            int op = entrada.nextInt();
            entrada.nextLine();

            switch (op){
                case 1:
                    System.out.printf("VEHICULO N° %d", n);
                    System.out.println("Ingrese la placa del vehiculo");
                    String placa = entrada.nextLine();
                    System.out.println("Ingrese la marca del vehiculo");
                    String marca = entrada.nextLine();
                    System.out.println("Ingrese el color del vehiculo");
                    String color = entrada.nextLine();
                    System.out.println("Ingrese el modelo del vehiculo");
                    String modelo = entrada.nextLine();
                    System.out.println("Ingrese cilindraje");
                    double cil = entrada.nextDouble();
                    System.out.println("Digite el año del vehiculo");
                    int anio = entrada.nextInt();
                    entrada.nextLine();
                    Vehiculo vehiculo1 = new Vehiculo(placa, marca, modelo,color, anio,  cil);
                    vehiculo.add(vehiculo1);
                    n += 1;
                    break;
                case 2:
                    String cadena = String.format("%-10s%-10s%-10s", "Placa", "Marca", "Cilindraje");
                    System.out.println(cadena);
                    for (Vehiculo vei: vehiculo
                         ) {
                        System.out.printf("%-10s%-10s%-10f\n",vei.getPlaca(),vei.getMarca(),vei.getCilindraje());
                    }
                    break;
                case 3:
                    band = false;
                    break;
                case 4:
                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;

            }

        }while (band);

    }
}
