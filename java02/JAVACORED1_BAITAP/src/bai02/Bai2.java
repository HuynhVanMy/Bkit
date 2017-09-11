package bai02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		
		double a = inputData("a");
		double b = inputData("b");

		double reuslt = TinhThuong(a, b);
		DecimalFormat df = new DecimalFormat("#,###,###.00"); // làm tròn số
		System.out.println("result = " + df.format(reuslt));
	}

	public static double inputData(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double n = 0;
		boolean CheckN = true;
		do {

			try { // sử dụng try catch để bắt lỗi khi nhập
				System.out.print("Nhập " + s + ": ");
				n = Double.parseDouble(sc.nextLine());
				CheckN = false;
				if (n < -1000 || n > 1000) {
					System.out.print("Nhập sai rồi . Nhập lại: ");
					CheckN = true;
				}

			} catch (NumberFormatException e) { // bắt lỗi nhập sai kiểu
				System.out.println("không đc nhập bậy" + e);
				CheckN = true;
			}
		} while (CheckN);
		return n;
	}

	// hàm tính thương
	public static double TinhThuong(double x, double y) {
		return x - y;
	}
}
