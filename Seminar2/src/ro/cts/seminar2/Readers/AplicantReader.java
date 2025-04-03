package ro.cts.seminar2.Readers;

import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class AplicantReader {
    protected String file;

    public abstract class AplicantReader(String file) {
        this.file = file;
    }

    public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    public void ReadAplicantData(Scanner scanner, Aplicant aplicant) {
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nr = scanner.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = scanner.next();
        aplicant.setNume(nume);
        aplicant.setPreunme(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr(nr);
        aplicant.setNr_Proiecte(nr_proiecte);
    }
}
