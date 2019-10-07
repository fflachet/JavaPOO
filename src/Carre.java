
public class Carre  extends Rectangle {
	
	private Point p = new Point();
	private int x;
	
	public Carre(Point p, int x) {
		super(p, x, x);
		this.p = p;
		this.x = x;
			
	}
	
	@Override
	public Point getPointBasGauche() {
		// TODO Auto-generated method stub
		return super.getPointBasGauche();
	}

	@Override
	public Point getPointBasDroite() {
		// TODO Auto-generated method stub
		return super.getPointBasDroite();
	}

	@Override
	public Point getPointHautGauche() {
		// TODO Auto-generated method stub
		return super.getPointHautGauche();
	}

	@Override
	public Point getPointHautDroite() {
		// TODO Auto-generated method stub
		return super.getPointHautDroite();
	}
	
	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return super.surface();
	}
	
	@Override
	protected Point[] getPoints() {
		// TODO Auto-generated method stub
		return super.getPoints();
	}

	@Override
	public String toString() {
		return "[" + getType() + " " + getPointBasDroite() + getPointBasGauche() + getPointHautDroite() + getPointHautGauche() + "]surface : " + surface();
	}
}
