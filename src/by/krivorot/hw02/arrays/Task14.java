package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task14 {
	/*
	 * Дан одномерный массив A[N]. Найти: max( четные эл-ты ) + min( нечетные эл-ты
	 * )
	 */

	public static void main(String[] args) {
		int max;
		int min;
		int[] mas = new int[20];

		init(mas, 100);
		printMas(mas);

		max = findMax(mas);
		min = findMin(mas);

		print(max + min);
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit) + 1;
		}
	}

	public static int findMax(int[] mas) {
		int i;
		int max = mas[1];

		for (i = 3; i < mas.length; i = i + 2) {
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		return max;
	}

	public static int findMin(int[] mas) {
		int i;
		int min = mas[0];

		for (i = 2; i < mas.length; i = i + 2) {
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		return min;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

	public static void print(int sum) {
		System.out.println(sum);
	}

}
