package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task13 {
	/*
	 * Определить количество элементов последовательности натуральных чисел, кратных
	 * числу М и заключенных в промежутке от L до N.
	 */

	public static void main(String[] args) {
		int m = 4;
		int l = 10;
		int n = 50;
		int[] mas = new int[20];

		init(mas, 100);
		printMas(mas);
				
		print(countElements(m, l, n, mas));
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit) + 1;
		}
	}

	public static int countElements(int m, int l, int n, int[] mas) {
		int i;
		int number = 0;

		for (i = 0; i < mas.length; i++) {
			if (mas[i] >= l && mas[i] <= n && mas[i] % m == 0) {
				number++;
			}
		}
		return number;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

	public static void print(int number) {
		System.out.println(number);
	}

}
