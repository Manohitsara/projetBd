package vue;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class AbonnePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public AbonnePanel() {
		setLayout(null);
		
		JTabbedPane onglets = new JTabbedPane(JTabbedPane.TOP);
		onglets.setBounds(0, 0, 450, 300);
		add(onglets);
		LocationPanel locationPanel = new LocationPanel();
		ReservationPanel reservationPanel = new ReservationPanel();
		
		onglets.addTab("Location", locationPanel);
		onglets.addTab("Réservation", reservationPanel);
	}
}
