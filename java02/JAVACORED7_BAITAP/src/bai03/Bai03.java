package bai03;

import java.util.Calendar;
import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Bai03 item = new Bai03();

		int date = item.inputData("ngày");
		int month = item.inputData("tháng") - 1; // vì tháng bắt đầu từ 0
		int year = item.inputData("năm");
		item.output(date, month, year);

	}

	public void output(int date, int month, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		System.out.println(cal.getTime());
		System.out.println("ngày thứ " + cal.get(Calendar.DAY_OF_YEAR) + " của năm.");
	}

	public int inputData(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
			} catch (NumberFormatException e) {
				System.out.println("Ko đc nhập bậy !!!");
				check = true;
			}
		} while (check);
		return n;
	}

}
