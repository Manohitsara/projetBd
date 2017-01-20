package modele;

import java.util.ArrayList;
import java.util.List;

public class Routine {
	private Integer idRoutine;
	private String nomRoutine;
	private Employe employeAffecte;
	private List<Ordre> listOrdre = new ArrayList<Ordre>();
	
	public Integer getIdRoutine() {
		return idRoutine;
	}
	public void setIdRoutine(Integer idRoutine) {
		this.idRoutine = idRoutine;
	}
	public String getNomRoutine() {
		return nomRoutine;
	}
	public void setNomRoutine(String nomRoutine) {
		this.nomRoutine = nomRoutine;
	}
	public Employe getEmployeAffecte() {
		return employeAffecte;
	}
	public void setEmployeAffecte(Employe employeAffecte) {
		this.employeAffecte = employeAffecte;
	}	
	public List<Ordre> getListOrdre() {
		return listOrdre;
	}	
	public void setListOrdre(List<Ordre> listOrdre) {
		this.listOrdre = listOrdre;
	}

}
