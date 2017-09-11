package exercise;

public class VeHinh {
	public static void main(String[] args) {
		int temp = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				if (i == 4) {
					System.out.print("* ");
				} else if (j == i || j == 4 || j == 7 - temp) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			temp++;
			System.out.println();
		}
	}
}
