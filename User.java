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
	private int idUser;
	private String login;
	private String mail;
	private String password;
	private int numTel;
	private Date dateNaissance;
	private String adresse;
	private Collection<DomaineCompetences> competences;
	private Collection<Emploi> emplois;
	private Collection<Formation> formations;
	private Collection<Langue> langues;
	private Collection<Loisir> loisirs;
	
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
	
}
