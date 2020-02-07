package taller1;

public class Docente {
    private String nombre, fecha_nac, correo, ci, direccion;

    /**
     * Metodo para obtener el nombre
     * @return nombre
     */
    private String obtenernombre(){
        return nombre;
    }

    /**
     * Metodo para obtener la fecha nacimiento
     * @return fecha_nac
     */
    public String obtenerFecha_nac() {
        return fecha_nac;
    }

    /**
     * Metodo para obtener el correo
     * @return correo
     */
    public String obtenerCorreo() {
        return correo;
    }

    /**
     * Metodo para obtener la cedula
     * @return ci
     */
    public String obtenerCi() {
        return ci;
    }

    /**
     * Metodo para obtener la direccion
     * @return direccion
     */
    public String obtenerdireccion() {
        return direccion;
    }

    /**
     * Metodo para actualizar correo
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo para actualizar cedula
     * @param ci
     */
    public void setCi(String ci) {
        this.ci = ci;
    }

    /**
     * Metodo para actualizar dirección
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo para actualizar fecha de direccion
     * @param fecha_nac
     */
    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    /**
     * Metodo para actualizar el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String presentacionD(){
        String cadena = String.format("Nombre: %s\nCedula: %s\nCorreo:" +
                        " %s\nFecha Nac: %s\nDireccion: %s"
                , nombre,ci,correo, fecha_nac, direccion);
        return cadena;
    }
}
