package bai06;

import java.util.Scanner;

public class Bai06 {

	public static void main(String[] args) {

		int a = inputData("a");
		int b = inputData("b");
		int c = inputData("c");

		output(a, b, c);
		
	}

	// Hàm nhập
	public static int inputData( String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter "+ s + ": ");
		int n = Integer.parseInt(sc.nextLine());
		return n;
	}

	public static void output(int a, int b, int c){
		if (a + b > c && b + c > a && a + c > b) {
			Check(a, b, c);
		} else {
			System.out.println("Không phải tam giác");
		}
	}
	
	// Kiểm tra
	public static void Check(int a, int b, int c) {
		if (a == b && a == c) {
			System.out.println("Tam giác đều nhé :v");
		} else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
			System.out.println("Tam giác cân nề.");
		} else if (((Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))
				|| (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2))
				|| (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))) && ((a == b) || (a == c) || (b == c))) {
			System.out.println("Tam giác vuông cân rồi.");
		} else if ((Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2))
				|| (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2))
				|| (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2))) {
			System.out.println("Tam giác vuông.");
		} else {
			System.out.println("Tam giác gì không biết nữa.");
		}
	}
}
