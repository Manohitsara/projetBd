package vue;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LocationPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int station_selectionne;

	/**
	 * Create the panel.
	 */
	public LocationPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		setBounds(100, 100, 692, 425);
		JButton btnStation1 = new JButton("Station 214 rue charle 36400");
		btnStation1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnStation1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnStation1.setIcon(new ImageIcon(LocationPanel.class.getResource("/vue/station.png")));
		btnStation1.setBounds(84, 56, 371, 93);
		add(btnStation1);
		
		JButton btnStation2 = new JButton("Station 47500 rue Albert   ");
		btnStation2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnStation2.setIcon(new ImageIcon(LocationPanel.class.getResource("/vue/station.png")));
		btnStation2.setBounds(84, 160, 371, 93);
		add(btnStation2);
		
		JButton btnStation3 = new JButton("Station 45780 rue des mores");
		btnStation3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnStation3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnStation3.setIcon(new ImageIcon(LocationPanel.class.getResource("/vue/station.png")));
		btnStation3.setBounds(84, 264, 371, 93);
		add(btnStation3);
		
		JLabel lblChoisirUnStation = new JLabel("Choisir une station");
		lblChoisirUnStation.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblChoisirUnStation.setBounds(217, 21, 238, 14);
		add(lblChoisirUnStation);
		
		JLabel lblStation1 = new JLabel("VPlus");
		lblStation1.setForeground(new Color(34, 139, 34));
		lblStation1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStation1.setBounds(503, 78, 67, 28);
		add(lblStation1);
		
		JLabel lblStation2 = new JLabel("VMoins");
		lblStation2.setForeground(new Color(34, 139, 34));
		lblStation2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStation2.setBounds(503, 187, 67, 28);
		add(lblStation2);
		
		JLabel lblStation3 = new JLabel("VPlus");
		lblStation3.setForeground(new Color(34, 139, 34));
		lblStation3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStation3.setBounds(503, 296, 67, 28);
		add(lblStation3);
		

	}
}
