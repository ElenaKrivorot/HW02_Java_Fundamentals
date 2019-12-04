package by.krivorot.hw02.arrays;

public class Task03 {
	/*
	 * Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число
	 * встречается раньше - положительное или отрицательное.
	 */

	public static void main(String[] args) {

		int[] a = new int[] { 0, 2, 4, -4 };

		print(isPositive(a));
	}

	public static boolean isPositive(int[] mas) {
		int i = 0;

		while (mas[i] == 0) {
			i++;
		}
		if (mas[i] > 0)
			return true;
		else
			return false;
	}

	public static void print(boolean b) {
		if (b) {
			System.out.println("Положительное число встречается раньше");
		} else {
			System.out.println("Отрицательное число встречается раньше");
		}
	}

}
