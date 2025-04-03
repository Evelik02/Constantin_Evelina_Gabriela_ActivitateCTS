package ro.cts.seminar2.Clase;

import ro.cts.seminar2.Readers.AngajatiReader;
import ro.cts.seminar2.Readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {
    AplicantReader aplicantReader = new AngajatiReader("angajati.txt");

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        try {
            listaAplicanti = AplicantReader.readAngajti("angajati.txt");
            for (Aplicant angajat : listaAplicanti)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
