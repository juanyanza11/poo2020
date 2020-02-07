package taller1;

public class Computadora {
    private String color, marca, generacion, procesador, anio;

    /**
     * Metodo para obtener el color
     * @return color
     */
    public String obtenerColor(){
        return color;
    }

    /**
     * Metodo para obteber la marca
     * @return marca
     */
    public String obtenerMarca(){
        return marca;
    }

    /**
     * Metodo para obtener la generacion
     * @return generacion
     */
    public String obtenerGen(){
        return generacion;
    }

    /**
     * Metodo para obtener el procesador
     * @return procesador
     */
    public String obtenerProcesador(){
        return procesador;
    }

    /**
     * Metodo para obtener año
     * @return anio
     */
    public String obtenerAnio(){
        return anio;
    }

    /***
     * Metodo para actualizar procesador
     * @param procesador
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * Metodo para actualizar marca
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo para actualizar año
     * @param anio
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * Metodo para actualizar color
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo para actualizar generacion
     * @param generacion
     */
    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String presentacionCom(){
        String cadena = String.format("Marca: %s\nColor: " +
                        "%s\nAño%s\nprocesador: %s\ngeneracion: %s"
                , marca, color,anio,procesador, generacion);
        return cadena;
    }
}
