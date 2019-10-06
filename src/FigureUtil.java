import java.util.Random;

public class FigureUtil {
	
	Random nb = new Random();
	
	private Point getRandomPoint() {
		
		Point point = new Point(nb.nextInt(),nb.nextInt());
		point.setX(nb.nextInt());
		point.setY(nb.nextInt());
		
		
		return point;
	}
	
	public Rond getRandomRond() {
		Rond rond = new Rond(getRandomPoint(), nb.nextInt());
		
		return rond;
	}
	
	public Rectangle getRandomRectangle() {
		Rectangle rect = new Rectangle(getRandomPoint(), nb.nextInt(), nb.nextInt());
		
		return rect;
	}

}
