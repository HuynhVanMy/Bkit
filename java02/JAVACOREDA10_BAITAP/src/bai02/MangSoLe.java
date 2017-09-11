package bai02;

import java.util.Random;

public class MangSoLe {

	public static void main(String[] args) {
		MangSoLe item = new MangSoLe();
		int[] arrA = item.createArray();
		item.printArr(arrA);
		arrA = item.insertSort(arrA);
		System.out.println("\n------------------");
		item.printArr(arrA);

	}

	// sắp xếp mảng
	public int[] insertSort(int[] arrA) {
		for (int i = 0; i < arrA.length; i++) {
			int temp = arrA[i];
			int j = i - 1;
			while (j >= 0 && arrA[j] > temp) {
				arrA[j + 1] = arrA[j];
				j--;
			}
			arrA[j + 1] = temp;
		}
		return arrA;
	}

	// in ra mảng
	public void printArr(int[] arrA) {
		for (int i = 0; i < arrA.length; i++) {
			System.out.print(arrA[i] + " ");
		}
	}

	// tạo mảng ngẫu nhiên
	public int[] createArray() {
		int[] arrA = new int[10];
		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = checkElementArray(arrA, i);
		}
		return arrA;
	}

	// kiểm tra phần tử mảng
	public int checkElementArray(int[] arrA, int j) {
		int temp = 0;
		boolean flag = true;
		do {
			temp = new Random().nextInt(99);
			flag = false;
			if (temp % 2 == 0) {
				flag = true;
			} else {
				for (int i = 0; i < arrA.length; i++) {
					if (temp == arrA[i]) {
						flag = true;
					}
				}

			}
		} while (flag);
		return temp;
	}

}
