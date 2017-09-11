package sortpre;

import java.util.Random;

public class BubleSort {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] A = new int[10];
		for (int i = 0; i < A.length; i++) {
			A[i] = rd.nextInt(99);
		}

		for (int i : A) {
			System.out.print(i + " ");
		}
		System.out.println("\n----------TĂNG DẦN-----------");
		for (int j = 0; j < A.length; j++) {
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] > A[i + 1]) {
					int temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
				}
				System.out.print(A[i] + " ");
				if (i == A.length - 2) {
					System.out.print(A[i + 1]);
				}
			}
			System.out.println("---");
		}
		System.out.println("\n---------------------");
		for (int i : A) {
			System.out.print(i + " ");
		}

		System.out.println("\n-----------GIẢM DẦN-------------");
		for (int j = 0; j < A.length; j++) {
			for (int i = 0; i < A.length - 1; i++) {
				if (A[i] < A[i + 1]) {
					int temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
				}
			}
		}

		for (int i : A) {
			System.out.print(i + " ");
		}
	}
}
