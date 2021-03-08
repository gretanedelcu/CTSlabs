package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantiReader {

	protected String fileName;
	
	
	public AplicantiReader(String fileName) {
		super();
		this.fileName = fileName;
	}

	public abstract List<Aplicant> citesteAplicanti() throws FileNotFoundException;
}
