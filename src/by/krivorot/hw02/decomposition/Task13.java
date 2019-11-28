package by.krivorot.hw02.decomposition;

import java.util.Random;

public class Task13 {
	/*
	 * Дано натуральное число N. Написать метод(методы) для формирования массива,
	 * элементами которого являются цифры числа N.
	 */

	public static void main(String[] args) {
		int n;

		n = randomValue(999999999);
		int[] mas = new int[countNumerals(n)];
		fillMas(n, mas);
		printMas(n, mas);

	}

	public static int randomValue(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit) + 1;
	}

	public static int countNumerals(int n) {
		int x = 1;

		while (n / 10 != 0) {
			x++;
			n = n / 10;
		}
		return x;
	}

	public static void fillMas(int n, int[] mas) {
		int i;

		for (i = mas.length - 1; i > 0; i--) {
			mas[i] = n % 10;
			n = n / 10;
		}
		mas[0] = n;
	}

	public static void printMas(int n, int[] mas) {
		System.out.println("Массив цифр числа " + n + " выглядит следующим образом:");
		System.out.print("[");
		for (int x : mas) {
			System.out.print(x + ", ");
		}
		System.out.print("]");
	}
}
