package ro.ase.cts.factoryMethod.clase.factory;


import ro.ase.cts.factoryMethod.clase.Infirmier;
import ro.ase.cts.factoryMethod.clase.PersonalSpital;

public class FactoryInfirmier implements FactoryMethPersonal {

	@Override
	public PersonalSpital getPersonal(String nume) {
		return new Infirmier(nume);
	}

}