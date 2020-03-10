package uvsq.pglp_4_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonnelTest {

	
	
	@Test
	public void BuilderTest(){
	Personnel p1 = new Personnel.PersonelBuilder("Mouttie", "Djekhaba", "CS").build();
	assertEquals(p1.getPrenom(), "Djekhaba");
	assertEquals(p1.getNom(), "Mouttie");
	assertEquals(p1.getFonction(), "CS");
	
	}
	@Test
	public void compositeTest() {
		
		Personnel p1 = new Personnel.PersonelBuilder("Mouttie", "Djekhaba", "CS").build();
		int id = 1;
		CompositePersonnel groupe = new CompositePersonnel(id);
		groupe.add(p1);
		
	}
}
