package partie6;

public class TestPoint {

	public static void main(String[] args) {
		try {
			Point a = new Point(0,4);
			a.deplace(3, -5);
			a.affiche();
		} catch (ErrConst e) {
			System.out.println("Erreur Construction");
			System.out.println(e.getMessage());
			System.exit(-1);
		} catch (ErrDepl e) {
			System.out.println("Erreur déplacement");
			System.exit(-1);
		}

	}

}
