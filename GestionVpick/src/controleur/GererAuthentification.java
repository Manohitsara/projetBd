package controleur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GererAuthentification {
	

	private Statement statement;

	public GererAuthentification(Connexion connexion) {
		this.statement = connexion.getStatement();
	}
	// retourne l'id du client connecté
	public int gererConnexion(String mdp, String login, String type){
		int idConnecte = -1;
		if(type.equals("A")) {
			String requete = "Select * from Client where lower(login_abonne) = lower(\'"+login+"\') and mdp =\'"+mdp+"\'";
			
			try {
				ResultSet resultat = statement.executeQuery(requete);
				if(resultat.next()){
					idConnecte = resultat.getInt("id_client");
				}
			} catch (SQLException e) {
				System.out.println("erreur de requete d'authentification client. "+e);
			}
		}
		return idConnecte;
	}
	
	
	
}
