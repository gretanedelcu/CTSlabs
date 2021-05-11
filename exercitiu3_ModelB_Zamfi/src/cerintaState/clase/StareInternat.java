package cerintaState.clase;

public class StareInternat implements Stare{
	@Override
	public void modificaStare(Pacient pacient) {
		if(pacient.getStare() instanceof StareInternat) {
		System.out.println("Pacientul cu nr "+pacient.getNrPacient()+" e deja internat");
	}
		else{
			pacient.setStare(this);
			System.out.println("Pacientul cu nr "+pacient.getNrPacient()+" a fost internat");
		}
}
}
