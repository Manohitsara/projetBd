package controleur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class GererReservation {

	private Statement statement;
	private PreparedStatement ps;
	private Connection conn;

	public GererReservation(Connexion connexion) {
		this.statement = connexion.getStatement();
		try {
			this.conn = connexion.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean insertResa( int idResa, String dateDeb, String hDeb, String dateFin, String hFin,
			String modele, String station, int idClient) {
		boolean res = true;
		String requete = "Select id_station from Station where lower(nom_station) = lower(\'" + station + "\') ";
		String requeteModele = "Select id_modele from Modele_velo where lower(nom_modele) = lower(\'" + modele + "\')";
		int idModele = -1;
		int idStation = -1;

		try {
			ResultSet resultat = statement.executeQuery(requete);
			if (resultat.next()) {
				idStation = resultat.getInt(1);
			}

			resultat = statement.executeQuery(requeteModele);
			if (resultat.next()) {
				idModele = resultat.getInt(1);
			}
			
			String dateF = dateFin + " " + hFin;
			String dateD = dateDeb + " " + hDeb;
			
			
			System.out.println(dateD);
			String insert = "INSERT INTO Reservation VALUES (?,to_date(?,'DD/MM/YYYY HH24'), to_date(?,'DD/MM/YYYY HH24'),?,?,?)";
			PreparedStatement ps = conn.prepareStatement(insert);
			ps.setInt(1, idResa);
			
			ps.setString(2, dateD);
			
			ps.setString(3, dateF);
			ps.setInt(4, idModele);
			ps.setInt(5, idStation);
			ps.setInt(6, idClient);
			ps.executeUpdate();

			if (ps != null)
				ps.close();
			if (resultat != null)
				resultat.close();

		} catch (SQLException e) {
			System.out.println(e);
			new JOptionPane("Station inexistante ", JOptionPane.ERROR_MESSAGE);
			res = false;
		}
		return res;
	}
	//  consultation des reservation pour uen date donnée
	public boolean consulterReservation(int idClient) {
		boolean res = false ;
		String req = " Select to_char(date_deb,'DD/MM/YYYY HH24'), to_char(date_fin,'DD/MM/YYYY HH24'), nom_modele, nom_station FROM Reservation NATURAL JOIN Modele_velo NATURAL JOIN  Station  where id_client = ? " ;
		try {
			PreparedStatement ps = conn.prepareStatement(req);
			ps.setInt(1, idClient);
			ResultSet resultat = ps.executeQuery();
			
			System.out.println("Vos réservations");
			while(resultat.next()) {
				System.out.println("-----------------------------------------------");
				String dateDeb = resultat.getString(1);
				String dateFin = resultat.getString(2);
				String nom_modele = resultat.getString(3);
				String nom_station = resultat.getString(4);
				System.out.println("Date et heure de debut de la reservation : " + dateDeb);
				System.out.println("Date et heure de fin de la reservation : " + dateFin);
				System.out.println("Modèle de vélo reservé : " + nom_modele);
				System.out.println("Nom de la station concerné : " + nom_station);
				System.out.println("-----------------------------------------------");
				
			}
		res = true ;
		if (ps != null)
			ps.close();
		
		if (resultat != null)
			resultat.close();
		} catch (SQLException e) {
			res = false ;
			e.printStackTrace();
		}
		
		return res  ;
	}

}
