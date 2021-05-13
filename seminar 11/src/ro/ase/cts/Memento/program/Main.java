package ro.ase.cts.Memento.program;

import ro.ase.cts.Memento.clase.ManagerMemento;
import ro.ase.cts.Memento.clase.MeciJucat;

public class Main {

	public static void main(String[] args) {
		MeciJucat meci1 = new MeciJucat("echipa1","echipa2",10,5,7,10);

		ManagerMemento manager = new ManagerMemento();
		manager.adaugaMemento(meci1.creareMemento());
		
		meci1.setNumeGazda("echipa3");
		meci1.setNumeOaspeti("echipa4");
		meci1.setNrSpectatori(300);
		meci1.setNrJandarmi(10);
	
		manager.adaugaMemento(meci1.creareMemento());
		System.out.println(meci1.toString());
		meci1.setMemento(manager.getMemento(0));
		System.out.println(meci1.toString());
	}

}
