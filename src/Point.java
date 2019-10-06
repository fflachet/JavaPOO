
public class Point {
	
	final private int INIT_X = 25;
	final private int INIT_Y = 25;
	int x,y;
	
	public Point(int x, int y) {
		super();
		this.x = INIT_X;
		this.y = INIT_Y;
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
	@Override
	public String toString() {
		return "["+ x + ";" + y + "]";
	}
	
	
	
	
}
