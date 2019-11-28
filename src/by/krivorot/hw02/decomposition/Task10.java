package by.krivorot.hw02.decomposition;

public class Task10 {
	/*
	 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел
	 * от 1 до 9.
	 */
	public static void main(String[] args) {
		int sum;

		sum = sumFactorial();
		print(sum);

	}

	public static int sumFactorial() {
		int sumfactorial = 0;
		int i;

		for (i = 1; i <= 9; i = i + 2) {
			sumfactorial = sumfactorial + factorial(i);
		}
		return sumfactorial;
	}

	public static int factorial(int a) {
		int i;
		int factorial = 1;

		for (i = 1; i <= a; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static void print(int sum) {

		System.out.println("Сумма факториалов нечетных чисел от 1 до 9 равна: " + sum);

	}

}
