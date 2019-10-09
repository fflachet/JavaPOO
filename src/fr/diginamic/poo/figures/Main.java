package fr.diginamic.poo.figures;

import fr.diginamic.poo.figures.figure.Figure;
import fr.diginamic.poo.figures.figure.Point;
import fr.diginamic.poo.figures.util.FigureUtil;
import fr.diginamic.poo.figures.util.SurfacableUtil;

public class Main {

	public static void main(String args[]) {

		FigureUtil.getRandomCarre().getPoints();
		FigureUtil.getRandomRond().affiche();
		FigureUtil.getRandomRectangle().affiche();
		FigureUtil.getRandomSegment().affiche();

		Figure.getRandomFigure();
		SurfacableUtil.getRandomSurfacable();
		System.out.println("******** TP 20 **********");
		Figure[] figArray = new Figure[5];

		figArray[0] = FigureUtil.getRandomRond();
		figArray[1] = FigureUtil.getRandomCarre();
		figArray[2] = FigureUtil.getRandomCarre();
		figArray[3] = FigureUtil.getRandomCarre();
		figArray[4] = FigureUtil.getRandomCarre();

		Point[] points = FigureUtil.getPoints(figArray);
		System.out.println("Points des random figures :");
		for (Point point : points) {
			System.out.println(point);
		}
	}

}
