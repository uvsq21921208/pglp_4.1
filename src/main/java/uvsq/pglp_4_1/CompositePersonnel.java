package uvsq.pglp_4_1;

import java.util.ArrayList;

public class CompositePersonnel implements PersonnelInterface{
    /**
     * Groupe de personnel.
     */
	private ArrayList<PersonnelInterface>personnels;
	/**
	 * 
	 */
	private int id;
	/**
	 * Methode pour l'affichage.
	 */
	public void print() {
		for (PersonnelInterface personnel: personnels ) {
			System.out.println("ID "+id);
			personnel.print();
		}
	}
	/**
	 * 
	 * @param personnel personnel to be added.
	 */
	public void add(PersonnelInterface personnel) {
		this.personnels.add(personnel);
	}
	public CompositePersonnel(int id) {
		this.personnels = new ArrayList<PersonnelInterface>();
		this.id = id;
	}
	/**
	 * 
	 * @param personnel personnel to be removed.
	 */
	public void remvoe(PersonnelInterface personnel) {
		this.personnels.remove(personnel);
	}
	
}
