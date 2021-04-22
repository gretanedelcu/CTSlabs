package ro.ase.cts.Strategy.clase;

public class Portofel implements Strategy{

	private float sumaDisponibila;
	
	public Portofel(float sumaDisponibila) {
		super();
		this.sumaDisponibila = sumaDisponibila;
	}

	@Override
	public void realizeazaPlata(float Suma) {
		if(sumaDisponibila>=Suma) {
		System.out.println("Tranzactia a fost efectuata cash pentru suma de " + Suma + "lei");
		sumaDisponibila-= Suma;
		return;
		}
		System.out.println("Fonduri insuficiente");
	}

}
