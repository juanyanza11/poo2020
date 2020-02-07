package taller1;

public class Estudiante {
    private String nombre;
    private  String fecha_nac;
    private String correo;
    private int edad;
    private String ci;

    /**
     * Metodo para obtener el nombre
     * @return nombre
     */
    public String obtenernombre(){
    return nombre;
   }

    /**
     * Metodo para obtener fecha nacimiento
     * @return fecha_nac
     */
    public String obtenerfechanac(){
        return fecha_nac;
    }

    /**
     * Metodo para obtener correo
     * @return correo
     */
    public String obtenercorreo(){
        return correo;
    }

    /**
     * Metodo para obtener edad
     * @return edad
     */
    public int obteneredad(){
        return edad;
    }

    /**
     * Metodo para obtener cedula
     * @return ci
     */
    public String obtenerci(){
        return ci;
    }

    // ACTUALIZAR DATOS

    /**
     * Metodo para actualizar nombre
     * @param nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Metodo para actualizar fecha nacimiento
     * @param fecha_nac
     */
    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    /**
     * Metodo para actualizar correo
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Metodo para actualizar edad
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo para actualizar cédula
     * @param ci
     */
        public void setCi(String ci) {
            this.ci = ci;
        }

        public String presentacionE(){
            String cadena = String.format("Nombre: %s\nEdad: " +
                            "%d\nCedula%s\nCorreo: %s\nFecha Nac: %s"
                    , nombre, edad,ci,correo, fecha_nac);
            return cadena;
        }
    }



