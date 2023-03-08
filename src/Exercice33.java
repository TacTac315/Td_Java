
public class Exercice33 {
	public static void main(String[] argv) {
		Voiture3 voiture1;
		voiture1 = new Voiture3(292, 250);
		Voiture3 voiture2 = new Voiture3(193, 240, false);
		voiture1.demarre();
		voiture2.demarre(0);
		voiture1.afficheVoiture();
		voiture2.afficheVoiture();
		System.out.println(voiture1);
		voiture1 = null;
	}

}
