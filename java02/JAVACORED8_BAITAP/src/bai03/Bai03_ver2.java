package bai03;

import java.util.Scanner;

public class Bai03_ver2 {

	public static void main(String[] args) {

		Bai03_ver2 item = new Bai03_ver2();
		String name = item.inputName();
		name = item.upperCase(name);
		System.out.println(name);

	}

	public String inputName() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = "";
		boolean check = true;
		do {
			try {
				System.out.print("Nhập tên: ");
				name = sc.nextLine();
				check = false;
				if (!checkName(name)) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Họ tên không đc có số và kí tự đặc biệt !!!");
				check = true;
			}
		} while (check);
		return name;
	}

	// kiểm tra tính hợp lệ của tên
	public boolean checkName(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (!Character.isLetter(name.charAt(i)) && !Character.isWhitespace(name.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	// loại bỏ khoảng trắng không hợp lệ
	public String deleteSpace(String name) {
		name = name.trim();
		name = name.replaceAll("\\s+", " ");
		return name;

	}

	// viết Hoa chữ đầu của mỗi từ
	public String upperCase(String name) {
		name = deleteSpace(name);
		String temp = "";
		for (int i = 0; i < name.length(); i++) {
			if (i == 0) {
				temp += String.valueOf(name.charAt(0)).toUpperCase();
			} else if (String.valueOf(name.charAt(i - 1)).equals(" ")) {
				temp += String.valueOf(name.charAt(i)).toUpperCase();
			} else {
				temp += String.valueOf(name.charAt(i)).toLowerCase();
			}

		}
		return temp;
	}

}
