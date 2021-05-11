package ro.ase.cts.cerinta1.clase;

public class SupaCiuperci implements InterfataSupe{
	private String nume;
	private TipSupa tip;
	
	
	public SupaCiuperci(String nume, TipSupa tip) {
		super();
		this.nume = nume;
		this.tip = tip;
	}


	@Override
	public void gatesteSupa() {
		System.out.println("Se prepara supa de ciuperci");
		
	}

}
