package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ContCient;

public class Program {

	public static void main(String[] args) {
		 ContCient contClient1= new ContCient("Ioana",21,20);
		 ContCient contClient2 =(ContCient) contClient1.copiaza();
		 
		 System.out.println(contClient1);
		 System.out.println(contClient2);
		 
		 Bilet biletPrototype = new Bilet(1,"Echipa1","Echipa2","01/03/2021");
		 Bilet bilet1 = (Bilet) biletPrototype.copiaza();
		 Bilet bilet2=(Bilet) biletPrototype.copiaza();
		 
		 System.out.println(bilet1);
		 System.out.println(bilet2);
	}

}
