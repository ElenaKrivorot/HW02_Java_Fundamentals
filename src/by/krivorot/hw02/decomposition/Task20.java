package by.krivorot.hw02.decomposition;

import java.util.Random;

public class Task20 {
	/*
	 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр
         * и т.д. * Сколько таких действий надо произвести, чтобы получился нуль? Для решения
         * задачи использовать декомпозицию.
	 */

	public static void main(String[] args) {
		int n;
		int number;

		n = randomValue(100);
		number = countNumberOfIterations(n);
		printNumberOfIterations(n, number);
	}

	public static int randomValue(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static int sumOfNumerals(int x) {
		int sum = 0;

		while (x / 10 != 0) {
			sum = sum + x % 10;
			x = x / 10;
		}
		sum = sum + x;
		return sum;
	}

	public static int countNumberOfIterations(int n) {
		int number = 0;

		while (n > 0) {
			number++;
			n = n - sumOfNumerals(n);
		}
		return number;
	}

	public static void printNumberOfIterations(int n, int number) {
		System.out.println(n + "; " + number);
	}

}
