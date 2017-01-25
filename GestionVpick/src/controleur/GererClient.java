package controleur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import modele.Bornette;
import modele.Client;
import modele.Location;
import modele.Station;
import modele.Velo;

public class GererClient {
	private Statement statement;
	private HashMap<Integer, Station> listeStations;

	public GererClient(Connexion connexion) {
		this.statement = connexion.getStatement();
	}

	public List<Location> getLocationList() {
		String requete = "Select * from Location";
	
		List<Location> listlocation = new ArrayList<Location>();
		try {
			ResultSet resulat = statement.executeQuery(requete);
			while(resulat.next()){
				Location location = new Location();
				location.setIdLoc(resulat.getInt("ID_LOC"));
				location.setCodeSecret(resulat.getInt("CODE_SECRET"));
				Calendar datedeb = Calendar.getInstance();
				datedeb.setTime(resulat.getDate("DATE_DEB"));
				location.setDateDebutLoc(datedeb);
				Calendar dateFin = Calendar.getInstance();
				dateFin.setTime(resulat.getDate("DATE_FIN"));
				location.setDateDebutLoc(dateFin);
				Integer idClient = resulat.getInt("ID_CLIENT");
				ResultSet res = statement.executeQuery("Select * from client where ID_CLIENT="+idClient);
				if(res != null) {
					Client client = new Client();
						client.setIdClient(idClient);
					
				}

			}

			resulat.close();
		} catch (SQLException e) {
			System.out.println("erreur de requete :"+e);
		}
		return null;

	}

	public void gererStation() {
		String requete = "Select * from Station";
		
		listeStations = new HashMap<Integer,Station>();
		
		try {
			ResultSet resulat = statement.executeQuery(requete);
			while(resulat.next()){
				Station station = new Station();
				station.setIdStation(resulat.getInt("ID_STATION"));
				station.setAdresse(resulat.getString("ADRESSE"));
				station.sethDebutVM(resulat.getInt("HDEBVM"));
				station.sethFinVM(resulat.getInt("HFINVM"));
				station.sethDebVP(resulat.getInt("HDEBVP"));
				station.sethFinVP(resulat.getInt("HFINVP"));
				station.setSeuilVMoins(resulat.getInt("SEUILVMOINS"));
				station.setSeuilVPlus(resulat.getInt("SEUILVPLUS"));
				station.setListBornette(listerBornetteStation(station.getIdStation()));
				listeStations.put(station.getIdStation(), station);
			}

			resulat.close();
		} catch (SQLException e) {
			System.out.println("erreur de requete :"+e);
		}
		
	}
	
	public List<Bornette> listerBornetteStation(int idStation) {
		String requete = "Select * from bornette where id_station=\""+idStation+"";
		
		List<Bornette> listeBornette = new ArrayList<Bornette>();
		
		try {
			ResultSet resulat = statement.executeQuery(requete);
			while(resulat.next()){
				Bornette bornette = new Bornette();
				bornette.setNumBornette(resulat.getInt("ID_STATION"));
				Velo velo = new Velo();
				velo.setIdVelo(resulat.getInt("HDEBVM"));
				bornette.setVelo(velo);
				listeBornette.add(bornette);
			}

			resulat.close();
		} catch (SQLException e) {
			System.out.println("erreur de requete :"+e);
		}
		
		return listeBornette;
	}
	
	public String controlerVplusVmoins(int idStation) {
		Calendar calendar = Calendar.getInstance();
		int heure = calendar.get(java.util.Calendar.HOUR_OF_DAY);
		if(listeStations.get(Integer.valueOf(idStation)) != null 
				&&  listeStations.get(Integer.valueOf(idStation)).gethDebutVM()>=heure && listeStations.get(Integer.valueOf(idStation)).gethFinVM()<=heure) {
			
			Station station = listeStations.get(Integer.valueOf(idStation));
		}
		return null;
	}
	
	public boolean testPourcentage(){
		
		return false;
	}
	
	

}
