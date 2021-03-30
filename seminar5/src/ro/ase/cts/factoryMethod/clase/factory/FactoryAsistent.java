package ro.ase.cts.factoryMethod.clase.factory;

import ro.ase.cts.factoryMethod.clase.Asistent;
import ro.ase.cts.factoryMethod.clase.PersonalSpital;

public class FactoryAsistent implements FactoryMethPersonal {

	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Asistent(nume);
	}

}