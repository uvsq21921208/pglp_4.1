package uvsq.pglp_4_1;

import static org.junit.Assert.assertArrayEquals;
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
		root = new CompositePersonnel(3);
		
	}
	
	@Test 
	public void testGetRootGroupeIteration() {
	   TypePersonnelIterator tp = root.groupeIteration();
	   assertEquals(tp.getRoot(),root);
	}
	
	@Test 
	public void testEmptyGroupeIteration() {
	   TypePersonnelIterator tp = new GroupeIteration(root);
	   assertFalse(tp.hasNext());
	}
	
	@Test 
	public void testHierachicallIteration() {
		CompositePersonnel g1 = new CompositePersonnel(1);
		CompositePersonnel g2 = new CompositePersonnel(2);
		CompositePersonnel g4 = new CompositePersonnel(4);
		CompositePersonnel g5 = new CompositePersonnel(5);
		CompositePersonnel g6 = new CompositePersonnel(6);
		CompositePersonnel g7 = new CompositePersonnel(7);
		CompositePersonnel g8 = new CompositePersonnel(8);
		root.add(g1);
		root.add(g4);
		root.add(g2);
		g1.add(g6);
		g1.add(g7);
		g2.add(g5);
		g2.add(g8);
		
   TypePersonnelIterator iterator = root.groupeIteration();
		
	    ArrayList<TypePersonnel> expectedArray = new ArrayList<TypePersonnel>();
	    
	    expectedArray.add(g2);
	    expectedArray.add(g8);
	    expectedArray.add(g5);
	    expectedArray.add(g4);
	    expectedArray.add(g1);
	    expectedArray.add(g7);
	    expectedArray.add(g6);
	    
	    
	    
	    ArrayList<TypePersonnel> returnedArray = new ArrayList<TypePersonnel>();
		while (iterator.hasNext()) {
			
			returnedArray.add(iterator.next());
		}
		assertEquals(returnedArray, expectedArray); 
		
	}
	
	@Test 
	public void testEmptyHierachicallIteration() {
	   TypePersonnelIterator tp = new HierachicalIteration(root);
	   assertFalse(tp.hasNext());
	}
	
}
