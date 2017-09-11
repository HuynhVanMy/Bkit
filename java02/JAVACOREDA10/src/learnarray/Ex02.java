package learnarray;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {

		Ex02 item = new Ex02();
		int[] arrA = item.createArr();
		item.printArray(arrA);
		System.out.println("\n------------------------");
		arrA = item.sortArr(arrA);
		item.printArray(arrA);

	}

	public int[] createArr() {
		int[] arrA = new int[5];
		Random random = new Random();
		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = random.nextInt(90) + 10;
		}
		return arrA;
	}

	public int[] sortArr(int[] arrA) {
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrA.length - 1; j++) {
				if (arrA[j] > arrA[j + 1]) {
					int temp = arrA[j];
					arrA[j] = arrA[j + 1];
					arrA[j + 1] = temp;
				}
			}
		}
		return arrA;
	}

	// sắp xếp nổi bột
	public void printArray(int[] arrA) {
		for (int i = 0; i < arrA.length; i++) {
			System.out.print(arrA[i] + " ");
		}
	}

}
