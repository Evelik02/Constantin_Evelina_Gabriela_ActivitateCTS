package ro.cts.seminar4.factory;
import ro.cts.seminar4.clase.Supa;
import ro.cts.seminar4.clase.SupaCiuperci;
import ro.cts.seminar4.clase.SupaLegume;
import ro.cts.seminar4.clase.SupaVita;
public class Factory {
    private int gramaj;
    private double pretPerSutaDeGr;

    public Factory(int gramaj, double pretPerSutaDeGr) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGr = pretPerSutaDeGr;
    }

    public Supa getSupa(TipuriSupa tipuriSupa, String ingrediente, double extraSupa){
        switch (tipuriSupa){
            case CIUPERCI:
                SupaCiuperci supaCiuperci=new SupaCiuperci(gramaj,pretPerSutaDeGr, ingrediente,extraSupa);
                return supaCiuperci;
            case VITA:
                SupaVita supaVita=new SupaVita(gramaj, pretPerSutaDeGr, ingrediente,extraSupa);
                return supaVita;
            case LEGUME:
                SupaLegume supaLegume=new SupaLegume(gramaj, pretPerSutaDeGr, ingrediente, extraSupa);
                return supaLegume;
            default: return null;
        }
    }
}
