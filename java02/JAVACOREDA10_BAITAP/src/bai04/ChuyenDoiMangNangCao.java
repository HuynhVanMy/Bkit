package bai04;

import java.util.Random;

public class ChuyenDoiMangNangCao {

	public static void main(String[] args) {
		ChuyenDoiMangNangCao item = new ChuyenDoiMangNangCao();
		int[][] arrA = item.createArr();
		item.printArr(arrA);
		arrA = item.chuyenDoi(arrA);
		System.out.println("-------");
		item.printArr(arrA);

	}

	// chuyển đổi
	public int[][] chuyenDoi(int[][] arrA) {
		int[][] newarrA = new int[arrA.length][arrA[0].length];
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrA[0].length; j++) {
				newarrA[i][j] = arrA[i][j];
			}
		}

		for (int i = 0; i < arrA.length - 1; i++) {
			for (int j = 0; j < arrA[0].length - 1; j++) {
				if (arrA[i][j] == 0 && arrA[i + 1][j + 1] == 0) {
					for (int m = 0; m < newarrA.length; m++) {
						for (int n = 0; n < newarrA[0].length; n++) {
							newarrA[i][n] = 0;
							newarrA[i + 1][n] = 0;
						}
						newarrA[m][j] = 0;
						newarrA[m][j + 1] = 0;
					}
				}
			}
		}

		return newarrA;
	}

	// in ra mảng
	public void printArr(int[][] arrA) {
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrA[0].length; j++) {
				System.out.print(arrA[i][j] + " ");
			}
			System.out.println();
		}
	}

	// tạo mảng
	public int[][] createArr() {
		int[][] arrA = new int[5][4];
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrA[0].length; j++) {
				arrA[i][j] = new Random().nextInt(8) + 1;
			}
		}
		arrA[1][1] = 0;
		arrA[2][2] = 0;
		return arrA;
	}

}
