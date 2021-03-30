package ro.ase.cts.factoryMethod.program;

import ro.ase.cts.factoryMethod.clase.factory.FactoryAsistent;
import ro.ase.cts.factoryMethod.clase.factory.FactoryInfirmier;
import ro.ase.cts.factoryMethod.clase.factory.FactoryMedic;
import ro.ase.cts.factoryMethod.clase.factory.FactoryMethPersonal;
import ro.ase.cts.factoryMethod.clase.Medic;
import ro.ase.cts.factoryMethod.clase.PersonalSpital;

public class Main {
	
	// functia asta e clientul din diagrama - interiactioneaza doar cu FactoryPersonal si PersonalSpital
	// foloseste dependency inversion principle (doar clasele abstracte)
	public static void printeazaPersonalSpital(FactoryMethPersonal fabrica, String nume) {
		PersonalSpital personalSpital=fabrica.getPersonal(nume);
		System.out.println(personalSpital.toString());
	}

	public static void main(String[] args) {
		// ====== FACTORY METHOD ======
		
		// problema cu spitalul, ex 3
		
		FactoryMedic medic=new FactoryMedic();
		printeazaPersonalSpital(medic,"Ana FactoryMethod");
		printeazaPersonalSpital(new FactoryAsistent(), "Ion FactoryMethod");
		
		
		// daca vrem sa adaugam un nou tip (ex Infirmier) 
		//nu trebuie sa modificam in alte clase - respectam principiul open-close
		//doar adaugam clasa Infirmier si clasa FactoryInfirmier 
		//==asta e avantajul pentru FactoryMethod fata de SimpleFactory
		//==dezavantaj: multe clase
		
		printeazaPersonalSpital(new FactoryInfirmier(), "Maria FactoryMethod");
	}


}
