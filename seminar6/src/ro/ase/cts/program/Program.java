package ro.ase.cts.program;

import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareBuilder;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare1=new RezervareBuilder().setCodRezervare(20).setAreBauturaInclusa(true).build();
		Rezervare rezervare2=new RezervareBuilder().setCodRezervare(30).setAreMuzicaAmbientala(true).setGenMuzica("pop").build();
		Rezervare rezervare3=new Rezervare(false,true,false,false,null,70);
		
		RezervareBuilder newBuilder= new RezervareBuilder().setAreMancareInclusa(true).setAreBauturaInclusa(true).setAreScaunErgonomic(true);
		Rezervare rezervare4 = newBuilder.setCodRezervare(50).build();
		Rezervare rezervare5 = newBuilder.setCodRezervare(51).build();
		
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		System.out.println(rezervare3);
	}

}
