package bai02Controller;

import java.util.Scanner;
import bai02bean.Time;

public class TimeController {
	//chưa bắt lỗi nhập ngày tháng
	public static Time inputDateTime(String s) {
		System.out.println("Nhập " + s + ":");
		int ngay = checkNumber("ngày");
		int thang = checkNumber("tháng");
		int nam = checkNumber("năm");
		int gio = checkNumber("giờ(24h)");
		int phut = checkNumber("phút");

		Time item = new Time(ngay, thang, nam, gio, phut);
		return item;
	}

	public static int checkNumber(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print(s + ": ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
			} catch (NumberFormatException e) {
				System.out.println("Nhập bậy !!!");
				check = true;
			}
		} while (check);
		return n;
	}

}
