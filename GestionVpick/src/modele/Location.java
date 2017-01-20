package modele;

import java.util.Calendar;

public class Location {
	private Integer idLoc;
	private Calendar dateDebutLoc;
	private Calendar dateFinLoc;
	private Integer codeSecret;
	private Client client;
	
	public Integer getIdLoc() {
		return idLoc;
	}
	public void setIdLoc(Integer idLoc) {
		this.idLoc = idLoc;
	}
	public Calendar getDateDebutLoc() {
		return dateDebutLoc;
	}
	public void setDateDebutLoc(Calendar dateDebutLoc) {
		this.dateDebutLoc = dateDebutLoc;
	}
	public Calendar getDateFinLoc() {
		return dateFinLoc;
	}
	public void setDateFinLoc(Calendar dateFinLoc) {
		this.dateFinLoc = dateFinLoc;
	}
	public Integer getCodeSecret() {
		return codeSecret;
	}
	public void setCodeSecret(Integer codeSecret) {
		this.codeSecret = codeSecret;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
}
