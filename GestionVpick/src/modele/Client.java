package modele;

import java.util.Calendar;

public class Client {
	private Integer idClient;
	private Integer numCarteBancaire;
	private Integer primeTemps;
	
	private String nomClient;
	private String prenomClient;
	private String sexe;
	private Calendar dateNaissance;
	private String motDePasse;
	private Calendar dateAbonnement;
	private String loginAbonne;
	
	private Integer codeSecretPrime;
	private Integer abonne;
	
	public Integer getIdClient() {
		return idClient;
	}
	
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	
	public Integer getNumCarteBancaire() {
		return numCarteBancaire;
	}
	
	public void setNumCarteBancaire(Integer numCarteBancaire) {
		this.numCarteBancaire = numCarteBancaire;
	}
	
	public Integer getPrimeTemps() {
		return primeTemps;
	}
	
	public void setPrimeTemps(Integer primeTemps) {
		this.primeTemps = primeTemps;
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

	public Integer getCodeSecretPrime() {
		return codeSecretPrime;
	}

	public void setCodeSecretPrime(Integer codeSecretPrime) {
		this.codeSecretPrime = codeSecretPrime;
	}

	public Integer getAbonne() {
		return abonne;
	}

	public void setAbonne(Integer abonne) {
		this.abonne = abonne;
	}
	
	


}
