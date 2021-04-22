package ro.ase.cts.Strategy.program;

import ro.ase.cts.Strategy.clase.Card;
import ro.ase.cts.Strategy.clase.Client;

import ro.ase.cts.Strategy.clase.Portofel;

public class Program {

	public static void main(String[] args) {
		Portofel portofel= new Portofel(300);
		Client client1 = new Client(portofel, "Greta");
		
		client1.platesteNota(200);
		client1.setStrategy(new Card());
		
		client1.platesteNota(200);
		
		client1.setStrategy(portofel);
		client1.platesteNota(200);
	}

}
