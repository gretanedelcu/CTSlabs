package ro.ase.cts.factoryMethod.clase.factory;

import ro.ase.cts.factoryMethod.clase.Medic;
import ro.ase.cts.factoryMethod.clase.PersonalSpital;

public class FactoryMedic implements FactoryMethPersonal {

	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Medic(nume);
	}

}
