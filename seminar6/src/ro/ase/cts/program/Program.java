package ro.ase.cts.program;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareBuilder;
import ro.ase.cts.clase.RezervareBuilderV2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare1=new RezervareBuilder().setCodRezervare(20).setAreBauturaInclusa(true).build();
		Rezervare rezervare2=new RezervareBuilder().setCodRezervare(30).setAreMuzicaAmbientala(true).setGenMuzica("pop").build();
		Rezervare rezervare3=new Rezervare(false,true,false,false,null,70);
		
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		System.out.println(rezervare3);
		
		RezervareBuilder newBuilder= new RezervareBuilder().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
		Rezervare rezervare4 = newBuilder.setCodRezervare(50).build();
		Rezervare rezervare5 = newBuilder.setCodRezervare(51).build();
		
		// nu mai avem shallow, dar incalcam dry ca avem in ambele clase aceleasi atribute
				RezervareBuilderV2 builderV2 = new RezervareBuilderV2().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
				Rezervare rezervare6= builderV2.setCodRezervare(100).build();
				Rezervare rezervare7= builderV2.setCodRezervare(101).build();
	}

}
