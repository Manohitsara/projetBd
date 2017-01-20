package modele;

import java.util.ArrayList;
import java.util.List;

public class ModeleVelo {
	private Integer idModele;
	private String nomModele;
	private Float prixLoc;
	private List<Tarif> listTarif = new ArrayList<Tarif>();
	
	public Integer getIdModele() {
		return idModele;
	}
	public void setIdModele(Integer idModele) {
		this.idModele = idModele;
	}
	public String getNomModele() {
		return nomModele;
	}
	public void setNomModele(String nomModele) {
		this.nomModele = nomModele;
	}
	public Float getPrixLoc() {
		return prixLoc;
	}
	public void setPrixLoc(Float prixLoc) {
		this.prixLoc = prixLoc;
	}
	
	

}
