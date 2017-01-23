package controleur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GererAuthentification {
	

	private Statement statement;

	public GererAuthentification(Connexion connexion) {
		this.statement = connexion.getStatement();
	}
	
	public boolean gererConnexion(String mdp, String login, String type){
		if(type.equals("A")) {
			String requete = "Select * from Client where lower(login_abonne) = lower(\'"+login+"\') and mpd =\'"+mdp+"\'";
			
			try {
				ResultSet resultat = statement.executeQuery(requete);
				if(resultat.next()){
					return true;
				}
			} catch (SQLException e) {
				System.out.println("erreur de requete d'authentification client. "+e);
			}
		}
		return false;
	}
	
	
	
}
