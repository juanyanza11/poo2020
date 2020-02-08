package diseniopoo2;

public class EstudianteNotas {
    private double nota1;
    private double nota2;
    private double total;
    private String nombre, materia;

    /**
     * Constructor que recibe los parametros enviados del main a traves del objeto
     *
     * @param nota1
     * @param nota2
     * @param nombre
     * @param materia
     */
    public EstudianteNotas(double nota1, double nota2, String nombre, String materia) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nombre = nombre;
        this.materia = materia;
        total = this.nota1 + this.nota2;

    }

    /**
     * Metodo para determinar el estado de una materia Aprobado o Reprobado
     *
     * @return estado
     */
    public String estadoEstudiante() {
        String estado = "";
        if (total >= 27.5) {
            estado = "APROBADO";
        } else {
            if (total < 27.5) {
                estado = "SUPLETORIO";
            }
        }
        return estado;
    }

    /**
     * Metodo para retornar la presentacion al metodo main
     *
     * @return cadena
     */
    public String presentar() {
        String cadena = String.format("| Nombre Estudiante: %s\n| Materia: %s\n" +
                "| Nota Bim1: %.2f\n| Nota Bim2: %.2f\n| Total: %.2f\n------" +
                        "-------------------------------------------\n" +
                "♦♦♦♦♦♦\tEstado: %s\t♦♦♦♦♦♦", nombre, materia, nota1, nota2,
                total, estadoEstudiante());
        return cadena;
    }

}
