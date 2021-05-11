package cerintaFlyweight.program;

import cerintaFlyweight.clase.FlyweightFactory;
import cerintaFlyweight.clase.Internare;

public class Main {

	public static void main(String[] args) {
		Internare r1 = new Internare("03/03/2020","vasile");
		Internare r2 = new Internare("04/04/2020","marcel");
		Internare r3 = new Internare("04/04/2020","marcel");
		
		FlyweightFactory spital = new FlyweightFactory();
		spital.getPacient("ion").printeazaInternare(r1);
		spital.getPacient("maria").printeazaInternare(r2);
		spital.getPacient("maria").printeazaInternare(r3);;
		
	}

}
