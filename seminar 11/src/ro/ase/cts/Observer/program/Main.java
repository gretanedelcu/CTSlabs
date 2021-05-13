package ro.ase.cts.Observer.program;

import ro.ase.cts.Observer.clase.Client;
import ro.ase.cts.Observer.clase.ManagerSala;
import ro.ase.cts.Observer.clase.Observer;

public class Main {

	public static void main(String[] args) {
		ManagerSala manager = new ManagerSala("sala 3");
		Observer client1= new Client("ana");
		Observer client2= new Client("maria");
		Observer client3= new Client("alex");

		manager.adaugareAbonat(client1);
		manager.adaugareAbonat(client2);
		manager.adaugareAbonat(client3);
		
		manager.trimiteAnuntImp("Volley");
		manager.stergereAbonat(client3);
		manager.trimiteAnuntImp("Handbal");
	}

}
