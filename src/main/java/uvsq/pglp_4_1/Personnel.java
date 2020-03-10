package uvsq.pglp_4_1;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * 
 * @author Mouttie Classe personnel.
 */
public final class Personnel implements PersonnelInterface{
	/**
	 * Le nom d'un personnel.
	 */
	private String nom;
	/**
	 * Le prenom d'un personnel.
	 */
	private String prenom;
	/**
	 * Le numero du telephone.
	 */
	private ArrayList<String> telephones;
	/**
	 * date de naissance.
	 */
	private LocalDate dataDeNaissance;
	/**
	 * Fonction.
	 */
	private String fonction;

	public static class PersonelBuilder {
		/**
		 * Le nom d'un personnel.
		 */
		private String nom;
		/**
		 * Le prenom d'un personnel.
		 */
		private String prenom;
		/**
		 * Le numero du telephone.
		 */
		private ArrayList<String> telephones = null;
		/**
		 * date de naissance.
		 */
		private LocalDate dataDeNaissance = null;
		/**
		 * Fonction.
		 */
		private String fonction;
		public PersonelBuilder(String nom, String prenom, String fonction) {
			this.nom = nom;
			this.prenom = prenom;
			this.fonction = fonction;
		}
		public PersonelBuilder dateNaissance(LocalDate date) {
		    this.dataDeNaissance = date;
			return this;
		}
		
		public PersonelBuilder telephone(String phone) {
			this.telephones = new ArrayList<String>();
			this.telephones.add(phone);
			return this;
		}
		public Personnel build() {
			return new Personnel(this);
		}

	}

	private Personnel(PersonelBuilder builder) {
		this.nom = builder.nom;
		this.prenom = builder.prenom;
		this.fonction = builder.fonction;
	}
	/**
	 *Print implementation.
	 * @return 
	 */
	public void print() {
		System.out.println("Nom "+nom+"Prenom "+prenom+" Fonction"+fonction);
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public ArrayList<String> getTelephones() {
		return telephones;
	}
	public LocalDate getDataDeNaissance() {
		return dataDeNaissance;
	}
	public String getFonction() {
		return fonction;
	}

}
