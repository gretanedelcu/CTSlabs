package ro.ase.cts.Proxy.program;

import ro.ase.cts.Proxy.clase.Credit;
import ro.ase.cts.Proxy.clase.Proxy;
import ro.ase.cts.Proxy.clase.TipMoneda;

public class Program {

	public static void main(String[] args) {
		Credit credit = new Credit();
		credit.OferaCredit(TipMoneda.EUR,100);
		
		Proxy proxy = new Proxy(credit);
		proxy.OferaCredit(TipMoneda.EUR, 100);
		proxy.OferaCredit(TipMoneda.RON, 1000);
	}

}
