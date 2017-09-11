package bai03;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		
		int n = inputData();
		output(n);
		
	}
	
	public static int inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean CheckN = true;
		do{
			
		try {	//sử dụng try catch để bắt lỗi khi nhập
			System.out.print("Nhập số cần kiểm tra: ");
			n = Integer.parseInt(sc.nextLine());	//ép kiểu phân tích chuỗi thành kiểu  int
			CheckN = false;

		} catch (NumberFormatException e) {		// bắt lỗi nhập sai kiểu
			System.out.println("Không đc nhập bậy");
			CheckN = true;
		}
		}while(CheckN);
		return n;
	}
	
	public static void output(int n){
		if(KiemTraSoNgT(n)){
			System.out.println(n+" là số nguyên tố!");
		}else{
			System.out.println(n+" không phải là số nguyên tố!");
		}
	}

	public static boolean KiemTraSoNgT(int n) {
		if (n < 2) {
			return false;
		} else if (n == 2) {
			return true;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
