package ro.ase.cts.simpleFactory.program;

import ro.ase.cts.simpleFactory.clase.FactoryPersonal;
import ro.ase.cts.simpleFactory.clase.Medic;
import ro.ase.cts.simpleFactory.clase.PersonalSpital;
import ro.ase.cts.simpleFactory.clase.TipPersonal;

public class Main {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		FactoryPersonal factoryPersonal= new FactoryPersonal();
		PersonalSpital medic=factoryPersonal.getPersonal(TipPersonal.MEDIC,"Ana");
		PersonalSpital asistent=factoryPersonal.getPersonal(TipPersonal.ASISTENT,"Catalin");
		
		System.out.println(medic.toString());
		System.out.println(asistent.toString());
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
