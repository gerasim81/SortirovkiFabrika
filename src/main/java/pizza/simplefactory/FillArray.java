package pizza.simplefactory;

import java.util.Random;

public class FillArray {
	public int[] randomFill(int[] arrayToFill, long digit) {
		final Random random = new Random();
		if (digit == 0) return arrayToFill;
		for (int i =0; i < arrayToFill.length;i++){
			arrayToFill[i]= random.nextInt(999);
		}
		return arrayToFill;
	}

	public void arrayShow(int[] arrayToShow){
		for (int i = 0; i < arrayToShow.length;i++){
			System.out.print(arrayToShow[i] + " ");
		}
		System.out.println();
	}
}
