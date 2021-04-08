package ro.ase.cts.Facade.clase;

public class Politie {
	public boolean esteUrmarit(Persoana persoana) {
		if(Integer.parseInt(""+persoana.getCNP().charAt(11))%2==0) {
			return true;
		}
		return false;
	}
}
