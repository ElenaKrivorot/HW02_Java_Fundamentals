package by.krivorot.hw02.arrays;

public class Task04 {
	/*
	 * Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет
	 * ли она возрастающей.
	 */

	public static void main(String[] args) {
		int[] mas = new int[] { 0, 2, 0, 6, 12, 44 };

		printMas(mas);
		print(isIncreasing(mas));
	}

	public static boolean isIncreasing(int[] mas) {
		int i;

		for (i = 0; i < mas.length - 1; i++) {
			if (mas[i + 1] <= mas[i]) {
				return false;
			}
		}
		return true;

	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

	public static void print(boolean b) {
		if (b) {
			System.out.println("Последовательность является возрастающей");
		} else {
			System.out.println("Последовательность не является возрастающей");
		}
	}

}
