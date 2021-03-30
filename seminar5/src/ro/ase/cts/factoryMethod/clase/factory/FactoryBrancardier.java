package ro.ase.cts.factoryMethod.clase.factory;

import ro.ase.cts.factoryMethod.clase.Brancardier;
import ro.ase.cts.factoryMethod.clase.PersonalSpital;

public class FactoryBrancardier implements FactoryMethPersonal{

	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Brancardier(nume);
	}

}