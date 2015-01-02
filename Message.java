/**
 * 
 */
package intergiciels.beans;

import java.util.Date;

/**
 * @author Jade BOUMAZA & Anthony MARCO
 *
 */
public class Message {

	/* Attributs */
	private String expediteur;
	private Date date;
	private String sujet;
	private String contenu;
	
	/* Getters et Setters */
	
	// expediteur
	public String getExpediteur() {
		return expediteur;
	}
	public void setExpediteur(String expediteur) {
		this.expediteur = expediteur;
	}
	
	// date
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	// sujet
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	
	// contenu
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
}
