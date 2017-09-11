package bai02;

import java.util.Scanner;

public class Ptbac1 {

	public float inputData(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		float n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				n = Float.parseFloat(sc.nextLine());
				check = false;
			} catch (NumberFormatException e) {
				System.out.println("không đc nhập bậy !!!");
				check = true;
			}

		} while (check);
		return n;
	}

	//in kết quả
	public void output(float a, float b) {
		if (a == 0 && b == 0) {
			System.out.println("vô số nghiệm !!!");
		} else {
			System.out.println("Phương trình có nghiệm: " + div(a, b));
		}
	}

	//tính nghiệm
	public float div(float a, float b) {
		float result = 0;
		boolean check = true;
		do {
			try {
				result = -b / a;
				check = false;
				if (Float.toString(result).equals("Infinity") || Float.toString(result).equals("-Infinity")) {
					throw new ArithmeticException();
				}
			} catch (ArithmeticException e) {
				System.out.println("Không đc nhập a = 0 !!!");
				a = inputData("lại a");
				check = true;
			}
		} while (check);

		return result;
	}
}
