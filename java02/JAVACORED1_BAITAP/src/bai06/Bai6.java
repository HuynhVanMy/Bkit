package bai06;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {

		int a = inputData("a");
		int b = inputData("b");

		output(a, b);
		
	}

	// hàm nhập
	public static int inputData(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean CheckN = true;
		do {
			
			try { // sử dụng try catch để bắt lỗi khi nhập
				System.out.print("Nhập số " + s + " ");
				n = Integer.parseInt(sc.nextLine()); 
				CheckN = false;

			} catch (NumberFormatException e) { // bắt lỗi nhập sai kiểu
				System.out.print("Nhập sai kiểu rồi. Nhập lại: ");
				CheckN = true;
			}
		} while (CheckN);
		return n;
	}

	public static void output(int a, int b){
		System.out.println("UCLN là: " + UCLN(a, b));
		System.out.println("BCNN là: " + BCNN(a, b));
	}
	
	// tìm UCLN
	public static int UCLN(int x, int y) {
		while (x != y) {
			if (x > y) {
				x -= y;
			} else {
				y -= x;
			}
		}
		return x;
	}

	// Tìm BCNN
	public static int BCNN(int m, int n) {
		int i = m > n ? m : n;
		boolean CheckI = true;
		while (CheckI) {
			if (i % m == 0 && i % n == 0) {
				CheckI = false;
			} else {
				i++;
			}
		}
		return i;
	}
}
