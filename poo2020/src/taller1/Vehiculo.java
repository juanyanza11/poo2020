package taller1;

public class Vehiculo {
    private String marca, tipo, anio, cilindraje, capacidad;

    /**
     * Metodo para obtener la marca
     * @return marca
     */
    public String otenerMarca(){
        return marca;
    }

    /**
     * Metodo para obtener el tipo
     * @return tipo
     */
    public String obtenerTipo(){
        return tipo;
    }

    /**
     * Metodo para obtener el año
     * @return anio
     */
    public String obteneranio(){
        return anio;
    }

    /**
     * Metodo para obtener el cilindraje
     * @return cilindraje
     */
    public String obtenercilindraje(){
        return cilindraje;
    }

    /**
     * Metodo para obtener la capacidad
     * @return capacidad
     */
    public String obtenerCapacidad(){
        return capacidad;
    }

    /**
     * Metodo para actualizar el año
     * @param anio
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * Metodo para actualizar la marca
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo para actualizar el tipo
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo para actualizar la capacidad
     * @param capacidad
     */
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Metodo para actualizar el cilindraje
     * @param cilindraje
     */
    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String presentacionV(){
        String cadena = String.format("Marca: %s\nAño: " +
                        "%s\nCapacidad%s\nCilindraje: %s\ntipo: %s"
                , marca, anio,capacidad,cilindraje, tipo);
        return cadena;
    }
}

