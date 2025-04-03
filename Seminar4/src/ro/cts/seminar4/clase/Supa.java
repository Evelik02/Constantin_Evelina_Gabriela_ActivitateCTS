package ro.cts.seminar4.clase;

public abstract class Supa {
    protected int gramaj;
    protected double pretPerSutaDeGrame;
    protected String ingrediente;
    public abstract void preparareSupa();
    public double calculPret(){
        return gramaj/100*pretPerSutaDeGrame;
}
    public Supa(int gramaj, double pretPerSutaDeGrame, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGrame = pretPerSutaDeGrame;
        this.ingrediente = ingrediente;
    }
}