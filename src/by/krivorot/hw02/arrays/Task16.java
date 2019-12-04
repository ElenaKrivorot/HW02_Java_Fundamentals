package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task16 {
	/*
	 * Даны действительные числа a1 a2 ... a2n. Найти max(a1 + a2n, a2 + a2n−1, ...
	 * ,an + an+1)
	 */

	public static void main(String[] args) {
		int[] mas = new int[20];

		init(mas, 50);
		printMas(mas);

		int[] newmas = new int[10];
		initNewMas(mas, newmas);
		print(findMax(newmas));

	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}

	public static void initNewMas(int[] mas, int[] newmas) {
		int i;
		int j = mas.length - 1;
		int k = 0;

		for (i = 0; i < mas.length / 2; i++) {
			newmas[k] = mas[i] + mas[j];
			j--;
			k++;
		}
	}

	public static int findMax(int[] mas) {
		int i;
		int max = mas[0];

		for (i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		return max;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

	public static void print(int max) {
		System.out.println(max);
	}
}
