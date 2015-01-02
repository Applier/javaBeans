/**
 * 
 */
package intergiciels.beans;

import java.util.Collection;

/**
 * @author Jade BOUMAZA & Anthony MARCO
 *
 */
public class Correspondance {
	
	/* Attributs */
	private Collection<Message> messagesRecus;
	private Collection<Message> messagesEnvoyes;
	
	/* Getters et Setters */
	
	// messagesRecus
	public Collection<Message> getMessagesRecus() {
		return messagesRecus;
	}
	public void setMessagesRecus(Collection<Message> messagesRecus) {
		this.messagesRecus = messagesRecus;
	}
	
	// messagesEnvoyes
	public Collection<Message> getMessagesEnvoyes() {
		return messagesEnvoyes;
	}
	public void setMessagesEnvoyes(Collection<Message> messagesEnvoyes) {
		this.messagesEnvoyes = messagesEnvoyes;
	}
	
	/* Méthodes complémentaires sur les collections */
	
	// ajouter
		
	public void addMessageRecu(Message message) {
		this.messagesRecus.add(message);
	}
	
	public void addMessageEnvoye(Message message) {
		this.messagesEnvoyes.add(message);		
	}
			
	// supprimer
	
	public void removeMessageEnvoye(Message message) {
		this.messagesEnvoyes.remove(message);
	}
	public void removeAllMessagesEnvoyes() {
		this.messagesEnvoyes.clear();
	}
	
	public void removeMessageRecu(Message message) {
		this.messagesRecus.remove(message);
	}
	public void removeAllMessagesRecus() {
		this.messagesRecus.clear();
	}
	

}
