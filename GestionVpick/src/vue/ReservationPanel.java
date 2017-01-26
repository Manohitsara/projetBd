package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.Connexion;
import controleur.GererReservation;

public class ReservationPanel extends JPanel {
	private JTextField txtIdResa;
	private JTextField txtDateDeb;
	private JTextField txtDateFin;
	private JTextField txtModele;
	private JTextField txtNomStation;
	private JTextField txtHDeb;
	private JTextField txtHFin;
	private GererReservation gr ;
	private JButton btnConsult;

	/**
	 * Create the panel.
	 * @throws SQLException 
	 */
	public ReservationPanel(Connexion conn , int idClient) throws SQLException {
		gr = new GererReservation(conn);
		setBounds(100, 100, 692, 425);
		setLayout(null);
		JLabel lblReservation = new JLabel("Reservation");
		lblReservation.setBounds(312, 5, 67, 16);
		add(lblReservation);
		
		txtIdResa = new JTextField();
		txtIdResa.setBounds(136, 86, 116, 22);
		add(txtIdResa);
		txtIdResa.setColumns(10);
		
		JLabel lblIdReservation = new JLabel("Id Reservation :");
		lblIdReservation.setLabelFor(txtIdResa);
		lblIdReservation.setBounds(27, 89, 97, 16);
		add(lblIdReservation);
		
		txtDateDeb = new JTextField();
		txtDateDeb.setBounds(136, 121, 116, 22);
		add(txtDateDeb);
		txtDateDeb.setColumns(10);
		
		txtDateFin = new JTextField();
		txtDateFin.setBounds(136, 165, 116, 22);
		add(txtDateFin);
		txtDateFin.setColumns(10);
		
		txtModele = new JTextField();
		txtModele.setBounds(136, 200, 116, 22);
		add(txtModele);
		txtModele.setColumns(10);
		
		txtNomStation = new JTextField();
		txtNomStation.setBounds(136, 235, 116, 22);
		add(txtNomStation);
		txtNomStation.setColumns(10);
		
		JLabel lbldate = new JLabel("Date de d\u00E9but :");
		lbldate.setLabelFor(this);
		lbldate.setBounds(27, 124, 116, 16);
		add(lbldate);
		
		JLabel lblNewLabel_1 = new JLabel("Date de fin :");
		lblNewLabel_1.setBounds(27, 168, 82, 16);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mod\u00E8le :");
		lblNewLabel_2.setBounds(27, 203, 111, 16);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Station de d\u00E9part :");
		lblNewLabel_3.setBounds(27, 238, 111, 16);
		add(lblNewLabel_3);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int idResa = Integer.parseInt(txtIdResa.getText());
				String dateDeb = txtDateDeb.getText();
				String hDeb = txtHDeb.getText();
				String dateFin = txtDateFin.getText();
				String hFin = txtHFin.getText();
				String modele = txtModele.getText() ;
				String station = txtNomStation.getText();
				if(gr.insertResa(idResa, dateDeb, hDeb, dateFin, hFin, modele, station, idClient)) {
					new JOptionPane("Réservation enregistrée !", JOptionPane.INFORMATION_MESSAGE);
				} else {
					new JOptionPane("Une erreur s'est produite veuillez recommencer", JOptionPane.ERROR_MESSAGE);
				}
		
			}
		});
		btnValider.setBounds(289, 280, 97, 25);
		add(btnValider);
		
		txtHDeb = new JTextField();
		txtHDeb.setBounds(447, 121, 116, 22);
		add(txtHDeb);
		txtHDeb.setColumns(10);
		
		txtHFin = new JTextField();
		txtHFin.setBounds(447, 165, 116, 22);
		add(txtHFin);
		txtHFin.setColumns(10);
		
		JLabel lblHeure = new JLabel("Heure de d\u00E9but :");
		lblHeure.setBounds(324, 124, 111, 16);
		add(lblHeure);
		
		JLabel lblHeureDeFin = new JLabel("Heure de fin :");
		lblHeureDeFin.setBounds(325, 168, 91, 16);
		add(lblHeureDeFin);
		
		btnConsult = new JButton("consulter mes reservations");
		btnConsult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gr.consulterReservation( idClient) ;
			}
		});
		btnConsult.setBounds(229, 318, 239, 25);
		add(btnConsult);

	}
}
