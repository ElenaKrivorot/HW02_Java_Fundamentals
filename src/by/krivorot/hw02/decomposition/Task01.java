package by.krivorot.hw02.decomposition;

import java.util.Random;

public class Task01 {
	/*
	 * Треугольник задан координатами своих вершин. Написать метод для вычисления
	 * его площади.
	 */

	public static void main(String[] args) {
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
		double a;
		double b;
		double c;
		double s;
		boolean d;

		do {
			x1 = randomValue(10);
			y1 = randomValue(10);
			x2 = randomValue(10);
			y2 = randomValue(10);
			x3 = randomValue(10);
			y3 = randomValue(10);

			a = side(x1, y1, x2, y2);
			b = side(x1, y1, x3, y3);
			c = side(x2, y2, x3, y3);

			d = check(a, b, c);
		} while (!d);

		s = area(a, b, c);

		print(x1, y1, x2, y2, x3, y3, s);

	}

	public static int randomValue(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static double side(int x1, int y1, int x2, int y2) {
		double z;
		z = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return z;
	}

	public static boolean check(double a, double b, double c) {
		boolean d;
		if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
			d = false;
		} else {
			d = true;
		}
		return d;
	}

	public static double area(double a, double b, double c) {
		double s;
		double p;
		p = (a + b + c) / 2;
		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return s;
	}

	public static void print(int x1, int y1, int x2, int y2, int x3, int y3, double s) {
		System.out.printf("Площадь треугольника с координатами вершин: (%d;%d), (%d;%d), (%d;%d) равна %.2f", x1, y1,
				x2, y2, x3, y3, s);
	}

}
