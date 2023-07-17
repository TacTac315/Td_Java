package partie4;

public class Exercice41 {
	public static void main(String[] argv) {
		Voiture34 voiture1 = new Voiture34(292,70);
		Voiture34 voiture2 = new Voiture34(82,85);
		VehiculePrioritaire vehiculeprioritaire1 = new VehiculePrioritaire();
		
		voiture1.setM_nom("Mercedes-Benz E350 CGI");
		voiture2.setM_nom("Honda Jazz");
		vehiculeprioritaire1.setM_nom("Renault Trafic ambulance");
		vehiculeprioritaire1.setM_puissance(115);
		
		Voiture34[] listeVoitures = Voiture34.getlisteVoitures();
		
		System.out.println("L'ambulance va à une vitesse de : "+vehiculeprioritaire1.getM_vitesse()+"km/h");
		System.out.println("Elle va maintenant accélerer");
		int i=0;
		while(i<5) {
			vehiculeprioritaire1.accelere();;
			i++;
		}
		System.out.println("L'ambulance va maintenant à une vitesse de : "+vehiculeprioritaire1.getM_vitesse()+"km/h");
		System.out.println("Voici la liste de tout les véhicules en circulations : ");
		i=0;
		while(listeVoitures[i] != null) {
			System.out.println(listeVoitures[i].getM_nom() +" ; " + listeVoitures[i].getM_puissance() +"Cv ; "+ listeVoitures[i].getM_vitesse()+"km/h");
			i++;
		}
		
	
	}

}
