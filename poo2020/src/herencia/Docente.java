package herencia;
/**
 * Esta clase hereda de la clase Persona
 */
public class Docente extends Persona{
    // Atributos propios de la clase Docente
    private String area;

    public Docente (String nombre, String id, String estado_civil,String fecha_nac, String area){
        this.nombre = nombre;
        this.identificacion = id;
        this.estado_civil = estado_civil;
        this.fecha_nacimiento = fecha_nac;
        this.area = area;

    }
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void enseniar(){
        System.out.println("Metodo para enseñar");
    }
    public void calificar(){
        System.out.println("Metodo para calificar");
    }
}
