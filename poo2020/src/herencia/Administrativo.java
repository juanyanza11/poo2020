package herencia;

/**
 * Esta clase hereda de la clase Persona
 */
public class Administrativo extends Persona{
    // Atributos propios de la clase Administrativo
    private String dependencia;
    public Administrativo (String nombre, String id, String estado_civil,String fecha_nac, String dependencia){
        this.nombre = nombre;
        this.identificacion = id;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nac;
        this.dependencia = dependencia;

    }
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getDependencia() {
        return dependencia;
    }
    public void gestionar(){
        System.out.println("Metodo para gestionar");

    }
}
