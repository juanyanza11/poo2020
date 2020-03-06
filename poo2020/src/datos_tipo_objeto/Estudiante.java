package datos_tipo_objeto;

public class Estudiante {
    private String nombre;
    private String ci;
    private String correo;

    public Estudiante(){

    }
    public Estudiante(String nombre, String ci, String correo, String carrera, int edad) {
        this.nombre = nombre;
        this.ci = ci;
        this.correo = correo;
        this.carrera = carrera;
        this.edad = edad;
    }

    private String carrera;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
