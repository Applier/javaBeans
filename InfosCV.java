/**
 * 
 */
package intergiciels.beans;

import java.util.Collection;

/**
 * @author Jade BOUMAZA
 *
 */
public class InfosCV {
	
	/* Attributs */
	private String nom;
	private String prenom;
	private String numTel;
	private String dateNaissance;
	private String adresse;
	private Collection<DomaineCompetences> competences;
	private Collection<Emploi> emplois;
	private Collection<Formation> formations;
	private Collection<Langue> langues;
	private Collection<Loisir> loisirs;
	
	/* Setters et Getters */
	
	// nom
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	// prenom
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	// numTel
	public String getNumTel() {
		return this.numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
		
	// dateNaissance
	public String getDateNaissance() {
		return this.dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	// adresse
	public String getAdresse() {
		return this.adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	// domainesCompetences
	public Collection<DomaineCompetences> getCompetences() {
		return this.competences;
	}
	public void setCompetences(Collection<DomaineCompetences> competences) {
		this.competences = competences;
	}
	
	// emplois
	public Collection<Emploi> getEmplois() {
		return this.emplois;
	}
	public void setEmplois(Collection<Emploi> emplois) {
		this.emplois = emplois;
	}
		
	// formations
	public Collection<Formation> getFormations() {
		return this.formations;
	}
	public void setFormations(Collection<Formation> formations) {
		this.formations = formations;
	}
	
	// langues
	public Collection<Langue> getLangues() {
		return this.langues;
	}
	public void setLangues(Collection<Langue> langues) {
		this.langues = langues;
	}
		
	// loisirs
	public Collection<Loisir> getLoisirs() {
		return this.loisirs;
	}
	public void setLoisirs(Collection<Loisir> loisirs) {
		this.loisirs = loisirs;
	}
		
		
	/* Méthodes complémentaires sur les collections */
		
	// ajouter
		
	public void addDomaineCompetences(DomaineCompetences domaine) {
		this.competences.add(domaine);
	}
	
	public void addEmploi(Emploi emploi) {
		this.emplois.add(emploi);
	}
	
	public void addFormation(Formation formation) {
		this.formations.add(formation);
	}
	
	public void addLangue(Langue langue) {
		this.langues.add(langue);
	}
	
	public void addLoisir(Loisir loisir) {
		this.loisirs.add(loisir);
	}
			
	// supprimer
	
	public void removeCompetence(DomaineCompetences domaine) {
		this.competences.remove(domaine);
	}
	public void removeAllCompetences() {
		this.competences.clear();
	}
	
	public void removeEmploi(Emploi emploi) {
		this.emplois.remove(emploi);
	}
	public void removeAllEmplois() {
		this.emplois.clear();
	}
	
	public void removeFormation(Formation formation) {
		this.formations.remove(formation);
	}
	public void removeAllFormations() {
		this.formations.clear();
	}
	
	public void removeLangue(Langue langue) {
		this.langues.remove(langue);
	}
	public void removeAllLangues() {
		this.langues.clear();
	}
		
	public void removeLoisir(Loisir loisir) {
		this.loisirs.remove(loisir);
	}
	public void removeAllLoisirs() {
		this.loisirs.clear();
	}	

}
