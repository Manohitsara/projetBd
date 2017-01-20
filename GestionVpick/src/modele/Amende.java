package modele;

import java.util.Calendar;

public class Amende {

	private Integer idAmende;
	private Integer  montant;
	private Calendar dateAmende;
	private String etat;
	private Client client;
	
	public Integer getIdAmende() {
		return idAmende;
	}
	public void setIdAmende(Integer idAmende) {
		this.idAmende = idAmende;
	}
	public Integer getMontant() {
		return montant;
	}
	public void setMontant(Integer montant) {
		this.montant = montant;
	}
	public Calendar getDateAmende() {
		return dateAmende;
	}
	public void setDateAmende(Calendar dateAmende) {
		this.dateAmende = dateAmende;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
