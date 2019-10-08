package fr.diginamic.poo.figures.util;

import fr.diginamic.poo.figures.figure.Carre;
import fr.diginamic.poo.figures.figure.Figure;
import fr.diginamic.poo.figures.figure.Point;
import fr.diginamic.poo.figures.figure.Rectangle;
import fr.diginamic.poo.figures.figure.Rond;
import fr.diginamic.poo.figures.figure.Segment;


public class FigureUtil {
	
	
	private FigureUtil() {
		super();
	}

	private static Point getRandomPoint() {
		
		int x = RandomUtil.getRandomInt(-30, 30);
		int y = RandomUtil.getRandomInt(-20, 20);
		
		return new Point(x, y);
	}

	public static Rond getRandomRond() {
		return new Rond(getRandomPoint(), RandomUtil.getRandomInt(1, 7));

	}

	public static Rectangle getRandomRectangle() {
		Point pointOrigine = getRandomPoint();
		int longueurX = RandomUtil.getRandomInt(1, 15);
		int longueurY = RandomUtil.getRandomInt(5, 14);
		
		return new Rectangle(pointOrigine, longueurX, longueurY);
	}

	public static Carre getRandomCarre() {
		Point pointOrigine = getRandomPoint();
		int longueur = RandomUtil.getRandomInt(1, 15);
		
		return new Carre(pointOrigine, longueur);
	}

	public static Segment getRandomSegment() {
		Point pointOrigine = getRandomPoint();
		int longueur = RandomUtil.getRandomInt(1, 20);
		boolean horizontal = RandomUtil.getRandomBoolean();
		
		return new Segment(pointOrigine, longueur, horizontal);
	}

	public static Point[] getPoints(Figure[] figArray) {
		
		
		
		
		
		
		
//		for(int i = 0; i < figArray.length; i++) {
//			if (i == figArray.length -1) {
//				
//				System.out.println();
//			}
//			
//		}
		

		return null;
		
	}
}
