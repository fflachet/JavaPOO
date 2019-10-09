package fr.diginamic.poo.figures.util;

import fr.diginamic.poo.figures.figure.Surfacable;

public class SurfacableUtil {
	public static Surfacable getRandomSurfacable() {
		switch (RandomUtil.getRandomInt(1, 3)) {
		case 1:
			return FigureUtil.getRandomCarre();
		case 2:
			return FigureUtil.getRandomRectangle();
		case 3:
			return FigureUtil.getRandomRond();
		default:
			return null;
		}
	}
}
