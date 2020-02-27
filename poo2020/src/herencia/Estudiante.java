package herencia;

/**
 * Esta clase hereda de la clase Persona
 */

public class Estudiante extends Persona{
    // Atributos propios de esta clase
    private String carrera;

    /**
     * Constructor para la clase Estudiante
     * @param nombre
     * @param id
     * @param carrera
     * @param estado_civil
     * @param fecha_nac
     */
    public Estudiante (String nombre, String id, String carrera, String estado_civil,String fecha_nac){
        this.carrera = carrera;
        this.nombre = nombre;
        this.identificacion = id;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nac;

    }


    public void aprender(){
        System.out.println("Metodo para aprender");
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
