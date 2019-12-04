package by.krivorot.hw02.arrays;

import java.util.Random;

public class Task02 {
	/*
	 * В целочисленной последовательности есть нулевые элементы. Создать массив из
	 * номеров этих элементов.
	 */

	public static void main(String[] args) {
		int quantity;
		
		int[] a = new int[50];
		init(a, 20);
		quantity = countZeroElements(a);
		int[] index = new int[quantity];
		initWithIndexes(a, index);
		
		printMas(a);
		printMas(index);
	}
	
	public static void init(int[] mas, int limit) {
		int i;

		Random rand = new Random();
		for (i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(limit);
		}
	}
	
	public static int countZeroElements(int[] mas) {
		int i;
		int quantity = 0;
		
		for (i = 0; i < mas.length; i++) {
			if(mas[i] == 0) {
				quantity++;
			}
		}
		return quantity;
	}
	
	public static void initWithIndexes(int[] mas1, int[] mas2) {
		int i;
		int j = 0;
		
		for (i = 0; i < mas1.length; i++) {
			if(mas1[i] == 0) {
				mas2[j] = i;
				j++;
			}
		}		
	}
	
	public static void printMas(int[] mas) {
		int i;

		for (i = 0; i < mas.length; i++) {
			System.out.printf("%5d", mas[i]);
		}
		System.out.println();
	}

}
