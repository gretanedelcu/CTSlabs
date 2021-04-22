package ro.ase.cts.Flyweight.clase;

public class Companie {
	private String numeCompanie;
	private String nrTelefon;
	private String CUI;
	
	public Companie(String numeCompanie, String nrTelefon, String cUI) {
		super();
		this.numeCompanie = numeCompanie;
		this.nrTelefon = nrTelefon;
		CUI = cUI;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Companie [numeCompanie=");
		builder.append(numeCompanie);
		builder.append(", nrTelefon=");
		builder.append(nrTelefon);
		builder.append(", CUI=");
		builder.append(CUI);
		builder.append("]");
		return builder.toString();
	}
	
	public void printeazaRezervare(Rezervare rezervare) {
		System.out.println(rezervare.toString());
		
	}
}
