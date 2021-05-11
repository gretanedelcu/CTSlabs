package cerintaState.prorgam;

import cerintaState.clase.Pacient;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pacient p1 = new Pacient(111);
		Pacient p2 = new Pacient(112);
		
		p1.Externeaza();
		p1.Interneaza();
		p1.Interneaza();
		p1.SubObservatie();
		p1.Interneaza();
	}

}
