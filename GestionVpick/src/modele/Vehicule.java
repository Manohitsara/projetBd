package modele;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Vehicule {
	private Integer idVehicule;
	private String modeleVehicule;
	private Calendar dateMiseEnService;
	private Integer nbVeloMax;
	private Employe conducteur;
	public Integer getIdVehicule() {
		return idVehicule;
	}
	public void setIdVehicule(Integer idVehicule) {
		this.idVehicule = idVehicule;
	}
	public String getModeleVehicule() {
		return modeleVehicule;
	}
	public void setModeleVehicule(String modeleVehicule) {
		this.modeleVehicule = modeleVehicule;
	}
	public Calendar getDateMiseEnService() {
		return dateMiseEnService;
	}
	public void setDateMiseEnService(Calendar dateMiseEnService) {
		this.dateMiseEnService = dateMiseEnService;
	}
	public Integer getNbVeloMax() {
		return nbVeloMax;
	}
	public void setNbVeloMax(Integer nbVeloMax) {
		this.nbVeloMax = nbVeloMax;
	}
	public Employe getConducteur() {
		return conducteur;
	}
	public void setConducteur(Employe conducteur) {
		this.conducteur = conducteur;
	}
	
	
	

}
