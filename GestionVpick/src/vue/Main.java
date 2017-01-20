package vue;

import controleur.Connexion;
import controleur.gererLocation;

public class Main {

	public static void main(String[] args) {
		Connexion connexion = new Connexion();
		gererLocation gererLocation = new gererLocation(connexion);
		gererLocation.getLocationList();
	}

}
