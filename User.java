/**
 * 
 */
package intergiciels.beans;

import java.util.Collection;
import java.util.Date;

/**
 * @author Jade
 *
 */
public class User {
	
	/* Attributs */
	
	// relatifs au compte
	private int idUser;
	private String login;
	private String mail;
	private String password;
	// infos personnelles relatives au CV
	private int numTel;
	private Date dateNaissance;
	private String adresse;
	private Collection<DomaineCompetences> competences;
	private Collection<Emploi> emplois;
	private Collection<Formation> formations;
	private Collection<Langue> langues;
	private Collection<Loisir> loisirs;
	// offres
	private Collection<Offre> offres;
	
	/* Getters et Setters */
	
	// idUser
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	
	// login
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	// mail
	public String getMail() {
		return this.mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	// password
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// numTel
	public int getNumTel() {
		return this.numTel;
	}
	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}
	
	// dateNaissance
	public Date getDateNaissance() {
		return this.dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
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
	
	// offres
	public Collection<Offre> getOffres() {
		return this.offres;
	}
	public void setOffres(Collection<Offre> offres) {
		this.offres = offres;
	}
	
	
	/* Operations complementaires sur les collections */
	
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
	
	public void addOffre(Offre offre) {
		this.offres.add(offre);
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
	
	public void removeOffre(Offre offre) {
		this.offres.remove(offre);
	}
	public void removeAll() {
		this.offres.clear();
	}
	

}
