package ro.ase.cts.Flyweight.clase;

public class Rezervare {
	private int nrMasa;
	private int rnPers;
	private int oraRezervare;
	public Rezervare(int nrMasa, int rnPers, int oraRezervare) {
		super();
		this.nrMasa = nrMasa;
		this.rnPers = rnPers;
		this.oraRezervare = oraRezervare;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=");
		builder.append(nrMasa);
		builder.append(", rnPers=");
		builder.append(rnPers);
		builder.append(", oraRezervare=");
		builder.append(oraRezervare);
		builder.append("]");
		return builder.toString();
	}
	
	

}
