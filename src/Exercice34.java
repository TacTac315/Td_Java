
public class Exercice34 {
	public static void main(String[] argv) {
		Voiture34 voiture1 = new Voiture34(292, 260);
		Voiture34 voiture2 = new Voiture34(83, 170);
		voiture1.setM_nom("Mercedes-Benz E350 CGI");
		voiture2.setM_nom("Honda Jazz");
		
		Voiture34[] listeVoitures = Voiture34.getlisteVoitures();

		System.out.println("Nombre total de voiture : " + Voiture34.getnbVoitures());
		int i=0;
		while(listeVoitures[i] != null) {
			System.out.println(listeVoitures[i].getM_nom());
			i++;
		}
	
	}
}
