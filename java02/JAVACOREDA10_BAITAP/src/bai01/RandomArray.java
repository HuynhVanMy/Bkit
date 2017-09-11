package bai01;

import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		RandomArray item = new RandomArray();
		int[] arrA = item.createArr();
		item.printArr(arrA);
		item.compare(arrA);
		arrA = item.insertSorted(arrA);
		item.printArr(arrA);
		System.out.println("\nSố lớn nhất thứ 3 trong dãy là: " + item.max3th(arrA));
		System.out.println("Có " + item.count(arrA) + " số đồng thời chia hết cho 3 và 4");
	}

	// đếm số chia hết cho 3 và 4
	public int count(int[] arrA) {
		int count = 0;
		for (int i = 0; i < arrA.length; i++) {
			if (arrA[i] % 3 == 0 && arrA[i] % 4 == 0) {
				count++;
			}
		}
		return count;
	}

	// tìm số lớn thứ 3
	public int max3th(int[] arrA) {
		int max = Integer.MIN_VALUE;
		int i = 0;
		for (int j = arrA.length - 1; j >= 0; j--) {
			max = arrA[j];
			i++;
			if (i == 3) {
				break;
			}
		}
		return max;
	}

	// sắp xếp kiểu chèn
	public int[] insertSorted(int[] arrA) {

		for (int i = 1; i < arrA.length; i++) {
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

	// in mảng
	public void printArr(int[] arrA) {
		System.out.println("--------------------");
		for (int i = 0; i < arrA.length; i++) {
			System.out.print(arrA[i] + " ");
		}

	}

	// so sánh
	public void compare(int[] arrA) {
		int[] arrTemp = newArr(arrA);
		System.out.println("\n--------------");
		System.out.println("Tổng 5 phần tử đầu: " + arrTemp[0]);
		System.out.println("Tổng 5 phần tử cuối: " + arrTemp[1]);
	}

	// mảng mới lưu giá trị tổng 5 phần tử đầu và cuối
	public int[] newArr(int[] arrA) {
		int[] arrTemp = new int[2];
		int j = 0;
		for (int i = 0; i < arrA.length; i++) {
			if (i == 5) {
				j++;
			}
			arrTemp[j] += arrA[i];
		}
		return arrTemp;
	}

	// tạo mảng ngẫu nhiên
	public int[] createArr() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(99);
		}
		return arr;
	}

}
