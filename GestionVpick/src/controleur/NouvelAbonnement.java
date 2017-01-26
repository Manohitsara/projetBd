package controleur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class NouvelAbonnement {

	private Statement statement;
	private PreparedStatement ps;
	private Connection conn;

	public NouvelAbonnement(Connexion connexion) {
		this.statement = connexion.getStatement();
		try {
			this.conn = connexion.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void creerAbonne(int idClient, String nom, String prenom, String sexe, String login, String mdp, int cb, String dateNaiss) {
		String insert ="INSERT INTO Client VALUES (?,?,?,?,?,?,SYSDATE,?,null,0,1,?) ";
		
		try {
			ps= conn.prepareStatement(insert);
			ps.setInt(1, idClient);
			ps.setString(2, nom);
			ps.setString(3, prenom);
			ps.setString(4, sexe);
			ps.setString(5, dateNaiss);
			ps.setString(6, mdp);
			ps.setString(7, login);
			ps.setInt(8,cb);
			
			ps.executeQuery();
			
			if (ps != null)
				ps.close();
			System.out.println("Nouvel abonné enregistré");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


}
