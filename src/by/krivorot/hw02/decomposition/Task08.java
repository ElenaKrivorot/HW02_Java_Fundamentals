package by.krivorot.hw02.decomposition;

import java.util.Random;

public class Task08 {
	/*
	 * Составить программу, которая в массиве A[N] находит второе по величине число
	 * (вывести на печать число, которое меньше максимального элемента массива, но
	 * больше всех других элементов).
	 */

	public static void main(String[] args) {
		int n;
		int i;
		boolean d;

		do {
			n = randomValue(15);
			d = check(n);
		} while (!d);

		int[] mas = new int[n];

		init(mas);

		i = indexSecondMax(mas);

		printMas(mas);
		print(mas[i]);

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

	public static int indexSecondMax(int[] mas) {
		int indexmax;
		int k;
		int indexsecondmax;

		int[] mas1 = mas.clone();
		indexmax = max(0, mas1);
		k = mas1[0];
		mas1[0] = mas1[indexmax];
		mas1[indexmax] = k;
		indexsecondmax = max(1, mas1);

		return indexsecondmax;
	}

	public static int max(int q, int[] mas1) {
		int indexmax = 0;
		int max = 0;
		int i;

		for (i = q; i < mas1.length; i++) {
			if (mas1[i] > max) {
				indexmax = i;
				max = mas1[i];
			}
		}
		return indexmax;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

	public static void print(int smax) {
		System.out.println("Второй по величине элемент массива: " + smax);

	}
}
