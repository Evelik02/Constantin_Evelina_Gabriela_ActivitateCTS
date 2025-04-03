package ro.cts.seminar2.Readers;

import ro.cts.seminar2.Clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader {
    public StudentiReader(String file) {
        super(file);
    }
    public static List<Aplicant> readStudents(String file) throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Student>();

        while (input.hasNext()) {
            //to do
            Student aplicant=new Student();
            super.readAplicantData(input, aplicant);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            aplicant.setAnStudii(an_studii);
            aplicant.setFacultate(facultate);
            studenti.add(aplicant);
        }
        input.close();
        return studenti;
    }
}