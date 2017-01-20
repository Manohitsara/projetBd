package modele;

public class Employe {
	public enum TypeEmploye {
		Conducteur, superviseur;
	}
	
	
	private Integer idEmploye;
	private String nomEmploye;
	private String prenomEmploye;
	private String loginEmploye;
	private String mdpEmploye;
	private TypeEmploye typeEmploye;
	public Integer getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(Integer idEmploye) {
		this.idEmploye = idEmploye;
	}
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public String getPrenomEmploye() {
		return prenomEmploye;
	}
	public void setPrenomEmploye(String prenomEmploye) {
		this.prenomEmploye = prenomEmploye;
	}
	public String getLoginEmploye() {
		return loginEmploye;
	}
	public void setLoginEmploye(String loginEmploye) {
		this.loginEmploye = loginEmploye;
	}
	public String getMdpEmploye() {
		return mdpEmploye;
	}
	public void setMdpEmploye(String mdpEmploye) {
		this.mdpEmploye = mdpEmploye;
	}
	public TypeEmploye getTypeEmploye() {
		return typeEmploye;
	}
	public void setTypeEmploye(TypeEmploye typeEmploye) {
		this.typeEmploye = typeEmploye;
	}

	
	
}
