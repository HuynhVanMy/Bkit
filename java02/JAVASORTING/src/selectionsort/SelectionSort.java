package selectionsort;

import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arrA = createArr();
		printArr(arrA);
		selectionSort(arrA);
		printArr(arrA);
	}

	private static void selectionSort(int[] arrA) {
		for (int i = 0; i < arrA.length; i++) {
			int min = arrA[i];
			for (int j = i + 1; j < arrA.length; j++) {
				if (min > arrA[j]) {
					min = arrA[j];
					int temp = arrA[i];
					arrA[i] = arrA[j];
					arrA[j] = temp;
				}
			}
		}
	}

	private static int[] createArr() {
		int[] A = new int[10];
		for (int i = 0; i < A.length; i++) {
			A[i] = new Random().nextInt(99);
		}
		return A;
	}

	private static void printArr(int[] arrA) {
		for (int i = 0; i < arrA.length; i++) {
			System.out.print(arrA[i] + " ");
		}
		System.out.println();
	}

}
