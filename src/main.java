
public class main {

	public static void main(String[] args) {
		
//		Point point = new Point();
//		System.out.println(point);
//		Rond rond = new Rond(point, 8);
//		rond.affiche();
//		Rectangle rect = new Rectangle(point, 5, 8);
//		rect.affiche();
		
		
		FigureUtil fu = new FigureUtil();
		fu.getRandomRond().affiche();
		fu.getRandomRectangle().affiche();
		fu.getRandomCarre().affiche();

		Point p = new Point(0,1);
		Point p2 = new Point(0,1);
		
		if(p.equals(p2))
			System.out.println("égal");
		
		fu.getRandomFigure().affiche();
		fu.getRandomSurfacable().affiche();

		
		
	}

}
