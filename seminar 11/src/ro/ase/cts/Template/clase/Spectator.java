package ro.ase.cts.Template.clase;

public class Spectator extends TemplateSpectator{

	private String nume;
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void seAseazaLaCoada() {
		System.out.println(nume + " se aseaza la coada");
		
	}

	@Override
	public void arataBilet() {
		System.out.println(nume + " arata biletul");
		
	}

	@Override
	public void controlCorporal() {
		System.out.println(nume + " face controlul corporal");
		
	}

	@Override
	public void ocupalocul() {
		System.out.println(nume + " ocupa locul");
		
	}
	

}
