
public class Rond extends Figure implements Surfacable {
	
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
		return "[" + getType() + p +" , "+ r +"]surface : " + surface();
	}
	
	@Override
	protected String getType() {
		return this.getClass().getSimpleName();
	}
	
	@Override
	public void affiche() {
		System.out.println(toString());
	}
	
	@Override
	public double surface() {
		double aire = r * r * Math.PI; 
		return aire;
	}
	
	@Override
	protected Point[] getPoints() {
		
		return null;
	}
	
}
