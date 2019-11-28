package by.krivorot.hw02.decomposition;

import java.util.Random;

public class Task02 {
	/*
	 * Написать метод(методы) для нахождения наибольшего общего делителя и
	 * наименьшего общего кратного двух натуральных чисел.
	 */

	public static void main(String[] args) {

		int a;
		int b;
		int nod;
		int nok;
		boolean d;

		do {
			a = randomValue(50);
			b = randomValue(50);
			d = check(a, b);
		} while (!d);

		nod = nod(a, b);
		nok = nok(a, b, nod);
		print(a, b, nod, nok);

	}

	public static int randomValue(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static boolean check(int a, int b) {
		boolean d;
		if ((a <= 0) || (b <= 0)) {
			d = false;
		} else {
			d = true;
		}
		return d;
	}

	public static int nod(int a, int b) {
		int nod = 1;
		int x;
		int i;

		if (a < b) {
			x = a;
		} else {
			x = b;
		}

		for (i = x; i >= 1; i--) {
			if ((a % i == 0) && (b % i == 0)) {
				nod = i;
				break;
			}
		}

		return nod;
	}

	public static int nok(int a, int b, int nod) {

		return (a * b / nod);
	}

	public static void print(int a, int b, int nod, int nok) {
		System.out.println("Для чисел: " + a + "; " + b + " - НОД равен " + nod + ", НОК равен " + nok);
	}

}
