package ro.ase.cts.simpleFactory.clase;

public class Asistent extends PersonalSpital{
	public Asistent(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asistent [nume=");
		builder.append(nume);
		builder.append(", getNume()=");
		builder.append(getNume());
		builder.append("]");
		return builder.toString();
}
}
