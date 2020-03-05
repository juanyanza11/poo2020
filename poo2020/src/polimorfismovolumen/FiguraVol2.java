package polimorfismovolumen;

public abstract class  FiguraVol2 {
    protected String nombreF;
    protected double vol;

    public abstract void calcularVol();

    public String getNombreF() {
        return nombreF;
    }

    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }

    public double getVol() {
        return vol;
    }

    public void setVol(double vol) {
        this.vol = vol;
    }
}
