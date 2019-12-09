package sample;

public class Conversione {
    private String tipo;
    private double valore;
    private double metri;
    private double pollici;
    private double piedi;
    private double iarde;
    private double miglia;

    public Conversione() {
        this.valore = 0;
        this.tipo = "Metri";
    }

    public Conversione(double valore,String tipo) {
        this.valore = valore;
        this.tipo = tipo;
    }

    public void setValore(double valore) {
        this.valore = valore;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private double convertiMetri() {
        if(tipo.equals("Iarde"))
            valore *= 0.91;
        if(tipo.equals("Miglia"))
            valore *= 1609.34;
        if(tipo.equals("Piedi"))
            valore *= 0.30;
        if(tipo.equals("Pollici"))
            valore *= 0.0254;
        tipo = "Metri";
        return valore;
    }

    public double getIarde() {
        return convertiMetri()*1.09361;
    }

    public double getMiglia() {
        return convertiMetri()*0.000621;
    }

    public double getPiedi() {
        return convertiMetri()*3.28084;
    }

    public double getPollici() {
        return convertiMetri()*39.37010;
    }

    public double getMetri() {
        return convertiMetri();
    }
}
