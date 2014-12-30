/**
 * 
 */
package intergiciels.beans;

/**
 * @author Jade BOUMAZA
 *
 */
public class Emploi {
	
	/* Attributs */
	private String dateDebut;
	private String dateFin;
	private String employeur;
	private String poste;
	private String description;
	
	/* Getters et Setters */
	
	// dateDebut
	public String getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}
	
	// dateFin
	public String getDateFin() {
		return dateFin;
	}
	public void setDateFin(String dateFin) {
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
