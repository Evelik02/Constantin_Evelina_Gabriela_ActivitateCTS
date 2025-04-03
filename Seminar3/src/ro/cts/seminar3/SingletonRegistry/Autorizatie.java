package ro.cts.seminar3.SingletonRegistry;

public class Autorizatie {
    private String detinator;
    private int nrAutorizatie;
    private String data;

    Autorizatie(String detinator, int nrAutorizatie, String data) {
        this.detinator = detinator;
        this.nrAutorizatie = nrAutorizatie;
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder=new StringBuilder("Autorizatie{");
        stringBuilder.append("detinator='").append(detinator).append('\'');
        stringBuilder.append(", nrAutorizatie=").append(nrAutorizatie);
        stringBuilder.append(", data='").append(data).append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
