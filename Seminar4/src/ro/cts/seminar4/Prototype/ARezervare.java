package ro.cts.seminar4.Prototype;

public abstract class ARezervare {
    protected String numeClient;
    protected int NrPersoane;
    protected String dataRezervare;
    protected String ora;

    public ARezervare(String numeClient, int nrPersoane, String dataRezervare, String ora) {
        if(numeClient.length()>3){
            this.numeClient = numeClient;
        } else{
            this.numeClient="Necunoscut";
        }
        if(nrPersoane>=2){
            NrPersoane = nrPersoane;
        } else{
            this.NrPersoane=20;
        }
        if(dataRezervare.length()==8){
            this.dataRezervare = dataRezervare;
        }
        this.ora = ora;
    }

    public ARezervare() {
        numeClient="Client";
        NrPersoane=1;
        dataRezervare="01.01.2025";
        this.ora="20:00";
    }

    public abstract void descriere();
    public abstract ARezervare copiaza();

    @Override
    public String toString() {
        return "ARezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", NrPersoane=" + NrPersoane +
                ", dataRezervare='" + dataRezervare + '\'' +
                ", ora='" + ora + '\'' +
                '}';
    }
}
