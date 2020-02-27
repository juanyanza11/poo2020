package herencia;
import java.util.Date;
import java.util.Scanner;
public class EjecutaPersonal {
    public static void main(String[] args) {
        int opcion = 0;

        Scanner entrada = new Scanner(System.in);
        String nombre, id, estado_civil,fecha,carrera, area,dependencia;

        System.out.printf("1. Docente\n2. Estudiante\n3. Administrativo");
        opcion = entrada.nextInt();

        switch (opcion){
            case 1:
                entrada.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese la identificacion: ");
                id= entrada.nextLine();
                System.out.println("Ingrese el area: ");
                area = entrada.nextLine();
                System.out.println("Ingrese estado civil: ");
                estado_civil = entrada.nextLine();
                System.out.println("Ingrese fecha nacimiento");
                fecha = entrada.nextLine();
                Docente docente = new Docente(nombre, id, area,estado_civil,fecha);
                System.out.println("-------------------------------");
                System.out.printf("Nombre: %s\nIdentificacion: %s\nArea: %s\nEstado civil: %s\nFecha nacimiento: %s"
                        ,docente.getNombre(), docente.getIdentificacion(), docente.getArea(),
                        docente.getEstado_civil(),docente.getFecha_nacimiento());

                break;
            case 2:
                entrada.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese la identificacion: ");
                id= entrada.nextLine();
                System.out.println("Ingrese la carrera: ");
                carrera = entrada.nextLine();
                System.out.println("Ingrese estado civil: ");
                estado_civil = entrada.nextLine();
                System.out.println("Ingrese fecha nacimiento");
                fecha = entrada.nextLine();
                Estudiante estudiante = new Estudiante(nombre, id, carrera,estado_civil,fecha);
                System.out.println("-------------------------------");
                System.out.printf("Nombre: %s\nIdentificacion: %s\nCarrera: %s\nEstado civil: %s\nFecha nacimiento: %s"
                        ,estudiante.getNombre(), estudiante.getIdentificacion(), estudiante.getCarrera(),
                        estudiante.getEstado_civil(),estudiante.getFecha_nacimiento());
                break;

            case 3:
                entrada.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombre = entrada.nextLine();
                System.out.println("Ingrese la identificacion: ");
                id= entrada.nextLine();
                System.out.println("Ingrese la dependencia: ");
                dependencia = entrada.nextLine();
                System.out.println("Ingrese estado civil: ");
                estado_civil = entrada.nextLine();
                System.out.println("Ingrese fecha nacimiento");
                fecha = entrada.nextLine();
                Administrativo administrativo = new Administrativo(nombre, id, dependencia,estado_civil,fecha);
                System.out.println("-------------------------------");
                System.out.printf("Nombre: %s\nIdentificacion: %s\nDependencia: %s\nEstado civil: %s\nFecha nacimiento: %s"
                        ,administrativo.getNombre(), administrativo.getIdentificacion(), administrativo.getDependencia(),
                        administrativo.getEstado_civil(),administrativo.getFecha_nacimiento());
                break;
        }


        // Creacion de objeto de la clase Estudiante

    }
}

