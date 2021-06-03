package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;

public class TestGrupaWithDummy {

	@Test
	public void testAdaugaStudent() {
		IStudent student = new Student();
		Grupa grupa = new Grupa(1083);
		grupa.adaugaStudent(student);
		assertEquals(1,grupa.getStudenti().size());
	}

}
