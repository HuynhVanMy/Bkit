package bai03;

import java.util.Random;

public class ChuyenDoiMang {

	public static void main(String[] args) {
		ChuyenDoiMang item = new ChuyenDoiMang();
		int[][] A = item.createArr();
		item.printArr(A);
		A = item.chuyenDoi(A);
		System.out.println("-------");
		item.printArr(A);
	}

	// chuyển đổi
	public int[][] chuyenDoi(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				if (A[i][j] == 0) {
					for (int m = 0; m < A.length; m++) {
						A[m][j] = 0;
					}
					for (int n = 0; n < A[0].length; n++) {
						A[i][n] = 0;
					}
					//j = A[i].length;
					//i = A.length;
					 break;
				}
			}
		}
		return A;
	}

	// in ra mảng
	public void printArr(int[][] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
	}

	// tạo mảng
	public int[][] createArr() {
		int[][] A = new int[5][4];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				A[i][j] = new Random().nextInt(8) + 1;
			}
		}
		A[new Random().nextInt(A.length)][new Random().nextInt(A[0].length)] = 0;

		return A;
	}

}
