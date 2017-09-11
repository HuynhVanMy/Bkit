package bai04;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		
		int n = inputData();
		System.out.println(n);
		output(n);
		
		System.out.println("----THE END----");
	}

	// hàm nhập
	public static int inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean CheckN = true;
		do {

			try { // sử dụng try catch để bắt lỗi khi nhập
				System.out.print("Nhập số cần kiểm tra đi nào: ");
				n = Integer.parseInt(sc.nextLine()); 
				CheckN = false;

			} catch (NumberFormatException e) { // bắt lỗi nhập sai kiểu
				System.out.print("Không đc nhập bậy !");
				CheckN = true;
			}
		} while (CheckN);
		return n;
	}
	
	public static void output(int n){
		if (SoDaonguoc(n) == n) {
			System.out.println(n + " Là số đảo ngược!");
		} else {
			System.out.println(n + " Không phải số đảo ngược nhé!");
		}
	}

	// hàm đảo ngược số
	public static int SoDaonguoc(int q) {
		int SDN = 0;
		while (q != 0) {
			int temp = q % 10;
			SDN = SDN * 10 + temp;
			q /= 10;
		}
		return SDN;
	}

}
