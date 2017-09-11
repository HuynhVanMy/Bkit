package bai05;

import java.util.Scanner;

public class Bai05 {


	public static void main(String[] args) {

		int[] arrayA = new int[6];
		// Nhập mảng
		inputData(arrayA);
		
		int[] newarray = new int[arrayA.length];
		newarray = newArr(arrayA, newarray);
		
		// sắp xếp lại các phần tử trong mảng
		Swaps(newarray);
		
		// In ra số lẻ lớn nhất thứ 2
		Output(newarray);

	}

	// Hàm nhập mảng
	public static void inputData(int[] a) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "); // không hiểu vì sao phải có dòng này
			a[i] = Integer.parseInt(sc.nextLine());
		}
	}

	// Tách số lẻ sang 1 mảng khác
	public static int[] newArr(int[] a, int[] arr) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				arr[count++] = a[i];
			}
		}
		return arr;
	}

	// hàm sắp xếp các phần tử trong mảng
	public static void Swaps(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i - 1; j <= i; j++) {
				if (arr[j] > arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	// Tìm giá trị lẻ lớn nhất thứ 2
	public static void Output(int[] arr) {
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] % 2 != 0) {
				System.out.print("\nSố lẻ lớn nhất thứ 2 trong dãy số là: " + arr[i]);
				break;
			}
		}
	}
}