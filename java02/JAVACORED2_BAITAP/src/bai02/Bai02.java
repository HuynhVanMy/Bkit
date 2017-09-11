package bai02;

import java.util.Scanner;

public class Bai02 {

	public static void main(String[] args) {
		int n = 0;
		n = inputData(n);
		System.out.print("result = " + TinhTong(n));

	}

	public static int inputData(int n) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		do {
			try {
				System.out.print("Enter n: ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
				if (n < 0) {
					System.out.println("n > 0 !");
				}
			} catch (NumberFormatException ex) {
				System.out.println("Nosense !");
				check = true;
			}
		} while (check);
		return n;
	}

	public static int TinhTong(int a) {
		int Tong = 0;
		for (int i = 1; i <= a; i++) {
			Tong += i;
		}
		return Tong;
	}
}
