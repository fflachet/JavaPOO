
public class Rectangle {
	
	private Point pbg;
	private Point pbd;
	private Point phg;
	private Point phd;
	private int x,y;
	
	
	
	
	public Rectangle(Point pbg, int x, int y) {
		super();
		this.pbg = pbg;
		this.x = x;
		this.y = y;
	}
	
	public Point getPoint() {
		return pbg;
	}

	public void setPoint(Point pbg) {
		this.pbg = pbg;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point getPointBasGauche() {
		return this.pbg;
	}
	public Point getPointBasDroite() {
		return this.pbd(pbg.getX() + 10,pbg.getY());
	}
	public Point getPointHautGauche() {
		return new Point(point.getX(),point.getY() + 7);
	}
	public Point getPointHautDroite() {
		return new Point(point.getX() + 10,point.getY() + 7);
	}
	
	@Override
	public String toString() {
		return "[RECT " + getPointBasGauche() + getPointBasDroite() + getPointHautDroite() + getPointHautGauche() + "]";
	}
	
	public void affiche() {
		System.out.println(toString());
	}
	
}
