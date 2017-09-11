package bai10;

import java.util.Scanner;

public class Bai10 {
	public static void main(String[] args) {

		int n = inputData();
		output(n);
		
	}

	// Nhập
	public static int inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập n: ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
				if (n < 10) {
					System.out.print("Nhập lại số lớn hơn 10 đê. Nhập nhập nhập: ");
					check = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("Nosense !");
				check = true;
			}
		} while (check);
		return n;
	}

	public static void output(int n){
		int result = Result(n);
		System.out.println("Result = " + result);
	}
	
	// giai thừa
	public static int GiaiThua(int n) {
		int GT = 1;
		for (int i = 1; i <= n; i++) {
			GT *= i;
		}
		return GT;
	}
	
	public static int Result(int n){
		int result = 0;
		if (n % 2 == 0) {
			for (int i = 0; i <= n; i += 2) {
				result += GiaiThua(i);
			}
		} else {
			for (int j = 1; j <= n; j += 2) {
				result += GiaiThua(j);
			}
		}
		return result;
	}
}
