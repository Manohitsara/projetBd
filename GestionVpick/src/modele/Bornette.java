package modele;

public class Bornette {
	public enum EtatBornette { HS, LIBRE, OK;}
	
	
	private Integer numBornette;
	private EtatBornette etat;
	private Station station;
	private Velo velo;
	
	
	public Integer getNumBornette() {
		return numBornette;
	}
	public void setNumBornette(Integer numBornette) {
		this.numBornette = numBornette;
	}
	public EtatBornette getEtat() {
		return etat;
	}
	public void setEtat(EtatBornette etat) {
		this.etat = etat;
	}
	public Station getStation() {
		return station;
	}
	public void setStation(Station station) {
		this.station = station;
	}
	public Velo getVelo() {
		return velo;
	}
	public void setVelo(Velo velo) {
		this.velo = velo;
	}

	
	

}
