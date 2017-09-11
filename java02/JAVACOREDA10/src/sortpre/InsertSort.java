package sortpre;

import java.util.Random;

public class InsertSort {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] A = new int[10];
		for (int i = 0; i < A.length; i++) {
			A[i] = rd.nextInt(99);
		}

		for (int i : A) {
			System.out.print(i + " ");
		}

		System.out.println("\n-------------");
		for (int i = 1; i < A.length; i++) {
			int temp = A[i]; // lấy phần tử ra để so sánh. Bắt đầu với phần tử
								// thứ 1
			int j = i - 1;
			while (j >= 0 && temp < A[j]) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = temp;
		}

		for (int i : A) {
			System.out.print(i + " ");
		}

		System.out.println("\n-------------");
		for (int i = 1; i < A.length; i++) {
			int temp = A[i]; // lấy phần tử ra để so sánh. Bắt đầu với phần tử
			// thứ 1
			int j = i - 1;
			while (j >= 0 && temp > A[j]) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = temp;
		}

		for (int i : A) {
			System.out.print(i + " ");
		}
	}

}
