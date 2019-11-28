package by.krivorot.hw02.decomposition;

public class Task12 {
	/*
	 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
	 * вычисления его площади, если угол между сторонами длиной X и Y— прямой.
	 */

	public static void main(String[] args) {
		double x = 5;
		double y = 4;
		double t = 8;
		double z = 5;
		double s;
		boolean q;

		q = isThisRectangularTrapezoid(x, z, y, t);
		s = countSquare(x, z, y, q);
		printSqareOfTrapezoid(x, z, y, s);

		q = isThisRectangularTrapezoid(x, t, y, z);
		s = countSquare(x, t, y, q);
		printSqareOfTrapezoid(x, t, y, s);

		q = isThisRectangularTrapezoid(y, z, x, t);
		s = countSquare(y, z, x, q);
		printSqareOfTrapezoid(y, z, x, s);

		q = isThisRectangularTrapezoid(y, t, x, z);
		s = countSquare(y, t, x, q);
		printSqareOfTrapezoid(y, t, x, s);
	}

	public static boolean isThisRectangularTrapezoid(double a, double b, double h, double c) {
		double c1;

		c1 = Math.sqrt(Math.pow((a - b), 2) + h * h);
		if (c1 == c)
			return true;
		else
			return false;
	}

	public static double countSquare(double a, double b, double h, boolean q) {
		double s;

		if (q) {
			s = (a + b) / 2 * h;
		} else {
			s = 0;
		}
		return s;
	}

	public static void printSqareOfTrapezoid(double a, double b, double h, double s) {
		if (s != 0) {
			System.out.println(
					"Площадь прямоугольной трапеции с основаниями " + a + ", " + b + " и высотой " + h + " равна " + s);
		}
	}

}
