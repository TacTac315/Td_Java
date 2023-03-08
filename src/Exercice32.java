

public class Exercice32 {

	public static void main(String[] argv) {
		Voiture2 E350;
		E350 = new Voiture2(292,250);
		Voiture2 SLK230 = new Voiture2(193,240,false);
		E350.demarre();
		SLK230.demarre();
		E350.afficheVoiture();
		SLK230.afficheVoiture();
	}
}
