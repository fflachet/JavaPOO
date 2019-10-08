package fr.diginamic.poo.figures.figure;

public class Rond extends Figure implements Surfacable {

	private Point p;
	private int r;

	public Rond(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}

	@Override
	public String toString() {
		return "[" + getType() + p + " , " + r + "]surface : " + surface();
	}

	protected String getType() {
		return this.getClass().getSimpleName();
	}



	@Override
	public double surface() {
		return r * r * Math.PI;
	}

	@Override
	protected Point[] getPoints() {
		Point[] points = new Point[1];
		points[0] = p;

		return points;
	}

}
