package taller1;

public class EjecutaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Juan Yanza");
        estudiante.setEdad(20);
        estudiante.setCorreo("jjyanza1@utpl.edu.ec");
        estudiante.setCi("1150087184" +
                "85");
        estudiante.setFecha_nac("1999");

        String presentar_es = estudiante.presentacionE();
        System.out.printf("---------------\n%s\n\n" +
                "---------------",presentar_es);
    }
}
