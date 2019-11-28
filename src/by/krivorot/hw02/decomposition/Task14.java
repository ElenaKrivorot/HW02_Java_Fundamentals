package by.krivorot.hw02.decomposition;

import java.util.Random;

public class Task14 {
	/*
	 * Написать метод(методы), определяющий, в каком из данных двух чисел больше
	 * цифр.
	 */

	public static void main(String[] args) {
		int a;
		int b;
		int max;

		a = randomValue(999999999);
		b = randomValue(999999999);

		max = findValueWithMaxCountOfNumerals(a, b);

		printMax(a, b, max);

	}

	public static int randomValue(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit) + 1;
	}

	public static int countNumerals(int n) {
		int x = 1;

		while (n / 10 != 0) {
			x++;
			n = n / 10;
		}
		return x;
	}

	public static int findValueWithMaxCountOfNumerals(int a, int b) {
		if (countNumerals(a) > countNumerals(b)) {
			return a;
		} else if (countNumerals(a) < countNumerals(b)) {
			return b;
		} else {
			return 0;
		}
	}

	public static void printMax(int a, int b, int max) {
		if (max == 0) {
			System.out.println("В числах " + a + " и " + b + " одинаковое количество цифр");
		} else {
			System.out.println("Из чисел " + a + " и " + b + " больше цифр в числе " + max);
		}
	}

}
