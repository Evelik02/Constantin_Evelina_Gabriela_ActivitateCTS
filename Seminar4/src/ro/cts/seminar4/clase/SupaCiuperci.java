package ro.cts.seminar4.clase;

public class SupaCiuperci extends Supa{
    private double cantitateCiuperci;
    public SupaCiuperci(int gramaj, double pretPerSutaDeGrame, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretPerSutaDeGrame, ingrediente);
        this.cantitateCiuperci=cantitateCiuperci;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de ciuperci cu cantitatea de ciuperci "+cantitateCiuperci+" este gata");
    }

    //la seminar am lasat private nu protected si am facut getteri deci aveam getPretPerSutaDeGrame
    @Override
    public double calculPret() {
        return super.calculPret()+cantitateCiuperci/100*pretPerSutaDeGrame;
    }
}
