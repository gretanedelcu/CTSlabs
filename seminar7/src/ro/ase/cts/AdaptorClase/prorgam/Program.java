package ro.ase.cts.AdaptorClase.prorgam;

import ro.ase.cts.AdaptorClase.AdaptorCreditClase;
import ro.ase.cts.AdaptorClase.CreditAbstract;

public class Program {

	public static void afiseazaInfoCredit(CreditAbstract creditAbstract ) {
		creditAbstract.oferaCredit();
	}
	
	public static void main(String[] args) {

		AdaptorCreditClase adaptorClase =  new AdaptorCreditClase(50, "Ana");
		afiseazaInfoCredit(adaptorClase);
	}
	

}
