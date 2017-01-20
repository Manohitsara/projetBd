package modele;

import java.util.Calendar;

public class Velo {
	public enum EtatVelo {HS,OK;}
	
	private Integer idVelo;
	private Calendar dateMiseEnservice;
	private EtatVelo etatVelo;
	private Location location;
	private ModeleVelo modeleVelo;
	private Vehicule vehicule;
	private CentreDeRepartition centreDeRepartition;
	
	public Integer getIdVelo() {
		return idVelo;
	}
	public void setIdVelo(Integer idVelo) {
		this.idVelo = idVelo;
	}
	public Calendar getDateMiseEnservice() {
		return dateMiseEnservice;
	}
	public void setDateMiseEnservice(Calendar dateMiseEnservice) {
		this.dateMiseEnservice = dateMiseEnservice;
	}
	public EtatVelo getEtatVelo() {
		return etatVelo;
	}
	public void setEtatVelo(EtatVelo etatVelo) {
		this.etatVelo = etatVelo;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public ModeleVelo getModeleVelo() {
		return modeleVelo;
	}
	public void setModeleVelo(ModeleVelo modeleVelo) {
		this.modeleVelo = modeleVelo;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public CentreDeRepartition getCentreDeRepartition() {
		return centreDeRepartition;
	}
	public void setCentreDeRepartition(CentreDeRepartition centreDeRepartition) {
		this.centreDeRepartition = centreDeRepartition;
	}
	
	

}
