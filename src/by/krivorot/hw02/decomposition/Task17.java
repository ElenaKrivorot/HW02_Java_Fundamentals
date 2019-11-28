package by.krivorot.hw02.decomposition;

import java.util.Random;

public class Task17 {
	/*
	 * Натуральное число, в записи которого n цифр, называется числом Армстронга,
	 * если сумма его цифр, возведенная в степень n, равна самому числу. Найти все
	 * числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
	 */

	public static void main(String[] args) {
		int k;

		k = randomValue(100000);

		printMas(createMasOfArmstrongs(k));
	}

	public static int randomValue(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit) + 10;
	}

	public static int countNumerals(int k) {
		int x = 1;

		while (k / 10 != 0) {
			x++;
			k = k / 10;
		}
		return x;
	}

	public static int sumOfNumerals(int k, int exp) {
		int sum = 0;

		while (k / 10 != 0) {
			sum = (int) (sum + Math.pow(k % 10, exp));
			k = k / 10;
		}
		sum = (int) (sum + Math.pow(k, exp));
		return sum;
	}

	public static boolean isArmstrong(int k) {
		int exp;
		int sum;

		exp = countNumerals(k);
		sum = sumOfNumerals(k, exp);
		if (sum == k)
			return true;
		else
			return false;
	}

	public static int[] createMasOfArmstrongs(int k) {
		int i;
		int j = 0;
		int[] mas = new int[5 + k / 10];

		for (i = 1; i < k; i++) {
			if (isArmstrong(i)) {
				mas[j] = i;
				j++;
			}
		}
		return mas;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; mas[i] > 0; i++) {
			System.out.print(mas[i] + ", ");
		}

	}

}
