package ro.ase.cts.simpleFactory.clase;

public class Brancardier extends PersonalSpital {

	public Brancardier(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier [nume=");
		builder.append(nume);
		builder.append(", getNume()=");
		builder.append(getNume());
		builder.append("]");
		return builder.toString();
	}
}