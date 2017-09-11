package bai01;

import java.util.Scanner;

public class TamGiacDoiDinh {

	public static void main(String[] args) {
		int n = inputData();
		for (int i = 1; i < 2 * n; i++) {
			for (int j = 1; j < 2 * n; j++) {
				if (i <= n) {
					if (j <= i || j >= 2 * n - i) {
						System.out.print(j + " ");
					} else {
						System.out.print("  ");
					}
				} else {
					if (j <= 2 * n - i || j >= i) {
						System.out.print(j + " ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}

	public static int inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập chiều cao tam giác: ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
			} catch (NumberFormatException ex) {
				System.out.println("Nhập bậy !!!");
				check = true;
			}
		} while (check);
		return n;
	}

}
