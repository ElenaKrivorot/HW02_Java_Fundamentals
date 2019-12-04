package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task06 {
	/*
	 * Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину
	 * числовой оси, содержащую все эти числа.
	 */

	public static void main(String[] args) {
		int[] mas = new int[20];

		init(mas, 100);
		printMas(mas);
		print(findMax(mas));
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
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
		System.out.println("Наименьшая длина числовой оси " + max);
	}

}
