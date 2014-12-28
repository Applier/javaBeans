/**
 * 
 */
package intergiciels.beans;

import java.util.Collection;

/**
 * @author Jade
 *
 */
public class DomaineCompetences {
	
	/* Attributs */
	private String intitule; // l'intitulé du domaine (ex: informatique)
	private Collection<String> competences; // les compétences individuelles (ex : Java, C, LaTeX...)
	
	/* Getters et Setters */
	
	public String getIntitule() {
		return intitule;
	}
	
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	public Collection<String> getCompetences() {
		return competences;
	}
	
	public void setCompetences(Collection<String> competences) {
		this.competences = competences;
	}
	
	/* Operations complementaires sur la collection */
	
	// ajouter
	
	public void addCompetence(String competence) {
		this.competences.add(competence);
	}
	
	// supprimer
	
	public void removeCompetence(String competence) {
		this.competences.remove(competence);
	}

	public void removeAll() {
		this.competences.clear();
	}
	
}
