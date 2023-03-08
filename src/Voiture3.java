
public class Voiture3 {
	private int m_puissance;
	private int m_vitesse;
	private boolean m_estDemarree;

	// Constructeurs (pas de voiture)

	public Voiture3() {
		setM_puissance(0);
		setM_vitesse(0);
		setM_estDemarree(false);
	}

	public Voiture3(int puissance) {
		setM_puissance(puissance);
		setM_vitesse(0);
		setM_estDemarree(false);
	}

	public Voiture3(int puissance, int vitesse) {
		setM_puissance(puissance);
		setM_vitesse(vitesse);
		setM_estDemarree(false);
	}

	public Voiture3(int puissance, int vitesse, boolean estDemarree) {
		setM_puissance(puissance);
		setM_vitesse(vitesse);
		setM_estDemarree(estDemarree);
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

}
