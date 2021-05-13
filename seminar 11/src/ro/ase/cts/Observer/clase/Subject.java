package ro.ase.cts.Observer.clase;

public interface Subject {
	void adaugareAbonat(Observer observer);
	void stergereAbonat(Observer observer);
	void trimiteMesaj(String mesaj);
}
