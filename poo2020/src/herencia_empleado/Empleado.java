package herencia_empleado;

public class Empleado {
    /**
     * Atriutos que heredará a las clases hijas
     */
    protected String nombre;
    protected String cargo;
    protected String dependencia;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
}
