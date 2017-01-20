package modele;

import java.util.ArrayList;
import java.util.List;

public class Station {
	private Integer idStation;
	private String adresse;
	private String nomStation;
	private Integer seuilVMoins;
	private Integer seuilVPlus;
	private Integer hDebutVM;
	private Integer hFinVM;
	private Integer hDebVP;
	private Integer hFinVP;
	
	private List<Bornette> listOrdre = new ArrayList<Bornette>();
	
	public Integer getIdStation() {
		return idStation;
	}
	public void setIdStation(Integer idStation) {
		this.idStation = idStation;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNomStation() {
		return nomStation;
	}
	public void setNomStation(String nomStation) {
		this.nomStation = nomStation;
	}
	public Integer getSeuilVMoins() {
		return seuilVMoins;
	}
	public void setSeuilVMoins(Integer seuilVMoins) {
		this.seuilVMoins = seuilVMoins;
	}
	public Integer getSeuilVPlus() {
		return seuilVPlus;
	}
	public void setSeuilVPlus(Integer seuilVPlus) {
		this.seuilVPlus = seuilVPlus;
	}
	public Integer gethDebutVM() {
		return hDebutVM;
	}
	public void sethDebutVM(Integer hDebutVM) {
		this.hDebutVM = hDebutVM;
	}
	public Integer gethFinVM() {
		return hFinVM;
	}
	public void sethFinVM(Integer hFinVM) {
		this.hFinVM = hFinVM;
	}
	public Integer gethDebVP() {
		return hDebVP;
	}
	public void sethDebVP(Integer hDebVP) {
		this.hDebVP = hDebVP;
	}
	public Integer gethFinVP() {
		return hFinVP;
	}
	public void sethFinVP(Integer hFinVP) {
		this.hFinVP = hFinVP;
	}
	
	public List<Bornette> getListOrdre() {
		return listOrdre;
	}
	
	public void setListOrdre(List<Bornette> listOrdre) {
		this.listOrdre = listOrdre;
	}
	
	
}
