package vue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controleur.Connexion;
import controleur.NouvelAbonnement;

public class NouvelAbonnementPanel extends JPanel {
	private JTextField txtNom;
	private JTextField txtPrenom;
	private JTextField txtSexe;
	private JTextField txtDateNaiss;
	private JTextField txtLogin;
	private JTextField txtMdp;
	private JTextField txtCb;
	private JTextField txtIdC;

	/**
	 * Create the panel.
	 */
	public NouvelAbonnementPanel(Connexion conn) {
		setLayout(null);
		
		JLabel lblNouvelAbonnement = new JLabel("Nouvel Abonnement");
		lblNouvelAbonnement.setBounds(211, 13, 135, 16);
		add(lblNouvelAbonnement);
		
		txtNom = new JTextField();
		txtNom.setText("Jean");
		txtNom.setBounds(156, 60, 116, 22);
		add(txtNom);
		txtNom.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(12, 63, 56, 16);
		add(lblNom);
		
		txtPrenom = new JTextField();
		txtPrenom.setText("Dupont");
		txtPrenom.setBounds(156, 105, 116, 22);
		add(txtPrenom);
		txtPrenom.setColumns(10);
		
		txtSexe = new JTextField();
		txtSexe.setText("M");
		txtSexe.setBounds(156, 151, 116, 22);
		add(txtSexe);
		txtSexe.setColumns(10);
		
		txtDateNaiss = new JTextField();
		txtDateNaiss.setText("12/10/1990");
		txtDateNaiss.setBounds(156, 208, 116, 22);
		add(txtDateNaiss);
		txtDateNaiss.setColumns(10);
		
		txtLogin = new JTextField();
		txtLogin.setText("Jeanbono");
		txtLogin.setBounds(403, 105, 116, 22);
		add(txtLogin);
		txtLogin.setColumns(10);
		
		txtMdp = new JTextField();
		txtMdp.setText("azerty");
		txtMdp.setBounds(403, 151, 116, 22);
		add(txtMdp);
		txtMdp.setColumns(10);
		
		txtCb = new JTextField();
		txtCb.setText("125833");
		txtCb.setBounds(403, 205, 116, 22);
		add(txtCb);
		txtCb.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Pr\u00E9nom");
		lblPrnom.setBounds(12, 108, 56, 16);
		add(lblPrnom);
		
		JLabel lblSexe = new JLabel("Sexe");
		lblSexe.setBounds(12, 154, 56, 16);
		add(lblSexe);
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance");
		lblDateDeNaissance.setBounds(12, 211, 110, 16);
		add(lblDateDeNaissance);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(302, 108, 56, 16);
		add(lblLogin);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setBounds(302, 154, 76, 16);
		add(lblMotDePasse);
		
		JLabel lblCodeCb = new JLabel("Code CB");
		lblCodeCb.setBounds(302, 210, 56, 19);
		add(lblCodeCb);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NouvelAbonnement na = new NouvelAbonnement(conn); 
				int idClient = Integer.parseInt(txtIdC.getText());
				String nom = txtNom.getText();
				String prenom = txtPrenom.getText();
				String dateNais = txtDateNaiss.getText();
				String sexe = txtSexe.getText();
				String login = txtLogin.getText();
				String mdp = txtMdp.getText();
				int cb = Integer.parseInt(txtCb.getText());
				na.creerAbonne(idClient,nom,prenom,sexe,login,mdp,cb,dateNais);
				
			}
		});
		btnValider.setBounds(194, 274, 97, 25);
		add(btnValider);
		
		txtIdC = new JTextField();
		txtIdC.setText("25");
		txtIdC.setBounds(403, 60, 116, 22);
		add(txtIdC);
		txtIdC.setColumns(10);
		
		JLabel lblId = new JLabel("idClient");
		lblId.setBounds(302, 63, 56, 16);
		add(lblId);
		
		JButton btnNewButton = new JButton("Retour");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(341, 274, 97, 25);
		add(btnNewButton);

	}
}
