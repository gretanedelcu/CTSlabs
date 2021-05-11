package ro.ase.cts.cerinta1.clase;

public class SupaLegume implements InterfataSupe{
	private String nume;
	private TipSupa tip;
	
	public SupaLegume(String nume, TipSupa tip) {
		super();
		this.nume = nume;
		this.tip = tip;
	}

	@Override
	public void gatesteSupa() {
		System.out.println("Se prepara supa de legume");
		
	}
}
