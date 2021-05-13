package ro.ase.cts.Template.clase;

public abstract class TemplateSpectator {
	public abstract void seAseazaLaCoada();
	public abstract void arataBilet();
	public abstract void controlCorporal();
	public abstract void ocupalocul();
	
	public final void intrareStadion() {
		seAseazaLaCoada();
		arataBilet();
		controlCorporal();
		ocupalocul();
	}
}
