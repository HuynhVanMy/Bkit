package bai01;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		
		int n = inputData("n");
		int[] arrA = new int[20];
		
		ChuyenDoi(arrA, n);
		
		System.out.println();
		System.out.println("===THE END===");
	}

	public static int inputData(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean Check = true;
		do {
			try {
				System.out.print("Nhập " + s + " ");
				n = Integer.parseInt(sc.nextLine());
				Check = false;
				if(n<=0){
					System.out.println("Nhập số lớn hơn 0 !!!");
					Check = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("không đc nhập bậy !!!");
				Check = true;
			}
		} while (Check);
		return n;
	}

	public static void ChuyenDoi(int[] arrA, int n) {
		int Count = 0;
		for (int i = 0; i < arrA.length; i++) {
			if (n < 1) {
				break;
			} else {
				int temp = n % 2;
				if (temp != 0) {
					arrA[i] = 1;
				} else {
					arrA[i] = 0;
				}
			}
			Count++;
			n /= 2;
		}
		for (int i = Count - 1; i >= 0; i--) {
			System.out.print(arrA[i]);
		}
	}
}
