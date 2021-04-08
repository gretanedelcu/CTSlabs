package ro.ase.cts.AdaptorClase;

public class AdaptorCreditClase extends Leasing implements CreditAbstract{

	public AdaptorCreditClase(float suma, String numeClient) {
		super(suma, numeClient);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void oferaCredit() {
		super.imprumuta();
		
	}
}

