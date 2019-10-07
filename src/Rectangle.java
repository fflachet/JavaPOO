
public class Rectangle extends Figure implements Surfacable {
	
	private Point pbg;
	private Point pbd;
	private Point phg;
	private Point phd;	
	private int x,y;
	double s;
	
	public Rectangle(Point pbg, int x, int y) {
		super();
		this.pbg = pbg;
		this.pbd = new Point(pbg.getX() + x, pbg.getY());
		this.phg = new Point(pbg.getX(), pbg.getY() + y);
		this.phd = new Point(pbg.getX() + x, pbg.getY() + y);
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

	@Override
	protected String getType() {
		
		return this.getClass().getSimpleName();
	}

	@Override
	public String toString() {
		return "[" + getType() + " " + pbg + pbd + phg + phd + "]surface : " + surface();
	}
	
	@Override
	public void affiche() {
		System.out.println(toString());
		
	}

	@Override
	public double surface() {
		double s = (pbd.getX() - pbg.getX()) * (phg.getY() - pbg.getY());
		return s;
	}
	
	@Override
	protected Point[] getPoints() {
		Point[] points;
		
		return null;
	}
	
	

	
	

	
	
	
	
}
