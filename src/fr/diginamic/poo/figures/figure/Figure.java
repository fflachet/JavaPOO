package fr.diginamic.poo.figures.figure;

import fr.diginamic.poo.figures.util.FigureUtil;
import fr.diginamic.poo.figures.util.RandomUtil;


public abstract class Figure {

	public abstract String toString();
	
	public static Figure getRandomFigure() {
		switch (RandomUtil.getRandomInt(1, 4)) {
		case 1:
			return FigureUtil.getRandomCarre();
		case 2: 
			return FigureUtil.getRandomRectangle();
		case 3: 
			return FigureUtil.getRandomRond();
		case 4:
			return FigureUtil.getRandomSegment();
		default:
			return null;
		}
	}

	public void affiche() {
		System.out.println(this);
	}

	protected abstract Point[] getPoints();

}
