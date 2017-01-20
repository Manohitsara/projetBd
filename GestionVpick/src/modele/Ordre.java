package modele;

public class Ordre {
	public enum  EtatOrdre { FAIT, NONFAIT;}
	
	private Integer idOrdre;
	private String description;
	private EtatOrdre etatOrdre;
	private Routine routine;
	
	public Integer getIdOrdre() {
		return idOrdre;
	}
	public void setIdOrdre(Integer idOrdre) {
		this.idOrdre = idOrdre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public EtatOrdre getEtatOrdre() {
		return etatOrdre;
	}
	public void setEtatOrdre(EtatOrdre etatOrdre) {
		this.etatOrdre = etatOrdre;
	}
	public Routine getRoutine() {
		return routine;
	}
	public void setRoutine(Routine routine) {
		this.routine = routine;
	}
	
	

}
