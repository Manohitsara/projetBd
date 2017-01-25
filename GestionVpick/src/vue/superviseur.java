package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class superviseur extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					superviseur frame = new superviseur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public superviseur() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(btnNewButton);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 646);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnConsulterLaRoutine = new JButton("Partie: Routine");
		btnConsulterLaRoutine.setBackground(Color.LIGHT_GRAY);
		btnConsulterLaRoutine.setBounds(247, 105, 308, 93);
		btnConsulterLaRoutine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("Partie: Velos");
		btnNewButton_1.setBounds(247, 218, 308, 93);
		
		JButton btnNewButton_2 = new JButton("Partie: Plages horaires");
		btnNewButton_2.setBounds(247, 445, 308, 93);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(247, 324, 308, 93);
		contentPane.setLayout(null);
		contentPane.add(btnConsulterLaRoutine);
		contentPane.add(btnNewButton_1);
		contentPane.add(btnNewButton_2);
		contentPane.add(btnNewButton_3);
		
		JLabel lblSuperviseur = new JLabel("Partie superviseur:");
		lblSuperviseur.setForeground(Color.BLACK);
		lblSuperviseur.setFont(new Font("Arial", Font.BOLD, 17));
		lblSuperviseur.setBounds(315, 13, 315, 42);
		contentPane.add(lblSuperviseur);
	}
}
