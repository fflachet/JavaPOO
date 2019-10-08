package fr.diginamic.poo.figures;

import fr.diginamic.poo.figures.figure.Figure;
import fr.diginamic.poo.figures.util.FigureUtil;
import fr.diginamic.poo.figures.util.SurfacableUtil;

public class main {

	public static void main(String[] args) {


		FigureUtil.getRandomCarre().affiche();
		FigureUtil.getRandomRond().affiche();
		FigureUtil.getRandomRectangle().affiche();
		FigureUtil.getRandomSegment().affiche();
		
		Figure.getRandomFigure();
		SurfacableUtil.getRandomSurfacable();

	}

}
