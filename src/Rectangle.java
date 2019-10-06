
public class Rectangle {
	
	private Point point;
	private int x,y;
	
	
	
	public Rectangle(Point point, int x, int y) {
		super();
		this.point = point;
		this.x = x;
		this.y = y;
	}
	
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
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
		return this.point;
	}
	public Point getPointBasDroite() {
		return new Point(point.getX() + 5,point.getY() + 7);
	}
	public Point getPointHautGauche() {
		return new Point(point.getX() + 8,point.getY() + 2);
	}
	public Point getPointHautDroite() {
		return new Point(point.getX() + 4,point.getY() + 6);
	}
	
	@Override
	public String toString() {
		return "[RECT " + getPointBasGauche() + getPointBasDroite() + getPointHautDroite() + getPointHautGauche() + "]";
	}
	
	public void affiche() {
		System.out.println(toString());
	}
	
}
