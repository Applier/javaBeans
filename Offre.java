/**
 * 
 */
package intergiciels.beans;

import java.util.Date;

/**
 * @author Jade
 *
 */
public class Offre {
	
	/* Attributs */
	private int idOffre;
	private String intitule;
	private String entreprise;
	private Date deadLine;
	private String description;
	
	/* Getters et Setters */
	
	// idOffre
	public int getIdOffre() {
		return idOffre;
	}
	public void setIdOffre(int idOffre) {
		this.idOffre = idOffre;
	}
	
	// intitule
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	// entreprise
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}
	
	// deadLine
	public Date getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
	
	// description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
