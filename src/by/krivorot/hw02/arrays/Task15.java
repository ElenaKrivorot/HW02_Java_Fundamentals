package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task15 {
	/*
	 * Дана последовательность действительных чисел a1 a2 ... an. Указать те ее
	 * элементы, которые принадлежат отрезку [с, d].
	 */

	public static void main(String[] args) {
		int c = 10;
		int d = 30;
		int[] mas = new int[20];

		init(mas, 50);
		printMas(mas);

		int[] newmas = new int[countLength(c, d, mas)];
		initNewMas(c, d, mas, newmas);
		printMas(newmas);
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}

	public static int countLength(int c, int d, int[] mas) {
		int i;
		int length = 0;

		for (i = 0; i < mas.length; i++) {
			if (mas[i] >= c && mas[i] <= d) {
				length++;
			}
		}
		return length;
	}

	public static void initNewMas(int c, int d, int[] mas, int[] newmas) {
		int i;
		int j = 0;

		for (i = 0; i < mas.length; i++) {
			if (mas[i] >= c && mas[i] <= d) {
				newmas[j] = mas[i];
				j++;
			}
		}
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

}
