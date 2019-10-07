import java.util.Random;

public class FigureUtil {
	
	static int nbX = new Random().nextInt(25);
	static int nbY = new Random().nextInt(25);
	static int nb = new Random().nextInt(25);
	static boolean h = new Random().nextBoolean();
	
	private Point getRandomPoint() {
		
		Point point = new Point();
		point.setX(nbX);
		point.setY(nbY);
		
		
		return point;
	}
	
	public Rond getRandomRond() {
		Rond rond = new Rond(getRandomPoint(), nb);
		
		return rond;
	}
	
	public Rectangle getRandomRectangle() {
		Rectangle rect = new Rectangle(getRandomPoint(), nbX, nbY);
		
		return rect;
	}
	
	public Carre getRandomCarre() {
		Carre carre = new Carre(getRandomPoint(), nb);
		
		return carre;
	}
	
	public Segment getRandomSegment() {
		Segment seg = new Segment(getRandomPoint(), nb, h);
	
		return seg;
	}
	
	public Figure getRandomFigure() {
		int rand = new Random().nextInt(4);
		
		switch (rand) {
		case 0:
			return getRandomRond();
		case 1:
			return getRandomRectangle();
		case 2:
			return getRandomCarre();
		default:
			return getRandomSegment();
		}
	}
	
	public Surfacable getRandomSurfacable() {
		int rand = new Random().nextInt(3);
		
		switch (rand) {
		case 0:
			return getRandomRond();
		case 1:
			return getRandomRectangle();
		default:
			return getRandomCarre();
		
		}
	}
}
