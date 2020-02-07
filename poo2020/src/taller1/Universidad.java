package taller1;

public class Universidad {
    private String carreras, estudiantes, docentes, administrativos,
            infraestructura;

    /**
     * Metodo para ontener carreras
     * @return carreras
     */
    public String obtenerCarreras(){
        return carreras;
    }

    /**
     * Metodo para obtener Estudiante
     * @return estudiantes
     */
    public String obteerEstudiantes(){
        return estudiantes;
    }

    /**
     * Metodo para obtener Docentes
     * @return docentes
     */
    public String obtenerDocentes(){
        return docentes;
    }

    /**
     * Metodo para obtener Administrativos
     * @return administrativos
     */
    public String obtenerAdminis(){
        return administrativos;
    }

    /**
     * Metodo para obtener Infraestructura
     * @return infraestructura
     */
    public String obtenerInfraestructura(){
        return infraestructura;
    }

    /**
     * Actualizar datos administrativos
     * @param administrativos
     */
    public void setAdministrativos(String administrativos) {
        this.administrativos = administrativos;
    }

    /**
     * Actualizar datos carreras
     * @param carreras
     */
    public void setCarreras(String carreras) {
        this.carreras = carreras;
    }

    /**
     * Actualizar datos docentes
     * @param docentes
     */
    public void setDocentes(String docentes) {
        this.docentes = docentes;
    }

    /**
     * Actualizar datos estudiantes
     * @param estudiantes
     */
    public void setEstudiantes(String estudiantes) {
        this.estudiantes = estudiantes;
    }

    /**
     * Actualizar datos infraestructura
     * @param infraestructura
     */
    public void setInfraestructura(String infraestructura) {
        this.infraestructura = infraestructura;
    }

    public String presentacionU(){
        String cadena = String.format("Carreras: %s\nEstudiantes: " +
                        "%s\nDocente: %s\nAdministrativos: %s\nInfraestructura: %s"
                , carreras, estudiantes,docentes,administrativos, infraestructura);
        return cadena;
    }
}
