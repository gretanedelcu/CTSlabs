package cerintaFlyweight.clase;

public class Salon {
	private int nrSalon;
	private int nrPat;
	private int nrZile;
	public Salon(int nrSalon, int nrPat, int nrZile) {
		super();
		this.nrSalon = nrSalon;
		this.nrPat = nrPat;
		this.nrZile = nrZile;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Salon [nrSalon=");
		builder.append(nrSalon);
		builder.append(", nrPat=");
		builder.append(nrPat);
		builder.append(", nrZile=");
		builder.append(nrZile);
		builder.append("]");
		return builder.toString();
	}
	
	
}
