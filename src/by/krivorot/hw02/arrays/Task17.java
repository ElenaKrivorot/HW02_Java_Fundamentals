package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task17 {
	/*
	 * Дана последовательность целых чисел a1, a2, ..., an. Образовать новую
	 * последовательность, выбросив из исходной те члены, которые равны min(a1, a2,
	 * ..., an).
	 */

	public static void main(String[] args) {
		int[] mas = new int[20];

		init(mas, 10);
		printMas(mas);

		int[] newmas = new int[20 - countMinElements(mas)];
		initNewMas(mas, newmas);
		printMas(newmas);
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}

	public static int findMin(int[] mas) {
		int i;
		int min = mas[0];

		for (i = 1; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		return min;
	}

	public static int countMinElements(int[] mas) {
		int i;
		int count = 0;
		int min;

		min = findMin(mas);
		for (i = 1; i < mas.length; i++) {
			if (mas[i] == min) {
				count++;
			}
		}
		return count;
	}

	public static void initNewMas(int[] mas, int[] newmas) {
		int i;
		int j = 0;
		int min = findMin(mas);

		for (i = 0; i < mas.length; i++) {
			if (mas[i] != min) {
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
