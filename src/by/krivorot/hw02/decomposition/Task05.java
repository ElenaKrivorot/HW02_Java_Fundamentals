package by.krivorot.hw02.decomposition;

import java.util.Scanner;

public class Task05 {
	/*
	 * Написать метод(методы) для нахождения суммы большего и меньшего из трех
	 * чисел.
	 */

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int max;
		int min;
		int sum;
		boolean f;

		do {
			a = enterFromConsole("Введите a: ");
			b = enterFromConsole("Введите b: ");
			c = enterFromConsole("Введите c: ");

			f = check(a, b, c);
		} while (!f);

		max = max(a, b, c);
		min = min(a, b, c);
		sum = sum(max, min);
		print(a, b, c, sum);
	}

	public static int enterFromConsole(String mes) {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println(mes);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(mes);
		}
		x = sc.nextInt();

		return x;
	}

	public static boolean check(int a, int b, int c) {
		boolean f;
		if ((a <= 0) || (b <= 0) || (c <= 0)) {
			f = false;
		} else {
			f = true;
		}
		return f;
	}

	public static int max(int a, int b, int c) {
		int max;
		if ((a >= b) && (a >= c)) {
			max = a;
		} else {
			if (b >= c) {
				max = b;
			} else {
				max = c;
			}
		}
		return max;
	}

	public static int min(int a, int b, int c) {
		int min;
		if ((a <= b) && (a <= c)) {
			min = a;
		} else {
			if (b <= c) {
				min = b;
			} else {
				min = c;
			}
		}
		return min;
	}

	public static int sum(int a, int b) {
		return (a + b);
	}

	public static void print(int a, int b, int c, int sum) {
		System.out.println(
				"Для чисел: " + a + "; " + b + "; " + c + " - сумма наименьшего и наибольшего числа равна " + sum);
	}

}
