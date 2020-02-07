package taller1;

public class EjecutaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setAnio("2010");
        vehiculo.setMarca("Chevrolet Aveo Emotion");
        vehiculo.setTipo("Sedán");
        vehiculo.setCapacidad("5p");
        vehiculo.setCilindraje("1600cc");

        String presentar = vehiculo.presentacionV();
        System.out.printf("---------------" +
                "\n%s\n\n---------------", presentar);
    }
}
