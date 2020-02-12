package disenio_seleccion;

public class Dia {
    private int dia;
    private String dia_cadena;


    protected int getDia() {
        return dia;
    }

    protected void setDia(int dia) {
        this.dia = dia;
    }

    protected String getDia_cadena() {
        return dia_cadena;
    }

    protected void setDia_cadena(String dia_cadena) {
        this.dia_cadena = dia_cadena;
    }

    public String calcularDia()

    {
        switch (dia) {
            default:
                dia_cadena = "Opcion Incorrecta";
                break;
            case 1:
                dia_cadena = "Domingo";
                break;
            case 2:
                dia_cadena = "Lunes";
                break;
            case 3:
                dia_cadena = "Martes";
                break;
            case 4:
                dia_cadena = "Miercoles";
                break;
            case 5:
                dia_cadena = "Jueves";
                break;
            case 6:
                dia_cadena = "Viernes";
                break;
            case 7:
                dia_cadena = "Sábado";
                break;
        }
        return dia_cadena;
    }
}

