package uvsq.pglp_4_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PersonnelTest {
	public CompositePersonnel root;
	
	
	@Test
	public void BuilderTest(){
	Personnel p1 = new Personnel.PersonelBuilder("Mouttie", "Djekhaba", "CS").build();
	assertEquals(p1.getPrenom(), "Djekhaba");
	assertEquals(p1.getNom(), "Mouttie");
	assertEquals(p1.getFonction(), "CS");
	
	}
	@Test
	public void compositeTest() {
		
		TypePersonnel p1 = new Personnel.PersonelBuilder("Mouttie", "Djekhaba", "CS").build();
		int id = 1;
		CompositePersonnel groupe = new CompositePersonnel(id);
		groupe.add(p1);
		
		List<TypePersonnel> expectedGroupePersons = new ArrayList<TypePersonnel>();
		expectedGroupePersons.add(p1);
		assertEquals(groupe.getAllPersonnel(), expectedGroupePersons);
	}
	
	
	
	@Before
	public void setUP() {
		root = new CompositePersonnel(1);
		
	}
	
	@Test 
	public void testGetRootGroupeIteration() {
	   TypePersonnelIterator tp = root.groupeIteration();
	   System.out.println(root.toString()+" "+tp.getRoot().toString());
	   assertEquals(tp.getRoot(),root);
	}
	
	@Test 
	public void testEmptyGroupeIteration() {
	   TypePersonnelIterator tp = new GroupeIteration(root);
	   assertFalse(tp.hasNext());
	}
	
	@Test 
	public void testHierachicallIteration() {
      TypePersonnelIterator tp = root.hierachical();
	   System.out.println(root.toString()+" "+tp.getRoot().toString());
	   assertEquals(tp.getRoot(),root);
	}
	
	@Test 
	public void testEmptyHierachicallIteration() {
	   TypePersonnelIterator tp = new HierachicalIteration(root);
	   assertFalse(tp.hasNext());
	}
	
}
