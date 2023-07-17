package partie4;

public class VehiculePrioritaire extends Voiture34 {
	@SuppressWarnings("unused") //Evite avertissement Eclipse Seters/Geters
	private boolean m_gyrophare;
	
	//Constructeur
	public VehiculePrioritaire() {
		super(70); //Appel du constructeur Voiture34(int vitesse)
	}
	public void allumeGyrophare() {
		m_gyrophare = true;
	}
	public void eteintGyrophare() {
		m_gyrophare = false;
	}
}
