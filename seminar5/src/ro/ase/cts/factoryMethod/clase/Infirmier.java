package ro.ase.cts.factoryMethod.clase;

public class Infirmier extends PersonalSpital {

	public Infirmier(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Infirmier [nume()=");
		builder.append(getNume());
		builder.append("]");
		return builder.toString();
	}

}
