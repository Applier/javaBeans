/**
 * 
 */
package intergiciels.beans;

import java.util.Collection;

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
	private InfosCV infos;
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
	
	// infos personnelles relatives au CV
	public InfosCV getInfos() {
		return infos;
	}
	public void setInfos(InfosCV infos) {
		this.infos = infos;
	}
	
	// offres
	public Collection<Offre> getOffres() {
		return this.offres;
	}
	public void setOffres(Collection<Offre> offres) {
		this.offres = offres;
	}
	
	
	/* Méthodes complémentaires sur la collection d'offres */
	public void addOffre(Offre offre) {
		this.offres.add(offre);
	}	
	public void removeOffre(Offre offre) {
		this.offres.remove(offre);
	}
	public void removeAll() {
		this.offres.clear();
	}
	

}
