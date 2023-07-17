
public class Voiture34 {
	private String m_nom;
	private int m_puissance;
	private int m_vitesse;
	private boolean m_estDemarree;
	private static int nbVoitures;
	private static Voiture34[] listeVoitures = new Voiture34[10];
	// Constructeurs
	
	public Voiture34() {
		setM_puissance(0);
		setM_vitesse(0);
		setM_estDemarree(false);
		listeVoitures[nbVoitures] = this;
		nbVoitures++;
	}

	public Voiture34(int puissance) {
		setM_puissance(puissance);
		setM_vitesse(0);
		setM_estDemarree(false);
		listeVoitures[nbVoitures] = this;
		nbVoitures++;
	}

	public Voiture34(int puissance, int vitesse) {
		setM_puissance(puissance);
		setM_vitesse(vitesse);
		setM_estDemarree(false);
		listeVoitures[nbVoitures] = this;
		nbVoitures++;
	}

	public Voiture34(int puissance, int vitesse, boolean estDemarree) {
		setM_puissance(puissance);
		setM_vitesse(vitesse);
		setM_estDemarree(estDemarree);
		listeVoitures[nbVoitures] = this;
		nbVoitures++;
	}
	

	public int getM_puissance() {
		return m_puissance;
	}

	public void setM_puissance(int m_puissance) {
		this.m_puissance = m_puissance;
	}

	public int getM_vitesse() {
		return m_vitesse;
	}

	public void setM_vitesse(int m_vitesse) {
		this.m_vitesse = m_vitesse;
	}

	public boolean isM_estDemarree() {
		return m_estDemarree;
	}

	public void setM_estDemarree(boolean m_estDemarree) {
		this.m_estDemarree = m_estDemarree;
	}


	public String getM_nom() {
		return m_nom;
	}

	public void setM_nom(String m_nom) {
		this.m_nom = m_nom;
	}
	
	// Méthodes
	public void demarre() {
		setM_estDemarree(true);
	}

	public void demarre(int vitesse) {
		if (vitesse > 0) {
			setM_estDemarree(true);
		}
	}

	public void afficheVoiture() {
		System.out.println("Puissance : " + this.m_puissance);
		System.out.println("Vitesse : " + this.m_vitesse);
		System.out.println("Est démarré ? " + this.m_estDemarree);
	}
	
	
	//Méthodes de classe
	
	public static int getnbVoitures() {
		return nbVoitures;
	}
	
	public static Voiture34[] getlisteVoitures() {
		return listeVoitures;
	}
	
}
