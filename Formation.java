/**
 * 
 */
package intergiciels.beans;

/**
 * @author Jade BOUMAZA
 *
 */
public class Formation {
	
	/* Attributs */
	private String dateDebut; // peut être null si on considère une date de diplôme
	private String dateFin;
	private String etablissement;
	private String intitule; // intitulé de la formation ou diplôme
	
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
