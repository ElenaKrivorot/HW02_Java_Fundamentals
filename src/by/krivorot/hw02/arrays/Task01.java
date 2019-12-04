package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task01 {
	/*
	 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые
	 * кратны данному К.
	 */

	public static void main(String[] args) {

		int[] a = new int[50];
		int k;

		init(a, 100);
		k = randomValue(10);

		printMas(a);
		printValue("Сумма элементов кратных ", k);
		printValue("равна ", countSum(a, k));
	}

	public static int randomValue(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit) + 1;
	}

	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}

	public static int countSum(int[] mas, int k) {
		int i;
		int sum = 0;

		for (i = 0; i < mas.length; i++) {
			if (mas[i] % k == 0) {
				sum = sum + mas[i];
			}
		}
		return sum;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

	public static void printValue(String mes, int value) {
		System.out.println(mes + value);
	}

}
