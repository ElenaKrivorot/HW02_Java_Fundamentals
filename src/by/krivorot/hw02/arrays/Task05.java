package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task05 {
	/*
	 * Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из
	 * четных чисел этой последовательности. Если таких чисел нет, то вывести
	 * сообщение об этом факте.
	 */

	public static void main(String[] args) {
		int quantity;
		int[] mas = new int[20];

		init(mas, 100);
		quantity = countEvenElements(mas);
		int[] even = new int[quantity];
		initWithEven(mas, even);

		printMas(mas);
		printMas(even);
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}

	public static int countEvenElements(int[] mas) {
		int i;
		int quantity = 0;

		for (i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				quantity++;
			}
		}
		return quantity;
	}

	public static void initWithEven(int[] mas1, int[] mas2) {
		int i;
		int j = 0;

		for (i = 0; i < mas1.length; i++) {
			if (mas1[i] % 2 == 0) {
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
