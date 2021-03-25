package ro.ase.cts.clase;

public class Garsoniera {
	private String locatie;
	private int suprafata;
	private boolean balcon;
	
	private static Garsoniera garsoniera = null;
	
	private Garsoniera(String locatie, int suprafata, boolean balcon) {
		super();
		this.locatie = locatie;
		this.suprafata = suprafata;
		this.balcon = balcon;
	}
	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}
	public void setSuprafata(int suprafata) {
		this.suprafata = suprafata;
	}
	public void setBalcon(boolean balcon) {
		this.balcon = balcon;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Garsoniera [locatie=");
		builder.append(locatie);
		builder.append(", suprafata=");
		builder.append(suprafata);
		builder.append(", pret=");
		builder.append(balcon);
		builder.append("]");
		return builder.toString();
	}
	
	public static synchronized Garsoniera getInstance(String locatie, int suprafata, boolean balcon) {
		if(garsoniera==null) {
			garsoniera = new Garsoniera(locatie,suprafata,balcon);
		}
		return garsoniera;
	}
}
