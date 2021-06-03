package ro.ase.cts.teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.cts.categorii.TesteNormaleCategory;
import ro.ase.cts.categorii.TesteUrgenteCategory;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;

@RunWith(Categories.class)
@SuiteClasses({ TestGrupa.class, TestGrupaCuFixture.class, TestGrupaWithDummy.class, TestPromovabilitateWithFake.class,
		TestPromovabilitateWithStub.class })
//@IncludeCategory(GetPromovabilitateCategory.class)
@ExcludeCategory({TesteUrgenteCategory.class, TesteNormaleCategory.class})
public class SuitaCustom {

}
