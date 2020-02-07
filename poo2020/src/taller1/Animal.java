package taller1;

public class Animal {
    private String tipo, nombre, especie,region, sexo;

    /**
     * Metodo para obtener el tipo de animal
     * @return tipo
     */
    public String obtener_tipo(){
        return tipo;
    }

    /**
     * Metodo para obtener el nombre
     * @return nombre
     */
    public String obtener_nombre(){
        return nombre;
    }

    /**
     * Metodo para obtener la especie
     * @return especie
     */
    public String obtener_especie(){
        return especie;
    }

    /**
     * Metodo para obtener la region
     * @return region
     */
    public String obtener_region(){
        return region;
    }

    /**
     * Metodo para obtener el sexo
     * @return sexo
     */
    public String obtener_sexo(){
        return sexo;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para actualizar la especie
     * @param especie
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Metodo para actualizar la region
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Metodo para actualizar el sexo
     * @param sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Metodo para actualizar el tipo
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String presentacionA(){
        String cadena = String.format("Nombre: %s\nEspecie: " +
                        "%s\nRegion%s\nsexo: %s\ntipo: %s"
                , nombre, especie,region, sexo, tipo);
        return cadena;
    }
}
