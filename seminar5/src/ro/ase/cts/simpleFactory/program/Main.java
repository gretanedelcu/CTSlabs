package ro.ase.cts.simpleFactory.program;

import ro.ase.cts.simpleFactory.clase.FactoryPersonal;
import ro.ase.cts.simpleFactory.clase.Medic;
import ro.ase.cts.simpleFactory.clase.PersonalSpital;
import ro.ase.cts.simpleFactory.clase.TipPersonal;

public class Main {

	public static void main(String[] args) {
		//=======DESIGN PATTERNS========
		//======= SIMPLE FACTORY ======
		// simple factory folosim cand avem o familie de clase (medic, brancardier, asistent)
		
		// problema cu Spitalul, ex2
		
		//putem sa avem atribute -> facem clasa abstracta (nu interfata)
		// clasa abstracta: PersonalSpital
		//Medic, Brancardier, Asistent <- familia de obiecte
		//TipPersonal - enum cu cele 3
		
		//clasa fabrica: FactoryPersonal
		//getPersonal(TipPersonal):PersonalSpital
		
		try {
			FactoryPersonal factory=new FactoryPersonal();
			PersonalSpital medic=factory.getPersonal(TipPersonal.MEDIC, "Ana" );
			PersonalSpital asistent=factory.getPersonal(TipPersonal.ASISTENT, "Ion");
			
			System.out.println(medic.toString());
			System.out.println(asistent.toString());
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
