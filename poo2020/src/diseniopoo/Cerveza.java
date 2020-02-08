package diseniopoo;

public class Cerveza {
    private Double precio;
    private int unidades;
    private String nombre;
    private String tipo;

    public Cerveza(Double precio, int unidades, String nombre, String tipo) {
        this.precio = precio;
        this.unidades = unidades;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double calcular_total() {
        double total = this.precio * this.unidades;
        return total;
    }

    public String presentar() {
        String cadena = String.format("| Cerveza: %s\n| Tipo: %s\n| Precio: %.2f\n" +
                        "| Unidades Vendidas: %d\n|\n| TOTAL VENTAS $%.2f",
                nombre, tipo, precio, unidades, calcular_total());
        return cadena;
    }

}
