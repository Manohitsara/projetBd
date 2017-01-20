package controleur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import modele.Client;
import modele.Location;

public class gererLocation {
	private Statement statement;

	public gererLocation(Connexion connexion) {
		this.statement = connexion.getStatement();
	}

	public List<Location> getLocationList() {
		String requete = "Select * from Location";
	
		List<Location> listlocation = new ArrayList<Location>();
		try {
//		int i = statement.executeUpdate("insert into client values('1','12345','15')");
//		System.out.println("aarrarara : "+i);
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

}
