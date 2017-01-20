package modele;

import java.util.Calendar;

public class Abonne extends Client{
	private String nomClient;
	private String prenomClient;
	private String sexe;
	private Calendar dateNaissance;
	private String motDePasse;
	private Calendar dateAbonnement;
	private String loginAbonne;
	
	@Override
	public Integer getIdClient() {
		return super.getIdClient();
	}
	
	@Override
	public void setIdClient(Integer idClient) {
		super.setIdClient(idClient);
	}

	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Calendar getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Calendar dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public Calendar getDateAbonnement() {
		return dateAbonnement;
	}
	public void setDateAbonnement(Calendar dateAbonnement) {
		this.dateAbonnement = dateAbonnement;
	}
	public String getLoginAbonne() {
		return loginAbonne;
	}
	public void setLoginAbonne(String loginAbonne) {
		this.loginAbonne = loginAbonne;
	}
	
	
	
}
