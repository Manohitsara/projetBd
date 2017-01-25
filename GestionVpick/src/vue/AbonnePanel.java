package vue;

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
	 */
	public AbonnePanel(Connexion connexion) {
		GererClient gererClient = new GererClient(connexion);
		gererClient.gererStation();
		setLayout(null);
		this.setBounds(100, 100, 692, 425);
		
		JTabbedPane onglets = new JTabbedPane(JTabbedPane.TOP);
		onglets.setBounds(0, 11, 692, 425);
		add(onglets);
		LocationPanel locationPanel = new LocationPanel();
		ReservationPanel reservationPanel = new ReservationPanel();
		
		onglets.addTab("Location", locationPanel);
		onglets.addTab("Réservation", reservationPanel);
	}
}
