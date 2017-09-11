package bai04;

import java.util.Scanner;

public class Bai04 {

	public static void main(String[] args) {

		int a = inputData("a");
		int b = inputData("b");
		int c = inputData("c");

		int min = min(a, b, c);
		int max = max(a, b, c);

		System.out.println("min = " + min);
		System.out.println("max = " + max);

	}

	// hàm tìm min
	public static int min(int m, int n, int p) {
		return (m < n ? m : n) < p ? (m < n ? m : n) : p;
	}

	// hàm tìm max
	public static int max(int m, int n, int p) {
		return (m > n ? m : n) > p ? (m > n ? m : n) : p;
	}

	// hàm nhập
	public static int inputData(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Enter " + s + ": ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
			} catch (NumberFormatException ex) {
				System.out.println("Nosense !");
				check = true;
			}
		} while (check);
		return n;
	}
}
