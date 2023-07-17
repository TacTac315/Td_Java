package partie6;

@SuppressWarnings("serial")
public class ErrConst extends Exception {
	private String message="Erreur lors de la construction ";
	private int abs;
	private int ord;
	public ErrConst() {}
	public ErrConst(int x, int y) {
		this.abs = x;
		this.ord = y;
	}
	public String getMessage() {
		return message+"abs:"+getAbs()+" ord:"+getOrd();
	}
	public int getAbs() {
		return this.abs;
	}
	public int getOrd() {
		return this.ord;
	}
}
