package cerintaState.clase;

public class StareSubObservatie implements Stare{
	@Override
	public void modificaStare(Pacient pacient) {
		if(pacient.getStare() instanceof StareSubObservatie) {
		System.out.println("Pacientul cu nr "+pacient.getNrPacient()+" e deja sub observatie");
	}
		else{
			pacient.setStare(this);
			System.out.println("Pacientul cu nr "+pacient.getNrPacient()+" a fost pus sub observatie");
		}
}
}
