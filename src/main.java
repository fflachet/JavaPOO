
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point = new Point(5,6);
		System.out.println(point);
		Rond rond = new Rond(point, 8);
		rond.affiche();
		Rectangle rect = new Rectangle(point, 5, 8);
		rect.affiche();
	}

}
