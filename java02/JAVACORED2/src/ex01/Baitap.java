package ex01;

public class Baitap {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			System.out.print("*");
		}

		for (int i = 1; i <= 6; i++) {
			System.out.println("*");
		}

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j <= 6; j++) {
				if (j == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
