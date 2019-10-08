package fr.diginamic.poo.figures.figure;

public class Carre extends Rectangle {

	public Carre(Point p, int x) {
		super(p, x, x);
	}
	
	public String getType() {
		return this.getClass().getSimpleName();
	}
	
	@Override
	public Point[] getPoints() {
		// TODO Auto-generated method stub
		return super.getPoints();
	}

	
}
