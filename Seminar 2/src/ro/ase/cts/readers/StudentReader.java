package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class StudentReader extends AplicantiReader{
	
	
	
	public StudentReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> readAplicanti() throws FileNotFoundException, NumberFormatException {
		Scanner input = new Scanner(new File(super.fileName));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student student=new Student();
			super.readAplicant(input, student);
			
			int an_studii = input.nextInt();
			String facultate = (input.next()).toString();
			student.setAn_studii(an_studii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		input.close();
		return studenti;
	}


}