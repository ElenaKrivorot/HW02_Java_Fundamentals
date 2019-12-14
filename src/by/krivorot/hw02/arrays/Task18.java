package by.krivorot.hw02.arrays;

public class Task18 {
	/*
	 * «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад
	 * ячеек, в которые надо вставить игральные кубики. Но дверь открывается только
	 * в том случае, когда в любых трех соседних ячейках сумма точек на передних
	 * гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6
	 * точек). Напишите программу, которая разгадывает код замка при условии, что
	 * два кубика уже вставлены в ячейки.
	 */

	public static void main(String[] args) {

		int[] mas = new int[10];

		mas[0] = 5;
		mas[1] = 3;
		init(mas);
		printMas(mas);

	}

	public static void init(int[] mas) {
		int i;

		for (i = 2; i < mas.length; i++) {
			mas[i] = 10 - mas[i - 1] - mas[i - 2];
		}

	}

	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%3d", mas[i]);
		}
		System.out.println();
	}

}
