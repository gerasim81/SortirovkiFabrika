package pizza.simplefactory;

import java.util.Random;

public class SortirovkiMain {
	public static void main(String[] args) {
		SortirovkaWays sort1 = new SortirovkaWayOne();
		SortirovkaWays sort2 = new SortirovkaWayTwo();

		FillArray array = new FillArray();

		final Random random = new Random();
		int razmer = random.nextInt(100);//izmenyaem razmer massiva

		int [] array1 = new int[razmer];

		array.randomFill(array1, 1234567890);

		System.out.println("Исходный массив: ");
		array.arrayShow(array1);

		Sortirovka sortirovka = sort1.makeSort("sort1Type");
		sortirovka.sortirovka(array1);

		array.arrayShow(array1);
		System.out.println();
		//--------------------------------------------------

		array.randomFill(array1, 1234567890);

		System.out.println("Исходный массив: ");
		array.arrayShow(array1);

		sortirovka = sort1.makeSort("sort2Type");
		sortirovka.sortirovka(array1);

		array.arrayShow(array1);
		System.out.println();
		//--------------------------------------------------

		array.randomFill(array1, 1234567890);

		System.out.println("Исходный массив: ");
		array.arrayShow(array1);

		sortirovka = sort2.makeSort("sort2Type");
		sortirovka.sortirovka(array1);

		array.arrayShow(array1);
		System.out.println();
		//--------------------------------------------------

		array.randomFill(array1, 1234567890);

		System.out.println("Исходный массив: ");
		array.arrayShow(array1);

		sortirovka = sort2.makeSort("sort1Type");
		sortirovka.sortirovka(array1);

		array.arrayShow(array1);		
		System.out.println();
	}
}
