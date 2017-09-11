package insertsort;

import java.util.Random;

public class InsertSort {

	public static void main(String[] args) {
		int[] arrA = createArr();
		printArr(arrA);
		insertSort(arrA);
		printArr(arrA);

	}

	private static void insertSort(int[] arrA) {
		for (int i = 1; i < arrA.length; i++) {
			int temp = arrA[i];
			int j = i - 1;
			while (j >= 0 &&  temp < arrA[j]) {
				arrA[j + 1] = arrA[j];
				j--;
			}
			arrA[j + 1] = temp;
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
