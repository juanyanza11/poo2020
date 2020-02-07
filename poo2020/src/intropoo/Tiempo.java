package intropoo;
public class Tiempo {
    // Definición de atributos globales

    private int hora;
    private int minuto;
    private  int segundo;

    /**
     * metodo para obtener el valor de la variable hora
     * @return this.hora
     */

    public int obtener_hora() {
        return this.hora;
    }

    /**
     * metodo para obtener el valor de la variable minuto
     * @return this.minuto
     */
    public int obtener_minuto() {
        return this.minuto;
    }

    /**
     * metodo para obtener el valor de la vaariable segundo
     * @return this.segundo
     */
    public int obtener_segundo() {
        return this.segundo;
    }

    /**
     * metodo para unir la hora minuto y segundo
     * @return tiempo
     */
    public String obtener_tiempo(){
        String tiempo = hora+":"+minuto+":"+segundo;
        return tiempo;
    }

    /**
     * metodo para actualizar variable hora
     * @param hora
     */
    public void actualizar_hora(int hora){ // int hora variable local
        // this hace referencia a la variable global para no confundirla con la del metodo
        this.hora = hora;
    }

    /**
     * metodo para actualizar variable minuto
     * @param minuto
     */
    public void actualizar_minuto(int minuto){
        this.minuto = minuto;
    }

    /**
     * metodo para actualizar variable segundo
     * @param segundo
     */
    public void actualizar_segundo(int segundo){
        this.segundo = segundo;
    }


}
