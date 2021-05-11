package cerintaFlyweight.clase;

public class Pacient implements FlyweightInterfaceInternare{
	private String nume;
	private int nrtel;
	private String adresa;
	public Pacient(String nume, int nrtel, String adresa) {
		super();
		this.nume = nume;
		this.nrtel = nrtel;
		this.adresa = adresa;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pacient [nume=");
		builder.append(nume);
		builder.append(", nrtel=");
		builder.append(nrtel);
		builder.append(", adresa=");
		builder.append(adresa);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public void printeazaInternare(Internare intern) {
		System.out.println(this.toString()+ " " + intern.toString());
		
	}

}
