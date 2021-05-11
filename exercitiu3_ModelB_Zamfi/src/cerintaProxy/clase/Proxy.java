package cerintaProxy.clase;

public class Proxy implements InterfaceSpital{

private InterfaceSpital spital;
	
	public Proxy(InterfaceSpital spital) {
		super();
		this.spital = spital;
	}
	
	@Override
	public void InterneazaPacient(boolean areAsigurare) {
		if(areAsigurare) {
			spital.InterneazaPacient(areAsigurare);
		}
		else {
			System.out.println("Pacientul nu are asigurare!!");
		}
	}

}
