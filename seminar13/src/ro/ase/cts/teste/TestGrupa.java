package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categorii.GetPromovabilitateCategory;
import ro.ase.cts.categorii.TesteNormaleCategory;
import ro.ase.cts.categorii.TesteUrgenteCategory;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGrupa {
	private Grupa grupa;
	
	@Before
	public void setup() {
		grupa = new Grupa(1083);
		for(int i=0 ;i < 35 ;i++) {
			Student student = new Student("maia");
			for(int j=0;j<7;j++) {
				student.adaugaNota(7);	
			}
			grupa.adaugaStudent(student);
		}
	}

	@Test
	public void testConstructorCorrect() {
		Grupa grupa=new Grupa(1083);
		assertEquals(1083, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorLimitaInferioara()
	{
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	@Test
	public void testConstructorLimitaSuperioara()
	{
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorSaArunceExceptie() {
		Grupa grupa = new Grupa(988);
		
	}
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorExceptieInAfaraLimitei() {
		Grupa grupa = new Grupa(1200);
		
	}
	@Test(timeout=500)
	@Category(TesteUrgenteCategory.class)
	public void testConstructorPerformanta() {
		Grupa grupa = new Grupa(1082);
	}
	@Test
	@Category(TesteNormaleCategory.class)
	public void testConstructorExistaListaStudenti() {
		Grupa grupa = new Grupa(1083);
		assertNotNull(grupa.getStudenti());
	}
	@Test
	@Category({GetPromovabilitateCategory.class,TesteNormaleCategory.class})
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1083);
		for(int i=0 ;i < 3 ;i++) {
			Student student = new Student("maia");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for(int i=0 ;i < 7 ;i++) {
			Student student = new Student("womp");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		float promovabilitate = 0.7f;
		assertEquals(promovabilitate, grupa.getPromovabilitate(),0.1);
	}
	@Test
	@Category({GetPromovabilitateCategory.class,TesteUrgenteCategory.class})
	public void testPromovabilitateLowerBoundery() {
		Grupa grupa = new Grupa(1083);
		for(int i=0 ;i < 3 ;i++) {
			Student student = new Student("maia");
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		float promov = 0f;
		assertEquals(promov, grupa.getPromovabilitate(), 0.1);
	}
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateUpperBoundery() {
		Grupa grupa = new Grupa(1083);
		for(int i=0 ;i < 3 ;i++) {
			Student student = new Student("maia");
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		float promov = 1f;
		assertEquals(promov, grupa.getPromovabilitate(), 0.1);
	}
	@Test(expected=IndexOutOfBoundsException.class)
	@Category(GetPromovabilitateCategory.class)
	public void testPromovabilitateErrorCondition() {
		Grupa grupa = new Grupa(1083);
	    grupa.getPromovabilitate();
	}

}
