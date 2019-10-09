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

		int length = 0;
		for (Figure e : figArray) {
			length += e.getPoints().length;
		}
		/*
		 * Equivalent à : for (int i = 0; i < figArray.length; i++) { Figure e =
		 * figures[i]; length += e.getPoints().length; }
		 */

		int countPoints = 0;
		Point[] points = new Point[length];
		for (Figure e : figArray) {
			for (Point point : e.getPoints()) {
				points[countPoints++] = point;
			}
		}
		/*
		 * Equivalent à : countPoints = 0; for (int i = 0; i < figures.length; i++) {
		 * Figure currentFigure = figures[i]; Point[] pointsOfCurrentFigure =
		 * currentFigure.getPoints(); for (int j = 0; j < pointsOfCurrentFigure.length;
		 * j++) { Point currentPointOfCurrentFigure = pointsOfCurrentFigure[j];
		 * points[countPoints] = currentPointOfCurrentFigure; countPoints = countPoints
		 * + 1; } }
		 */

		return points;
	}

}
