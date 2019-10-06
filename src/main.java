
public class main {

	public static void main(String[] args) {
		
		/*
		Point point = new Point(5,6);
		System.out.println(point);
		Rond rond = new Rond(point, 8);
		rond.affiche();
		Rectangle rect = new Rectangle(point, 5, 8);
		rect.affiche(); 
		*/
		
		FigureUtil fu = new FigureUtil();
		fu.getRandomRond().affiche();
		fu.getRandomRectangle().affiche();
	}

}
