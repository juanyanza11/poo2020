package taller1;

public class Celular {
    private String marca, procesador, material;
    private double precio, peso;

    /**
     * Metodo para obtener la marca
     * @return marca
     */
    public String obtenerMarca(){
        return marca;
    }

    /**
     * Metodo para obtener procesador
     * @return procesador
     */
    public String obtenerProcesador(){
        return procesador;
    }

    /**
     * Metodo para obtener material
     * @return material
     */
    public String ObtenerMaterial(){
        return material;
    }

    /**
     * Metodo para obtener precio
     * @return precio
     */
    public double precio(){
        return precio;
    }

    /**
     * Metodo para obtener peso
     * @return peso
     */
    public double peso(){
        return peso;
    }

    /**
     * Metodo para actualizar la marca
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo para actualizar el material
     * @param material
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Metodo para actualizar el peso
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Metodo para actualizar el precio
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo para actualizar el procesador
     * @param procesador
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String presentacionC(){
        String cadena = String.format("Marca: %s\nMaterial: " +
                        "%s\nPeso: %.1f\nPrecio: %.1f\nProcesador: %s"
                , marca, material,peso,precio, procesador);
        return cadena;
    }
}
