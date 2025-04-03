package ro.cts.seminar4.clase;

public class SupaLegume extends Supa{
    private double gramajCrutoane;
    public SupaLegume(int gramaj, double pretPerSutaDeGrame, String ingrediente, double gramajCrutoane) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.gramajCrutoane=gramajCrutoane;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume cu "+gramajCrutoane+" grame de crutoane este gata");
    }

    @Override
    public double calculPret() {
        return super.calculPret()+gramajCrutoane/100*pretPerSutaDeGrame*2;
    }
}