package taller1;

public class EjecutaCelular {
    public static void main(String[] args) {
    Celular celular = new Celular();
    celular.setMarca("Huawei P20");
    celular.setMaterial("Plastico");
    celular.setPeso(1.5);
    celular.setProcesador("Snapdragon");
    celular.setPrecio(200);
    String presentar = celular.presentacionC();

        System.out.printf("---------------\n%s\n\n" +
                "---------------", presentar);
    }
}
