package deber_seleccion;

public class EstudianteNota {
    private double nota1,nota2,nota3,nota4, promedio;
    private String nombre, estado;

    /**
     * Metodo Constructor para recibir parámetros enviados desde la clase principal
     * @param nota1
     * @param nota2
     * @param nota3
     * @param nota4
     * @param nombre
     */
    public EstudianteNota(double nota1,double nota2,double nota3, double nota4, String nombre){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nombre = nombre;
    }

    /**
     * Metodo para calcular el promedio
     * @return promedio
     */
    public Double calcularPromedio(){
        promedio = (nota1 + nota2 + nota3 + nota4)/4;
        return promedio;
    }

    /**
     * Metodo para definir el estado del estudiante aprobado o reprobado
     * @return
     */
    public String estadoEstudiante(){
        if (promedio > 60){
            estado = "Aprobado";
        }else{
            if (promedio < 60){
                estado = "Reprobado";
            }
        }
        return estado;
    }

    public String presentar(){
        String cadena = String.format("Estudiante: %s\nPromedio: %.2f\nEstado: " +
                "%s", nombre,calcularPromedio(),estadoEstudiante());
        return cadena;
    }
}
