
public class Segment extends Figure {
	
	Point debut;
	Point fin;
	int longueur;
	boolean horizontal;
	
	public Segment(Point debut, int longueur, boolean horizontal) {
		super();
		this.debut = debut;
		if(this.horizontal) {
			this.fin = new Point(debut.getX() + longueur,debut.getY()); 
		} else {
			this.fin = new Point(debut.getX(),debut.getY() + longueur);
		}
	}
	
	@Override
	protected String getType() {
		return this.getClass().getSimpleName();
	}
	
	@Override
	public String toString() {
		return "[" + getType() + " [" + debut + " à " + fin + "]";
	}

	@Override
	public void affiche() {
		System.out.println(toString());
	}
	
	@Override
	protected Point[] getPoints() {
		
		return null;
	}

}
