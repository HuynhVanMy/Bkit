package test;

import java.util.Random;
import java.util.Scanner;

/**
 * làm lại nhập mật khẩu => viết ra từng hàm thông báo lỗi rõ ràng bắt lỗi nhập
 * tên chưa đc
 **/

public class Account {

	public static void main(String[] args) {
		Account item = new Account();
		item.output();

	}

	public void output() {
		System.out.println(
				"Chào mừng bạn đến với công ty ABC. Để sử dụng website của hệ thống. Vui lòng nhập thông tin để đăng kí.\n");
		String name = inputName();
		System.out.println(name);
		String accName = accountName(name);
		String pass = pass();
		System.out.println("Tên tài khoản của bạn: " + accName);
		System.out.println("Mật khẩu của bạn: " + pass);
		System.out.println("Bạn cần phải thay đổi mật khẩu !!!");
		pass = doiPass(accName, pass);
		System.out.println("Chúc mừng bạn đã đăng kí thành công :))");
	}

	public String doiPass(String name, String pass) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String repass = "";
		// nhập lại mật khẩu cũ
		do {
			System.out.print("Nhập mật khẩu cũ của bạn: ");
			repass = sc.nextLine();
			if (!repass.equals(pass)) {
				System.out.println("Nhập mật khẩu không đúng !!!");
			}
		} while (!repass.equals(pass));
		// nhập mật khẩu mới
		String newPass = "";
		boolean check = true;
		do {
			try {
				System.out.print("Nhập mật khẩu mới của bạn: ");
				newPass = sc.nextLine();
				check = false;
				if (!checkPass(newPass, name)) {
					throw new Exception();
				}
			} catch (Exception e) {
				check = true;
			}
		} while (check);
		// Xác nhận lại mật khẩu mới
		check = true;
		repass = "";
		do {
			try {
				System.out.print("Xác nhận lại mật khẩu: ");
				repass = sc.nextLine();
				check = false;
				if (!repass.equals(newPass)) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Mật khẩu không đúng !!!");
				check = true;
			}
		} while (check);
		return newPass;
	}

	public boolean checkPass(String newPass, String name) {
		int count = 0;
		if (!checkCharName(newPass, name)) {
			System.out.println("Mật khẩu của bạn không được có từ 3 ký tự trở lên của tên người dùng !!!");
			return false;
		} else if (newPass.length() < 7) {
			System.out.println("Mật khẩu ít nhất 7 ký tự !!!");
			return false;
		} else {
			if (!checkCharUppcase(newPass)) {
				count++;
			}
			if (!checkCharLowcase(newPass)) {
				count++;
			}
			if (!checkNumber(newPass)) {
				count++;
			}
			if (!checkSymbols(newPass)) {
				count++;
			}
		}

		if (count >= 2) {
			if (!checkCharUppcase(newPass)) {
				System.out.println("Mật khẩu phải chứa ký tự hoa [A-Z] !!!");
			}
			if (!checkCharLowcase(newPass)) {
				System.out.println("Mật khẩu của bạn phải chứa ký tự thường [a-z] !!!");
			}
			if (!checkNumber(newPass)) {
				System.out.println("Mật khẩu phải chứ số tự nhiên [0-9] !!!");
			}
			if (!checkSymbols(newPass)) {
				System.out.println("Mật khẩu phải chứa Sympols !!!");
			}
			return false;
		} else {
			return true;
		}

	}

	// kiểm tra mật khẩu có chứa từ 3 ký tự trở lên của tên người dùng
	public boolean checkCharName(String newPass, String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (newPass.contains(String.valueOf(name.charAt(i)))) {
				count++;
			}
		}
		if (count > 2) {
			return false;
		}
		return true;
	}

	// kiểm tra mật khẩu có chứa ký tự hoa
	public boolean checkCharUppcase(String newPass) {
		if (!newPass.matches(".*[A-Z].*")) {
			return false;
		}
		return true;
	}

	// kiểm tra mật khẩu có chứa ký tự thường
	public boolean checkCharLowcase(String newPass) {
		if (!newPass.matches(".*[a-z].*")) {
			return false;
		}
		return true;
	}

	// kiểm tra mật khẩu có chứa số tự nhiên
	public boolean checkNumber(String newPass) {
		if (!newPass.matches(".*[0-9].*")) {
			return false;
		}
		return true;
	}

	// kiểm tra mật khẩu có chứa ký tự đặt biệt
	public boolean checkSymbols(String newPass) {
		if (!newPass.matches(".*(?=.*[@#$%!^&*/,.`~?';=-]).*")) {
			return false;
		}
		return true;
	}

	// pass mặc định
	public String pass() {
		String pass = "";
		Random rd = new Random();
		String[] arr = { "a", "b", "c", "d", "e", "A", "B", "C", "D", "E" };
		for (int i = 1; i <= 8; i++) {
			if (rd.nextBoolean()) {
				pass += arr[rd.nextInt(arr.length)];
			} else {
				pass += rd.nextInt(9);
			}
		}
		return pass;
	}

	// UserName
	public String accountName(String name) {
		String accName = "";
		accName = name.substring(name.lastIndexOf(" ") + 1, (name.lastIndexOf(" ") + 2))
				+ name.substring(0, name.indexOf(" "));
		return accName;
	}

	// nhập tên người dùng
	public String inputName() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = "";
		boolean check = true;
		do {
			try {
				System.out.print("Nhập họ tên: ");
				name = sc.nextLine();
				check = false;
				if (!checkName(name)) {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("Nhập tên không đúng !!!");
				check = true;
			}
		} while (check);
		return name;
	}

	// kiểm tra nhập tên
	public boolean checkName(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (!String.valueOf(name.charAt(i)).matches("[a-zA-Z]+") && !String.valueOf(name.charAt(i)).equals(" ")) {
				return false;
			}
		}
		return true;
	}

}
