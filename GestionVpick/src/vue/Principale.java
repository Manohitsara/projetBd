package vue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;

import controleur.Connexion;
import controleur.GererAuthentification;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;

public class Principale extends JFrame{
	private JTextField txtLogin;
	private JPasswordField txtMdp;
	private JButton btnConnexion;
	private JLabel lblSabonner;
	private JLabel lblError;
	private JButton btnAbonnement;
	private JButton btnLocation;
	private JRadioButton rdbtnSuperviseur;
	private JRadioButton rdbtnConducteur;
	private JRadioButton rdbtnAbonne;
	private String type;
	private GererAuthentification gestionAuthentification ;
	private JPanel panelPrincipal;
	private Connexion connexion;
	

	/**
	 * Create the application.
	 */
	public Principale(Connexion connex) {
		initialize();
		type = "A";
		this.connexion = connex;
		gestionAuthentification = new GererAuthentification(connexion);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.setTitle("Gestion Vpick");

		this.setBounds(100, 100, 692, 425);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.WHITE);
		
		
		getContentPane().add(panelPrincipal, BorderLayout.SOUTH);
		
		JLabel label = new JLabel("Bienvenue sur l'application VPICK: Location de vélo.");
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		
		JSeparator separator = new JSeparator();
		
		JLabel lblSeConnecter = new JLabel("Se connecter");
		
		JLabel lblLogin = new JLabel("Login :");
		
		txtLogin = new JTextField();
		txtLogin.setColumns(10);
		
		JLabel lblMdp = new JLabel("Mot de passe :");
		
		txtMdp = new JPasswordField();
		
		btnConnexion = new JButton(" Connexion");
		
		
		JSeparator separator_1 = new JSeparator();
		
		lblSabonner = new JLabel("Nouvel utilisateur");
		
		JLabel lblNewLabel_2 = new JLabel("s'abonner");
		
		btnAbonnement = new JButton("Abonnement");
		
		JLabel lblLocationPourNon = new JLabel("Location pour non abonn\u00E9");
		
		btnLocation = new JButton("Location");
		
		lblError = new JLabel("");
		
		lblError.setForeground(Color.RED);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		rdbtnSuperviseur = new JRadioButton("Superviseur");
		
		rdbtnConducteur = new JRadioButton("Conducteur");
		
		
		rdbtnAbonne = new JRadioButton("Abonn\u00E9");
		rdbtnAbonne.setSelected(true);
	
		buttonGroup.add(rdbtnSuperviseur);
		buttonGroup.add(rdbtnConducteur);
		buttonGroup.add(rdbtnAbonne);
		
		GroupLayout gl_panel = new GroupLayout(panelPrincipal);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(123)
					.addComponent(lblError, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(169, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(115, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblLogin, GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblMdp)
							.addGap(46)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtLogin, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtMdp, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnConnexion)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(rdbtnAbonne)
									.addGap(2)
									.addComponent(rdbtnConducteur)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnSuperviseur, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)))
					.addGap(197))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(169)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(161, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(105)
					.addComponent(lblSeConnecter, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(472, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSabonner, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addGap(38)
							.addComponent(btnAbonnement)
							.addGap(81)
							.addComponent(lblLocationPourNon)
							.addGap(45)
							.addComponent(btnLocation)))
					.addContainerGap(116, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(separator, GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addComponent(lblError)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblSeConnecter, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin)
						.addComponent(txtLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMdp)
						.addComponent(txtMdp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnAbonne)
						.addComponent(rdbtnConducteur)
						.addComponent(rdbtnSuperviseur))
					.addGap(18)
					.addComponent(btnConnexion)
					.addGap(18)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblSabonner)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLocationPourNon, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLocation)
						.addComponent(btnAbonnement)
						.addComponent(lblNewLabel_2))
					.addContainerGap(97, Short.MAX_VALUE))
		);
		panelPrincipal.setLayout(gl_panel);
		
		appelListeners();
//		
//		Border border = BorderFactory.createTitledBorder("Se connecter");
//		panel.setBorder(border);
		setVisible(true);
		setResizable(false);
	}
	
	private void appelListeners() {
		btnConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblError.setText("");
				if(txtLogin.getText().isEmpty() || txtMdp.getText().isEmpty()) {
					lblError.setText("Login et mot de passe obligatoire!");
				} else {
					if(gestionAuthentification.gererConnexion(txtMdp.getText(), txtLogin.getText(), type)) {
						if(type.equals("S")) {
							
						} else if(type.equals("C")) {
							
						} else if(type.equals("A")){
							AbonnePanel abonnePanel = new AbonnePanel(connexion);
							setContentPane(abonnePanel);
							repaint();
							revalidate();
						}
					} else {
						lblError.setText("Erreur d'authentification!");
					}
				}
			}
		});
		
		txtLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblError.setText("");
			}
		});
		
		txtMdp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblError.setText("");
			}
		});
		
		rdbtnSuperviseur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnSuperviseur.isSelected()) {
					type="S";
				}
			}
		});
		
		rdbtnConducteur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnConducteur.isSelected()) {
					type="C";
				}
			}
		});
		
		rdbtnSuperviseur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnAbonne.isSelected()) {
					type="A";
				}
			}
		});
		
		
		
	}
}
