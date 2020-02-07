package taller1;

public class EjecutaUniversidad {
    public static void main(String[] args) {
        Universidad universidad = new Universidad();
        universidad.setAdministrativos("Rector --");
        universidad.setCarreras("Computación - Sistemas");
        universidad.setEstudiantes("Juan - Jose - David");
        universidad.setDocentes("Adrian - Josue");
        universidad.setInfraestructura("Edificio 1, 2, 3, 4, 5");

        String presentar = universidad.presentacionU();

        System.out.printf("---------------\n%s\n\n" +
                "---------------", presentar);
    }
}
