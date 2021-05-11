package cerintaProxy.program;

import cerintaProxy.clase.Proxy;
import cerintaProxy.clase.Spital;

 

public class Main {

	public static void main(String[] args) {
		Spital spital = new Spital();
		//spital.InterneazaPacient(true);
		
		Proxy proxy = new Proxy(spital);
		proxy.InterneazaPacient(false);
		proxy.InterneazaPacient(true);
	}

}
