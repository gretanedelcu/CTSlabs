package cerintaFlyweight.clase;

import java.util.HashMap;
import java.util.Map;


public class FlyweightFactory {
	
private Map<String,FlyweightInterfaceInternare> pacienti;
	
	public FlyweightFactory() {
		super();
		this.pacienti = new HashMap<String,FlyweightInterfaceInternare>();
	}

	public FlyweightInterfaceInternare getPacient(String nume) {
		FlyweightInterfaceInternare flyweight = pacienti.get(nume);
		if(flyweight==null)
		{
			flyweight = new Pacient(nume, 07237524, "ion@gmail.com");
			pacienti.put(nume, flyweight);
		}
		return flyweight;	
	}
}
