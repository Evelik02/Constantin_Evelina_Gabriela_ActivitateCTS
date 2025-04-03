package ro.cts.seminar4.clase;

public class SupaVita extends Supa{
    private double pretExtra;
    public SupaVita(int gramaj, double pretPerSutaDeGrame, String ingrediente, double pretExtra) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.pretExtra=pretExtra;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita cu extra la pretul de "+pretExtra+" este gata");
    }

    @Override
    public double calculPret() {
        return super.calculPret()+pretExtra;
    }
}