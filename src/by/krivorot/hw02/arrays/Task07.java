package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task07 {
	/*
	 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее
	 * члены, большие данного Z, этим числом. Подсчитать количество замен.
	 */

	public static void main(String[] args) {
		int z = 25;
		int[] mas = new int[25];

		init(mas, 50);
		printMas(mas);
		print(countChanges(mas, z));

		mas = changeElements(mas, z);
		printMas(mas);

	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}

	public static int countChanges(int[] mas, int z) {
		int i;
		int number = 0;

		for (i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				number++;
			}
		}
		return number;
	}

	public static int[] changeElements(int[] mas, int z) {
		int i;

		for (i = 0; i < mas.length; i++) {
			if (mas[i] > z) {
				mas[i] = z;
			}
		}
		return mas;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

	public static void print(int number) {
		System.out.println("Количество замен " + number);
	}

}
