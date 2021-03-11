package ro.ase.cts.program;

import java.io.FileNotFoundException;

import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantiReader;

public class Program {

	public static List<Aplicant> CitesteAplicanti(AplicantiReader reader) throws FileNotFoundException{
		return reader.readAplicanti();
	}
	
	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			listaAngajati = CitesteAplicanti(new AngajatReader("angajati.txt"));
			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				System.out.println("angajatul are finantarea: " + angajat.getFinantare());
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}