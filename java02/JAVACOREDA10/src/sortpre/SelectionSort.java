package sortpre;

import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {

		Random rd = new Random();
		int[] A = new int[10];
		for (int i = 0; i < A.length; i++) {
			A[i] = rd.nextInt(99);
		}
		for (int i : A) {
			System.out.print(i + " ");
		}

		System.out.println("\n--------------");

		for (int i = 0; i < A.length; i++) {
			int min = A[i];
			for (int j = i + 1; j < A.length; j++) {
				if (min > A[j]) {
					min = A[j];
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
		for (int i : A) {
			System.out.print(i + " ");
		}

	}

}
