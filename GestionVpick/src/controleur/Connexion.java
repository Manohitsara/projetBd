package controleur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {
	/* classe permettant la connexion  */			
	private String url;
	private Statement statement;


	public Connexion() {
		try {
			Class.forName ("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			
			// @//machineName:port/SID,   userid,  password
			//url = "jdbc:oracle:thin:@im2ag-oracle.e.ujf-grenoble.fr:1521:m1miage";
			Connection connection = DriverManager.getConnection(url,"robinsoc","drUJE7xz");
			statement = connection.createStatement();
			
		} catch (SQLException e) {
			System.out.println("erreur lors de la tentative de connexion à la base de données :"+e);
			//e.printStackTrace();
		}
	}
	
	
	public Statement getStatement() {
		return statement;
	}

}
