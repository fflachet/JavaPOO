
public class Rond {
	
	private Point p;
	private int r;
	
	public Rond(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	@Override
	public String toString() {
		return "[ROND "+ p +" , "+ r +"]";
	}
	
	public void affiche() {
		System.out.println(toString());
	}
}
