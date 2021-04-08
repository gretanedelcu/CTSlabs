package ro.ase.cts.Facade.prorgam;

import ro.ase.cts.Facade.clase.Facade;
import ro.ase.cts.Facade.clase.Persoana;

public class Program {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("7653426534255", "Andreea");
		
		if(Facade.esteEligibil(persoana)) {
			System.out.println("Oferim credit");
		}else {
			System.out.println("Nu oferim credit");
		}

	}

}
