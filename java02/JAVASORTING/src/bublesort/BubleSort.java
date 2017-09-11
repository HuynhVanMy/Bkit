package bublesort;

import java.util.Random;

public class BubleSort {

	public static void main(String[] args) {
		int[] A = createArr();
		printArr(A);
		bublesort(A);
		System.out.println("-------------------");
		printArr(A);
	}

	private static int[] createArr() {
		int[] A = new int[10];
		for (int i = 0; i < A.length; i++) {
			A[i] = new Random().nextInt(99);
		}
		return A;
	}

	private static void bublesort(int[] A) {
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] > A[i + 1]) {
					int temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
					flag = true;
				}
			}
		}
	}

	private static void printArr(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}

}
