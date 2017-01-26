package vue;

import java.sql.SQLException;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import controleur.Connexion;
import controleur.GererClient;

public class AbonnePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 * @throws SQLException 
	 */
	public AbonnePanel(Connexion connexion, int idConnecte) throws SQLException {
		GererClient gererClient = new GererClient(connexion);
		gererClient.gererStation();
		setLayout(null);
		this.setBounds(100, 100, 692, 425);
		
		JTabbedPane onglets = new JTabbedPane(JTabbedPane.TOP);
		onglets.setBounds(0, 11, 692, 425);
		add(onglets);
		LocationPanel locationPanel = new LocationPanel();
		ReservationPanel reservationPanel = new ReservationPanel(connexion,idConnecte);
		
		onglets.addTab("Location", locationPanel);
		onglets.addTab("Réservation", reservationPanel);
	}
}
