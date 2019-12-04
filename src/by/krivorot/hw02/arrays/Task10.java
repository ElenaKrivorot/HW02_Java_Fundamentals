package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task10 {
	/*
	 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
	 * которых аi > i.
	 */

	public static void main(String[] args) {
		int[] mas = new int[20];

		init(mas, 20);
		int[] newmas = new int[countLengthNewMas(mas)];
		initNewMas(mas, newmas);

		printMas(mas);
		printMas(newmas);
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}

	public static int countLengthNewMas(int[] mas) {
		int i;
		int number = 0;

		for (i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				number++;
			}
		}
		return number;
	}

	public static void initNewMas(int[] mas1, int[] mas2) {
		int i;
		int j = 0;

		for (i = 0; i < mas1.length; i++) {
			if (mas1[i] > i) {
				mas2[j] = mas1[i];
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
