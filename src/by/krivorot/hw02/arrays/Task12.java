package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task12 {
	/*
	 * Задана последовательность N вещественных чисел. Вычислить сумму чисел,
	 * порядковые номера которых являются простыми числами.
	 */

	public static void main(String[] args) {
		double[] mas = new double[10];

		init(mas);
		printMas(mas);

		print(countSum(mas));

	}

	public static void init(double[] mas) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextDouble() * 100;
		}
	}

	public static boolean isSimple(int x) {
		int i;
		int del = 1;

		for (i = x - 1; i >= 1; i--) {
			if (x % i == 0) {
				del = i;
				break;
			}
		}
		if (del == 1)
			return true;
		else
			return false;
	}

	public static double countSum(double[] mas) {
		int i;
		double sum = 0;

		for (i = 1; i < mas.length; i++) {
			if (isSimple(i + 1)) {
				sum = sum + mas[i];
			}
		}
		return sum;
	}

	public static void printMas(double[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%6.2f", mas[i]);
		}
		System.out.println();
	}

	public static void print(double sum) {
		System.out.printf("Сумма равна %6.2f", sum);
	}

}
