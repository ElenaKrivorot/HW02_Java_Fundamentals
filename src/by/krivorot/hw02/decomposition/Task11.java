package by.krivorot.hw02.decomposition;

import java.util.Random;

public class Task11 {
	/*
	 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] +
	 * D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для вычисления
	 * суммы трех последовательно расположенных элементов массива с номерами от k до
	 * m.
	 */

	public static void main(String[] args) {
		int n;
		int sum1;
		int sum2;
		int sum3;
		boolean d;

		do {
			n = 6 + randomValue(10);
			d = check(n);
		} while (!d);

		int[] masD = new int[n];

		init(masD);

		sum1 = sum3(masD, 1);
		sum2 = sum3(masD, 3);
		sum3 = sum3(masD, 4);

		printMas(masD);
		print(1, sum1);
		print(3, sum2);
		print(4, sum3);

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

	public static void init(int[] mas) {
		int i;
		for (i = 0; i < mas.length; i++) {
			mas[i] = randomValue(20);
		}
	}

	public static int sum3(int[] mas, int i) {
		int sum;

		sum = mas[i] + mas[i + 1] + mas[i + 2];
		return sum;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

	public static void print(int i, int sum) {
		System.out.println(
				"Сумма трех последовательно расположенных элементов массива, начиная с  " + (i + 1) + " равна " + sum);

	}

}
