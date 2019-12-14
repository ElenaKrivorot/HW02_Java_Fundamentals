package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task20 {
	/*
	 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из
	 * него каждый второй элемент (освободившиеся элементы заполнить нулями).
	 * Примечание. Дополнительный массив не использовать.
	 */

	public static void main(String[] args) {
		int[] mas = new int[20];

		init(mas, 100);
		printMas(mas);
		deleteEverySecondItem(mas);
		printMas(mas);

	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit) + 1;
		}
	}

	public static void deleteEverySecondItem(int[] mas) {
		int i;
		int j = 1;

		for (i = 2; i < mas.length; i = i + 2) {
			mas[j] = mas[i];
			j++;
		}
		for (i = j; i < mas.length; i++) {
			mas[i] = 0;
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
