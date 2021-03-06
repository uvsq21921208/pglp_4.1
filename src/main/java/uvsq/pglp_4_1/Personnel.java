package uvsq.pglp_4_1;

import java.time.LocalDate;
import java.util.ArrayList;


/**
 *
 * @author Mouttie Classe personnel.
 */
public final class Personnel extends TypePersonnel {
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
   /**
    *
    * personnel builder.
    *
    */
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
   /**
    *
    * @param nomPara nom.
    * @param prenomPara prenom.
    * @param fonctionPara fonction.
    */
   public PersonelBuilder(
     final String nomPara, final String prenomPara, final String fonctionPara) {
      this.nom = nomPara;
      this.prenom = prenomPara;
      this.fonction = fonctionPara;
   }
   /**
    *
    * @param datePara date de naissance.
    * @return instance.
    */
   public PersonelBuilder dateNaissance(final LocalDate datePara) {
   this.dataDeNaissance = datePara;
      return this;
   }
   /**
    *
    * @param phonePara phone.
    * @return instance.
    */
   public PersonelBuilder telephone(final String phonePara) {
      this.telephones = new ArrayList<String>();
      this.telephones.add(phonePara);
      return this;
   }
    /**
    *
    *
    * @return instance.
    */
   public Personnel build() {
      return new Personnel(this);
   }

   }
      /**
    *
    * @param builder builder object.
    */
   private Personnel(final PersonelBuilder builder) {
   this.nom = builder.nom;
   this.prenom = builder.prenom;
   this.fonction = builder.fonction;
   }
   /**
    *
    * @return nom.
    */
   public String getNom() {
   return nom;
   }
    /**
    *
    * @return prenom.
    */
   public String getPrenom() {
   return prenom;
   }
    /**
    *
    * @return List des telephones.
    */
   public ArrayList<String> getTelephones() {
   return telephones;
   }
    /**
    *
    * @return date de naissance.
    */
   public LocalDate getDataDeNaissance() {
   return dataDeNaissance;
   }
    /**
    *
    * @return fonction.
    */
   public String getFonction() {
   return fonction;
   }
    /**
    *
    * @return groupe ou pas.
    */
   @Override
   public boolean isGroupe() {

   return false;
   }
    /**
    *
    * @return String representation of a personnel.
    */
   @Override
   public String toString() {
   return "name " + this.getNom();
   }
}
