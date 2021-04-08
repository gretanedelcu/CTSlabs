package ro.ase.cts.program;

import ro.ase.cts.clase.AdaptorCreditObiecte;
import ro.ase.cts.clase.CreditAbstract;
import ro.ase.cts.clase.Leasing;

public class Program {

	public static void afiseazaInfoCredit(CreditAbstract creditAbstract, float suma) {
		creditAbstract.oferaCredit(suma);
	}
	
	public static void main(String[] args) {
		Leasing leasing = new Leasing(100, "Ion");
		AdaptorCreditObiecte adaptor= new AdaptorCreditObiecte(leasing);
		afiseazaInfoCredit(adaptor, leasing.getSuma());
	}

}
