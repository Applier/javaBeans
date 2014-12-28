/**
 * 
 */
package intergiciels.beans;

import java.util.Date;

/**
 * @author Jade
 *
 */
public class Formation {
	
	/* Attributs */
	private Date dateDebut; // peut être null si on considère une date de diplôme
	private Date dateFin;
	private String etablissement;
	private String intitule; // intitulé de la formation ou diplôme
	
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
	
	// etablissement
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	
	// intitule
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	// description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	private String description;

}
