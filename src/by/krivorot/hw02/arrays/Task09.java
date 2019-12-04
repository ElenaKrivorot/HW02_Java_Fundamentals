package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task09 {
	/*
	 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
	 * наименьший элементы.
	 */

	public static void main(String[] args) {
		int temp;
		int[] mas = new int[20];

		init(mas, 100);
		printMas(mas);

		temp = mas[findMax(mas)];
		mas[findMax(mas)] = mas[findMin(mas)];
		mas[findMin(mas)] = temp;
		printMas(mas);
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
		int index = 0;
		int max = mas[0];

		for (i = 1; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
				index = i;
			}
		}
		return index;
	}

	public static int findMin(int[] mas) {
		int i;
		int index = 0;
		int min = mas[0];

		for (i = 1; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
				index = i;
			}
		}
		return index;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

}
