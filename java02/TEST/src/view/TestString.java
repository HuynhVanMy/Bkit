package view;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		TestString item = new TestString();
		String s = item.name("họ tên");
		System.out.println(s);

	}

	// hàm nhập kiểu String
	public String inputS(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String temp = "";
		System.out.print("Nhập " + s + ": ");
		temp = sc.nextLine();
		return temp;
	}

	// bắt lỗi nhập tên
	public String name(String s) {
		String hoTen = "";
		boolean check = true;
		do {
			hoTen = inputS("họ tên");
			if (!checkName(hoTen)) {
				check = false;
			} else {
				check = true;
			}
		} while (check);
		return hoTen;
	}

	// kiểm tra nhập họ tên
	public boolean checkName(String s) {
		if (s.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {

			return false;
		}
		return true;
	}
}
