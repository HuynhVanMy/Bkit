package bai03;

import java.util.Scanner;

public class Bai03 {

	public static void main(String[] args) {
		
		DayMonth();
		
	}

	public static void DayMonth() {
		int month = 0;
		do {
			month = inputData("tháng");
		} while (month < 1 || month > 12);
		int year = 0;
		if (month == 2) {
			year = inputData("năm");
		}

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Có 31 ngày.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Có 30 ngày.");
			break;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("Có 29 ngày.");
			} else {
				System.out.println("Có 28 ngày.");
			}
		}
	}

	public static int inputData(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean Check = true;
		do {

			try { // sử dụng try catch để bắt lỗi khi nhập
				System.out.print("Nhập " + s + ": ");
				n = Integer.parseInt(sc.nextLine());
				Check = false;
			} catch (NumberFormatException e) { // bắt lỗi nhập sai kiểu
				System.out.println("không đc nhập bậy !");
				Check = true;
			}
		} while (Check);
		return n;
	}
}