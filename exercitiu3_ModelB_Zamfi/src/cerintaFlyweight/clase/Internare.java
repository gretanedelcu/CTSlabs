package cerintaFlyweight.clase;

public class Internare {
	private String data;
	private String numeDoctor;
	public Internare(String data, String numeDoctor) {
		super();
		this.data = data;
		this.numeDoctor = numeDoctor;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Internare [data=");
		builder.append(data);
		builder.append(", numeDoctor=");
		builder.append(numeDoctor);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
