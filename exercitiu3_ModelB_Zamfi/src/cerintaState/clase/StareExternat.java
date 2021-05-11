package cerintaState.clase;

public class StareExternat implements Stare{

	@Override
	public void modificaStare(Pacient pacient) {
		if(pacient.getStare() instanceof StareInternat || pacient.getStare() instanceof StareSubObservatie ) {
		pacient.setStare(this);
	}
		else{
			System.out.println("Pacientul e deja externat");
		}

}
	}
