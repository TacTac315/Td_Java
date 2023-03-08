package partie3;

public class Voiture {
	public int m_puissance;
	public int m_vitesse;
	public boolean m_estDemarree;

	// Constructeurs (pas de voiture)

	public Voiture() {
		m_puissance = 0;
		m_vitesse = 0;
		m_estDemarree = false;
	}

	public Voiture(int puissance) {
		m_puissance = puissance;
		m_vitesse = 0;
		m_estDemarree = false;
	}

	public Voiture(int puissance, int vitesse) {
		m_puissance = puissance;
		m_vitesse = vitesse;
		m_estDemarree = false;
	}

	public Voiture(int puissance, int vitesse, boolean estDemarree) {
		m_puissance = puissance;
		m_vitesse = vitesse;
		m_estDemarree = estDemarree;
	}

}
