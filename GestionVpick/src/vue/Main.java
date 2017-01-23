package vue;

import java.awt.EventQueue;

import controleur.Connexion;
import controleur.GererClient;

public class Main {

	private static GererClient gestionClient;

	public static void main(String[] args) {
		Connexion connexion = new Connexion();
//		gererLocation.getLocationList();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principale window = new Principale(connexion);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
