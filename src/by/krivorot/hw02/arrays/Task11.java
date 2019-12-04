package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task11 {
	/*
	 * Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток
	 * от деления на М равен L (0 < L < М-1).
	 */

	public static void main(String[] args) {
		double m = 5;
		int[] mas = new int[30];

		init(mas, 100);
		int[] newmas = new int[30];
		initNewMas(mas, newmas, m);

		printMas1(mas);
		printMas2(newmas);
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit) + 1;
		}
	}

	public static void initNewMas(int[] mas1, int[] mas2, double m) {
		int i;
		int j = 0;

		for (i = 0; i < mas1.length; i++) {
			if (mas1[i] % m > 0 && mas1[i] % m < m - 1) {
				mas2[j] = mas1[i];
				j++;
			}
		}
	}

	public static void printMas1(int[] mas) {
		int i = 0;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

	public static void printMas2(int[] mas) {
		int i = 0;

		while (mas[i] != 0) {
			System.out.printf("%5d", mas[i]);
			i++;
		}
		System.out.println();
	}

}
