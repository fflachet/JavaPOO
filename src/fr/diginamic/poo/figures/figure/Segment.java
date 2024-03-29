package fr.diginamic.poo.figures.figure;

public class Segment extends Figure {

	Point debut;
	Point fin;

	public Segment(Point debut, int longueur, boolean horizontal) {
		super();
		this.debut = debut;
		if (horizontal) {
			fin = new Point(debut.getX() + longueur, debut.getY());
		} else {
			fin = new Point(debut.getX(), debut.getY() + longueur);
		}
	}

	protected String getType() {
		return this.getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return "[" + getType() + " [" + debut + " � " + fin + "]";
	}

	@Override
	public Point[] getPoints() {
		Point[] points = { debut, fin };
		return points;
	}
}
