package taller1;

public class EjecutaComputadora {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        computadora.setMarca("Lenovo");
        computadora.setProcesador("intel i7");
        computadora.setAnio("2017");
        computadora.setColor("Gris");
        computadora.setGeneracion("Séptima");

        String presentar = computadora.presentacionCom();
        System.out.printf("---------------\n%s\n\n---------------", presentar);
    }
}
