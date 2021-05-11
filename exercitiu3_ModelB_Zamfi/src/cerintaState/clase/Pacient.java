package cerintaState.clase;

public class Pacient {
	private int nrPacient;
	private Stare stare;
	
	public Pacient(int nrPacient) {
		super();
		this.nrPacient = nrPacient;
		this.stare = stare;
	}
	public Stare getStare() {
		return stare;
	}
	public void setStare(Stare stare) {
		this.stare = stare;
	}
	public int getNrPacient() {
		return nrPacient;
	}
	
	public void Interneaza() {
		Stare pacient = new StareInternat();
		pacient.modificaStare(this);
	}
	public void Externeaza() {
		Stare pacient = new StareExternat();
		pacient.modificaStare(this);
	}
	public void SubObservatie() {
		Stare pacient = new StareSubObservatie();
		pacient.modificaStare(this);
	}
}
