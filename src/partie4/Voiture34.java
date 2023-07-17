/**
La classe <code>Voiture34</code> possède cinq attributs <b>privés</b> :
<ul>
<li>m_nom : le nom de la voiture</li>
<li>m_puissance : la puissance de la voiture</li>
<li>m_vitesse : la vitesse de la voiture</li>
<li>m_estDemarree : un booléen indiquant si la voiture est démarrée</li>
<li>m_dateCreation : la date de création de la voiture</li>
</ul>
@author Vincent E.
@version 6.0
*/
package partie4;
public class Voiture34 {
private String m_nom;
private int m_puissance;
private int m_vitesse;
private boolean m_estDemarree;
private java.util.Date m_dateCreation;
private static int nbVoitures;
private static Voiture34[] listeVoitures = new Voiture34[10];
	/**
	 * Constructeur 
	 */
	public Voiture34() {
		setM_puissance(0);
		setM_vitesse(0);
		setM_estDemarree(false);
		setM_dateCreation();
		listeVoitures[nbVoitures] = this;
		nbVoitures++;
	}
	/**
	 * Constructeur
	 * @param vitesse : vitesse initiale de la voiture
	 */
	public Voiture34(int vitesse) {
		setM_puissance(0);
		setM_vitesse(vitesse);
		setM_estDemarree(false);
		setM_dateCreation();
		listeVoitures[nbVoitures] = this;
		nbVoitures++;
	}
	/**
	 * Constructeur
	 * @param puissance : puissance de la voiture
	 * @param vitesse : vitesse initiale de la voiture
	 */
	public Voiture34(int puissance, int vitesse) {
		setM_puissance(puissance);
		setM_vitesse(vitesse);
		setM_estDemarree(false);
		setM_dateCreation();
		listeVoitures[nbVoitures] = this;
		nbVoitures++;
	}
	/**
	 * Constructeur
	 * @param puissance : puissance de la voiture
	 * @param vitesse : vitesse initiale de la voiture
	 * @param estDemarree : estDemarree bool&eacute;en indiquant si la voiture est d&eacute;mar&eacute;e
	 */
	public Voiture34(int puissance, int vitesse, boolean estDemarree) {
		setM_puissance(puissance);
		setM_vitesse(vitesse);
		setM_estDemarree(estDemarree);
		setM_dateCreation();
		listeVoitures[nbVoitures] = this;
		nbVoitures++;
	}
	/**
	 * Getter attribut m_puissance 
	 * @return m_puissance : puissance actuelle de la voiture
	 */
	public int getM_puissance() {
		return m_puissance;
	}
	/**
	 * Setter attribut m_puissance
	 * @param m_puissance : nouvelle puissance avec KESS V2
	 */
	public void setM_puissance(int m_puissance) {
		this.m_puissance = m_puissance;
	}
	/**
	 * Getter attribut m_vitesse
	 * @return m_vitesse : vitesse actuelle de la voiture
	 */
	public int getM_vitesse() {
		return m_vitesse;
	}
	/**
	 * Setter attribut m_vitesse
	 * @param m_vitesse : vitesse voulue pour la voiture
	 */
	public void setM_vitesse(int m_vitesse) {
		this.m_vitesse = m_vitesse;
	}
	/**
	 * Getter attribut bool&eacute;en m_estDemarree
	 * @return m_estDemarree : indique si voiture d&eacute;marr&eacute;e (true/false)
	 * @since 3.0
	 */
	public boolean isM_estDemarree() {
		return m_estDemarree;
	}
	/**
	 * Setter attribut bool&eacute;en m_estDemarree
	 * @param m_estDemarree : modifie l'attribut m_estDemarree (true/false)
	 * @since 3.0
	 */
	public void setM_estDemarree(boolean m_estDemarree) {
		this.m_estDemarree = m_estDemarree;
	}
	/**
	 * Getter attribut m_nom
	 * @return m_nom : Nom de la voiture
	 */
	public String getM_nom() {
		return m_nom;
	}
	/**
	 * Setter attribut m_nom
	 * @param m_nom : Nom voulu pour la voiture
	 */
	public void setM_nom(String m_nom) {
		this.m_nom = m_nom;
	}
	/**
	 * Getter attribut m_dateCreation d'une <code>voiture</code>
	 * @return m_dateCreation : date de cr&eacute;ation de la voiture
	 * @see partie6.Voiture#getM_dateCreation()
	 * @since 6.0
	 */
	public java.util.Date getM_dateCreation() {
		return m_dateCreation;
	}
	/**
	 * Setter attribut m_dateCreation d'une <code>voiture</code>, utilis&eacute; seulement par les constructeurs
	 * @param none
	 * @see partie6.Voiture#getM_dateCreation()
	 * @since 6.0
	 */
	private void setM_dateCreation() {
		this.m_dateCreation = new java.util.Date();
	}
	/**
	 * Permet de d&eacute;marrer une voiture
	 * @param none
	 * @see partie4.Voiture#isM_estDemarree
	 * @since 3.0
	 */
	public void demarre() {
		setM_estDemarree(true);
	}
/**
 * Permet le d&eacute;marrage automatique si vitesse>0
 * @param vitesse : vitesse actuelle de la voiture
 * @see partie4.Voiture#isM_estDemarree
 * @since 3.0
 */
	public void demarre(int vitesse) {
		if (vitesse > 0) {
			setM_estDemarree(true);
		}
	}
/**
 * Affiche les attributs <code>m_puissance, m_vitesse, m_estDemarre</code>
 * @param none
 */
	public void afficheVoiture() {
		System.out.println("Puissance : " + this.m_puissance);
		System.out.println("Vitesse : " + this.m_vitesse);
		System.out.println("Est démarré ? " + this.m_estDemarree);
	}
/**
 * Ajoute 5km/h &agrave; la voiture
 * @param none
 */
	public void accelere() {
		setM_vitesse(getM_vitesse()+5);
	}

/**
 * M&eacute;thode de classe permettant de compter le nombre de voiture
 * @return nbVoitures : nombre de voitures 
 * @since 4.0
 */
	public static int getnbVoitures() {
		return nbVoitures;
	}
/**
 * M&eacute;thode de classe retournant la liste des voitures
 * @return listeVoitures : liste des voitures
 * @since 4.0
 */
	public static Voiture34[] getlisteVoitures() {
		return listeVoitures;
	}

}
