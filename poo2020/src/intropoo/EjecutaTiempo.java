package intropoo;

public class EjecutaTiempo {
    public static void main(String[] args) {
        /**
         * ENCAPSULAMIENTO VARIABLES EN METODOS
         */
        Tiempo tiempo = new Tiempo();
        tiempo.actualizar_hora(10);
        tiempo.actualizar_minuto(51);
        tiempo.actualizar_segundo(33);

        String mostrar_tiempo = tiempo.obtener_tiempo();
        System.out.println(mostrar_tiempo);
    }
}
