package modele;

public class Tarif {
	private Integer idTarif;
	private Integer tarif;
	private Integer annee;
	ModeleVelo modeleVelo =  new ModeleVelo();
	public Integer getIdTarif() {
		return idTarif;
	}
	public void setIdTarif(Integer idTarif) {
		this.idTarif = idTarif;
	}
	public Integer getTarif() {
		return tarif;
	}
	public void setTarif(Integer tarif) {
		this.tarif = tarif;
	}
	public Integer getAnnee() {
		return annee;
	}
	public void setAnnee(Integer annee) {
		this.annee = annee;
	}
	public ModeleVelo getModeleVelo() {
		return modeleVelo;
	}
	public void setModeleVelo(ModeleVelo modeleVelo) {
		this.modeleVelo = modeleVelo;
	}
	
	
	

}
