package ro.ase.cts.Facade.clase;

public class Facade {
	public static boolean esteEligibil(Persoana persoana) {
		if(persoana.getVarsta()>17) {
			Politie politie=new Politie();
			if(!politie.esteUrmarit(persoana)) {
				if(!BirouCredite.areDatorii(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
}
