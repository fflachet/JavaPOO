package fr.diginamic.poo.figures.util;

public class RandomUtil {

	public static int getRandomInt(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}

	public static boolean getRandomBoolean() {
		return getRandomInt(0, 1) != 0;
	}
}
