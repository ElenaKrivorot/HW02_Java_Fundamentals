package by.krivorot.hw02.decomposition;

public class Task15 {
	/*
	 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
	 * элементами которого являются числа, сумма цифр которых равна К и которые не
	 * большее N.
	 */

	public static void main(String[] args) {
		int k = 12;
		int n = 100;
		int[] mas;

		mas = fillMas(k, n);
		printMas(mas);

	}

	public static int countSumOfNumerals(int x) {
		int sum = 0;

		while (x / 10 != 0) {
			sum = sum + x % 10;
			x = x / 10;
		}
		sum = sum + x;
		return sum;
	}

	public static int countAmountOfElements(int k, int n) {
		int q = 0;
		int i;
		int temp;

		for (i = 1; i <= n; i++) {
			temp = countSumOfNumerals(i);
			if (temp == k) {
				q = q + 1;
			}
		}
		return q;
	}

	public static int[] fillMas(int k, int n) {
		int[] mas = new int[countAmountOfElements(k, n)];
		int temp;
		int i;
		int j = 0;

		for (i = 1; i <= n; i++) {
			temp = countSumOfNumerals(i);
			if (temp == k) {
				mas[j] = i;
				j++;
			}
		}
		return mas;
	}

	public static void printMas(int[] mas) {
		System.out.print("[");
		for (int x : mas) {
			System.out.print(x + ", ");
		}
		System.out.print("]");
	}

}
