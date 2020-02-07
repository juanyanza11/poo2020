package taller1;

public class EjecutaDocente {
    public static void main(String[] args) {
        Docente docente = new Docente();

        docente.setNombre("Gonzalo Alvarez");
        docente. setCi("11000555588");
        docente.setCorreo("ejemplo@.ejemplo.com");
        docente.setDireccion("Loja - Av. Los Paltas");
        docente.setFecha_nac("1965");
        String presentar_docente = docente.presentacionD();
        System.out.printf("---------------\n%s\n\n" +
                "---------------", presentar_docente);
    }
}
