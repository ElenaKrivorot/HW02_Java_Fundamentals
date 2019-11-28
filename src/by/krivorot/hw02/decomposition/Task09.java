package by.krivorot.hw02.decomposition;

import java.util.Scanner;

public class Task09 {
	/*
	 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно
	 * простыми.
	 */

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int nod;

		a = init("Введите a: ");
		b = init("Введите b: ");
		c = init("Введите c: ");

		nod = nod(a, b, c);
		print(nod);
	}

	public static int init(String mes) {
		int x;
		boolean f;

		do {
			System.out.println(mes);
			x = enterFromConsole(mes);
			f = check(x);
		} while (!f);

		return x;
	}

	public static int enterFromConsole(String mes) {
		int x;
		
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(mes);
		}
		x = sc.nextInt();

		return x;
	}

	public static boolean check(int a) {
		boolean f;
		
		if (a <= 0) {
			f = false;
		} else {
			f = true;
		}
		return f;
	}

	public static int nod(int a, int b, int c) {
		int nod = 1;
		int min;
		int i;

		if ((a <= b) && (a <= c)) {
			min = a;
		} else {
			if (b <= c) {
				min = b;
			} else {
				min = c;
			}

		}

		for (i = min; i >= 1; i--)

		{
			if ((a % i == 0) && (b % i == 0) && (c % i == 0)) {
				nod = i;
				break;
			}
		}

		return nod;
	}

	public static void print(int nod) {
		if (nod == 1) {
			System.out.println("Числа взаимно простые");
		} else {
			System.out.println("Числа не взаимно простые");
		}
	}

}
