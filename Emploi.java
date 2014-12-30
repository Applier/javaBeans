/**
 * 
 */
package intergiciels.beans;

import java.util.Date;

/**
 * @author Jade BOUMAZA
 *
 */
public class Emploi {
	
	/* Attributs */
	private Date dateDebut;
	private Date dateFin;
	private String employeur;
	private String poste;
	private String description;
	
	/* Getters et Setters */
	
	// dateDebut
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	// dateFin
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	// employeur
	public String getEmployeur() {
		return employeur;
	}
	public void setEmployeur(String employeur) {
		this.employeur = employeur;
	}
	
	// poste
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	
	// description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
