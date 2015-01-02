package intergiciels.beans;

import java.util.Date;

public class Tache {
	
	/* Attributs */
	private String intitule;
	private boolean etat; // false si tâche non effectuée, true sinon
	private Date dateLimite;
	
	/* Getters et Setters */
	
	// intitule
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	// etat
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	
	// dateLimite
	public Date getDateLimite() {
		return dateLimite;
	}
	public void setDateLimite(Date dateLimite) {
		this.dateLimite = dateLimite;
	}

}
