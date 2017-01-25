package controleur;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import modele.Client;
import modele.Employe;
import modele.Location;
import modele.Routine;
import modele.Vehicule;

public class gererSuperviseur {
	private Statement statement;
	private Calendar dateMS;
	private Employe employe;
	
    public gererSuperviseur(Connexion connexion) {
       this.statement = connexion.getStatement();
 }
    public void consulterRoutine(){
		String requete = "Select ID_VEHICULE, ID_ROUTINE, NOM_R from Vehicule natural join Routine" ;
    }
	public List<Vehicule> getVehiculeList() {
		String requete = "Select * from Vehicule";
	    List<Vehicule> listvehicule = new ArrayList<Vehicule>();
		try {
//		int i = statement.executeUpdate("insert into client values('1','12345','15')");
//		System.out.println("aarrarara : "+i);
			ResultSet resulat = statement.executeQuery(requete);
			while(resulat.next()){
				Vehicule vehicule = new Vehicule();
				vehicule.setIdVehicule(resulat.getInt("ID_VEHICULE"));
				vehicule.setModeleVehicule(resulat.getString("MODELE"));
				
				vehicule.setNbVeloMax(resulat.getInt("NBVELOMAX"));
				dateMS = Calendar.getInstance();
				dateMS.setTime(resulat.getDate("DATEMS"));
				vehicule.setDateMiseEnService(dateMS);
				Integer idEmploye = resulat.getInt("ID_EMP");
				ResultSet res = statement.executeQuery("Select * from EMPLOYE where ID_EMP="+idEmploye);
				if(res != null) {
					Employe employe = new Employe();
						employe.setIdEmploye(idEmploye);
				}
				Integer idRoutine = resulat.getInt("ID_ROUTINE");
				ResultSet res1 = statement.executeQuery("Select * from ROUTINE where ID_ROUTINE="+idRoutine);
				if(res1 != null) {
				   Routine routine = new Routine();
				   employe.setIdRoutine(idRoutine);
				}
				
			}

			resulat.close();
		} catch (SQLException e) {
			System.out.println("erreur de requete :"+e);
		}
		return null;

	}
	

}

