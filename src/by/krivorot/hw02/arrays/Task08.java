package by.krivorot.hw02.arrays;

public class Task08 {
	/*
	 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
	 * в нем отрицательных, положительных и нулевых элементов.
	 */

	public static void main(String[] args) {
		int[] mas = new int[] { 0, 2, 0, -6, 12, -44, 29, -7 };

		printMas(mas);
		print(countPositiveNegativeZeroElements(mas));

	}

	public static int[] countPositiveNegativeZeroElements(int[] mas) {
		int zero = 0;
		int pos = 0;
		int neg = 0;
		int i;

		for (i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				pos++;
			} else if (mas[i] < 0) {
				neg++;
			} else {
				zero++;
			}
		}
		int[] count = new int[] { zero, pos, neg };
		return count;
	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

	public static void print(int[] mas) {
		System.out.println("нулевых элементов " + mas[0]);
		System.out.println("положительных элементов " + mas[1]);
		System.out.println("отрицательных элементов " + mas[2]);
	}

}
