package fr.diginamic.poo.figures.figure;

public class Rectangle extends Figure implements Surfacable {

	protected Point pbg;
	protected Point pbd;
	protected Point phg;
	protected Point phd;

	protected int x, y;

	public Rectangle(Point pbg, int x, int y) {
		this.pbg = pbg;
		this.pbd = new Point(pbg.getX() + x, pbg.getY());
		this.phg = new Point(pbg.getX(), pbg.getY() + y);
		this.phd = new Point(pbg.getX() + x, pbg.getY() + y);

		this.x = x;
		this.y = y;
	}

	public Point getPointBasGauche() {
		return pbg;
	}

	public Point getPointBasDroite() {
		return pbd;
	}

	public Point getPointHautGauche() {
		return phg;
	}

	public Point getPointHautDroite() {
		return phd;
	}

	protected String getType() {
		return this.getClass().getSimpleName();
	}

	public String toString() {
		return "[" + getType() + " " + pbg + pbd + phg + phd + "]surface : " + surface();
	}

	@Override
	public double surface() {
		return x * y;
	}

	@Override
	public Point[] getPoints() {
		Point[] points = { pbg, pbd, phd, phg };
		return points;
	}

}
