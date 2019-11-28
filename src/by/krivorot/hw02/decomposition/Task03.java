package by.krivorot.hw02.decomposition;

import java.util.Scanner;

public class Task03 {
	/*
	 * Написать метод(методы) для нахождения наибольшего общего делителя четырех
	 * натуральных чисел.
	 */
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int nod;
		boolean f;

		do {
			a = enterFromConsole("Введите a: ");
			b = enterFromConsole("Введите b: ");
			c = enterFromConsole("Введите c: ");
			d = enterFromConsole("Введите d: ");

			f = check(a, b, c, d);
		} while (!f);

		nod = nod(a, b, c, d);
		print(a, b, c, d, nod);		
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
	
	public static boolean check(int a, int b, int c, int d) {
		boolean f;
		if ((a <= 0) || (b <= 0) || (c <= 0) || (d <= 0)) {
			f = false;
		} else {
			f = true;
		}
		return f;
	}

	public static int nod(int a, int b, int c, int d) {
		int nod = 1;
		int min;
		int i;

		if ((a <= b) && (a <= c) && (a <= d)) {
			min = a;
		} else {
			if ((b <= c) && (b <= d)) {
				min = b;
			} else {
				if (c <= d) {
					min = c;
				} else {
					min = d;
				}
			}
		}

		for (i = min; i >= 1; i--) {
			if ((a % i == 0) && (b % i == 0) && (c % i == 0) && (d % i == 0)) {
				nod = i;
				break;
			}
		}

		return nod;
	}

	public static void print(int a, int b, int c, int d, int nod) {
		System.out.println("Для чисел: " + a + "; " + b + "; " + c + "; " + d + " - НОД равен " + nod);
	}

}
