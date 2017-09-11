package bai06;

import java.util.Random;
import java.util.Scanner;

public class YenNgua {

	// hàm kiểm tra nhập
	public int checkData(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
				if (n < 1 || n > 99) {
					System.out.println("Nhập lại số khác.");
					check = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("Không đc nhập bậy !!!");
				check = true;
			}
		} while (check);

		return n;
	}

	// hàm nhập
	public int[][] inputData(int[][] A) {
		Random random = new Random();
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				// A[i][j] = checkData("phần tử A[" + i + "][" + j + "]");
				A[i][j] = random.nextInt(98) + 1;
			}
		}
		return A;
	}

	// hàm xuất
	public void output(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	// kiểm tra yên ngựa
	public void kiemTra(int[][] A) {
		int c = 0; // stt của hàng
		int d = 0; // stt của cột
		int count = 0;
		do {
			int[] C = new int[A.length]; // lưu số phần tử trong hàng
			int[] D = new int[A[1].length]; // lưu số phần tử trong cột

			/*
			 * vì mảng có m hàng và n cột nên hàng sẽ có n phần tử và cột có n
			 * phần tử
			 */

			// lưu phần tử trong hàng vào mảng
			for (int j = 0; j < A[1].length; j++) {
				C[j] = A[c][j];
			}
			// lưu phần tử trong cột vào mảng
			for (int i = 0; i < A.length; i++) {
				D[i] = A[i][d];
			}

			int minC = min(C);
			int maxD = max(D);

			if (minC == maxD) {
				System.out.println("I'm here !!!  " + minC);
				count++;
			}
			/*
			 * sau mỗi lần nạp phần tử và kiểm tra thì tăng c, d lên để kt hàng
			 * khác và cột khác
			 */
			c++;
			d++;
		} while (c < A.length && d < A[1].length);
		if (count == 0) {
			System.out.println("không có phần tử yên ngựa !!!");
		}
	}

	// tìm max trong cột
	public int max(int[] b) {
		int max = b[0];
		for (int i = 0; i < b.length; i++) {
			if (b[i] > max) {
				max = b[i];
			}
		}
		return max;
	}

	// tìm min trong hàng
	public int min(int[] b) {
		int min = b[0];
		for (int i = 0; i < b.length; i++) {
			if (b[i] < min) {
				min = b[i];
			}
		}
		return min;
	}

}
