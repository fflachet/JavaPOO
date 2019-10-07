
public class Point {
	
	final private int INIT_X = 25;
	final private int INIT_Y = 25;
	int x,y;
	
	public Point() {
		super();
		this.x = INIT_X;
		this.y = INIT_Y;
	}
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (INIT_X != other.INIT_X)
			return false;
		if (INIT_Y != other.INIT_Y)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "["+ x + ";" + y + "]";
	}
	
	
	
	
}
