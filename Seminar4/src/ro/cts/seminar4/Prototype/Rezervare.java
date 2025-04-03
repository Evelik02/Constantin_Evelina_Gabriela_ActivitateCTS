package ro.cts.seminar4.Prototype;

public class Rezervare extends ARezervare {
    public void descriere(){
        System.out.println("Aceasta este o rezervare");
    }
    public Rezervare(String numeClient, int nrPersoane, String dataRezervare, String ora) {
        super(numeClient, nrPersoane, dataRezervare, ora);
    }

    public Rezervare() {
        super();
    }

    @Override
    public ARezervare copiaza() {
        Rezervare rezervareNoua=new Rezervare();
        rezervareNoua.numeClient=this.numeClient;
        rezervareNoua.NrPersoane=this.NrPersoane;
        rezervareNoua.dataRezervare=this.dataRezervare;
        rezervareNoua.ora=this.ora;
        return rezervareNoua;
    }
}
