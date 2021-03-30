package ro.ase.cts.factoryMethod.clase;

public class Medic extends PersonalSpital{
	public Medic(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medic [nume=");
		builder.append(nume);
		builder.append(", getNume()=");
		builder.append(getNume());
		builder.append("]");
		return builder.toString();
}
}
