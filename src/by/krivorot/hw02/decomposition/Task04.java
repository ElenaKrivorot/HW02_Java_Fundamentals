package by.krivorot.hw02.decomposition;

import java.util.Scanner;

public class Task04 {
	/*
	 * Написать метод(методы) для нахождения наименьшего общего кратного трех
	 * натуральных чисел.
	 */

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int nok;
		boolean f;

		do {
			a = enterFromConsole("Введите a: ");
			b = enterFromConsole("Введите b: ");
			c = enterFromConsole("Введите c: ");

			f = check(a, b, c);
		} while (!f);

		nok = nok(a, b, c);
		print(a, b, c, nok);
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

	public static int nok(int a, int b, int c) {
		int nok = 1;
		int max;
		int i;

		if ((a >= b) && (a >= c)) {
			max = a;
		} else {
			if (b >= c) {
				max = b;
			} else {
				max = c;
			}
		}

		for (i = max; i <= (a * b * c); i++)

		{
			if ((i % a == 0) && (i % b == 0) && (i % c == 0)) {
				nok = i;
				break;
			}
		}

		return nok;
	}

	public static void print(int a, int b, int c, int nok) {
		System.out.println("Для чисел: " + a + "; " + b + "; " + c + " - НОК равен " + nok);
	}

}
