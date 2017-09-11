package bai03;

import java.util.Scanner;

public class Bai03 {

	public static void main(String[] args) {

		Bai03 item = new Bai03();
		String s = item.inputName();
		s = item.xuLy(s);
		System.out.println(s.trim());
	}

	//
	public String xuLy(String s) {
		String temp = "";
		s = s.trim();
		s = s.replaceAll("\\s+", " "); // thay thế cách khoảng trắng vô nghĩa
										// bởi 1 khoảng trắng
		for (int i = 0; i < s.length(); i++) {
			if (i == 0) {
				temp += String.valueOf(s.charAt(i)).toUpperCase();
			} else if (String.valueOf(s.charAt(i - 1)).equals(" ")) {
				temp += String.valueOf(s.charAt(i)).toUpperCase();
			} else {
				temp += String.valueOf(s.charAt(i)).toLowerCase();
			}
		}
		return temp;
	}

	// nhập chuỗi
	public String inputName() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = "";
		boolean check = true;
		do {
			try {
				System.out.print("Nhập tên: ");
				s = sc.nextLine();
				check = false;
				if (!isName(s)) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("không đc nhập bậy !!!");
				check = true;
			}
		} while (check);

		return s;
	}

	// kiểm tra chuỗi
	public boolean isName(String s) {
		if (s.matches(".*[0-9].*") || s.matches(".*(?=.*[@#$%!^&*/,.`~?';=-]).*")) {
			return false;
		}
		return true;
	}

}
