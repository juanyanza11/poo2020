package taller1;

public class EjecutaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setNombre("Leon");
        animal.setEspecie("Felino");
        animal.setRegion("África");
        animal.setTipo("Carnivoro");
        animal.setSexo("Femenino");

        String presentar_A = animal.presentacionA();
        System.out.printf("---------------\n%s\n\n" +
                "---------------", presentar_A);
    }
}
