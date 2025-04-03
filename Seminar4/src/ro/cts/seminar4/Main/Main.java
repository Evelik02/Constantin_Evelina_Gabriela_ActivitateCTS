package ro.cts.seminar4.Main;

public class Main {
    public static void main(String[] args) {

        //factory
        Factory factory=new Factory(200,12);
        Supa supaVita= factory.getSupa(TipuriSupa.VITA, "Vita, bors", 20);
        supaVita.preparareSupa();
        Supa supaLegume=factory.getSupa(TipuriSupa.LEGUME, "Legume, bors", 22);
        supaLegume.preparareSupa();
        Supa supaCiuperci=factory.getSupa(TipuriSupa.CIUPERCI, "Ciuperci, alte legume", 15);
        supaCiuperci.preparareSupa();
        //prototype
        ARezervare rezervare=new Rezervare("Mihai", 10, "21.10.25", "14:00");
        ARezervare rezervare1=rezervare.copiaza();
        ARezervare rezervare2=rezervare.copiaza();
        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());


    }
}