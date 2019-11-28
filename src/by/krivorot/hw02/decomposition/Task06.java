package by.krivorot.hw02.decomposition;

import java.util.Random;

public class Task06 {
	/*
	 * Вычислить площадь правильного шестиугольника со стороной а, используя метод
	 * вычисления площади треугольника.
	 */

	public static void main(String[] args) {
		int a;
		double s1;
		double s;
		boolean d;

		do {
			a = randomValue(10);
			d = check(a);
		} while (!d);

		s1 = areaTriangle(a);
		s = areaHexagon(s1);

		print(a, s);

	}

	public static int randomValue(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static boolean check(int a) {
		boolean d;
		if (a <= 0) {
			d = false;
		} else {
			d = true;
		}
		return d;
	}

	public static double areaTriangle(int a) {
		double s;

		s = Math.sqrt(3) / 4 * a * a;
		return s;
	}

	public static double areaHexagon(double s1) {
		double s;

		s = 6 * s1;
		return s;
	}

	public static void print(int a, double s) {
		System.out.printf("Площадь шестиугольника со стороной: %d равна %.2f", a, s);
	}

}
