package bai03;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Controlller {

	public StudentAccount inputData() {
		Random rd = new Random();
		String maHV = "bkit-" + (rd.nextInt(899) + 100);
		String hoTen = name("tên học viên");
		String matKhau = pass("mật khẩu");
		String ngaySinh = date();

		StudentAccount item = new StudentAccount(maHV, hoTen, matKhau, ngaySinh);

		return item;
	}

	public void output(StudentAccount item) {
		System.out.println("Chúc mừng bạn đã đăng kí thành công !!! :))");
		System.out.println(item.toString());
	}

	// bắt lỗi nhập tên
	public String name(String s) {
		String hoTen = "";
		boolean check = true;
		do {
			hoTen = inputS("họ tên");
			if (isName(hoTen)) {
				check = false;
			} else {
				check = true;
			}
		} while (check);
		return hoTen;
	}

	// bắt lỗi nhập mật khẩu
	public String pass(String s) {
		String matKhau = "";
		boolean check = true;
		do {
			try {
				matKhau = inputS("mật khẩu");
				check = checkPass(matKhau);
			} catch (Exception ex) {

			}

		} while (check);
		return matKhau;
	}

	// bắt lỗi nhập ngày tháng năm
	public String date() {
		String date = "";
		int ngay = 0;
		int thang = 0;
		int nam = 0;
		boolean check = true; // kiểm tra năm
		do {
			try {
				nam = inputI("năm");
				check = false;
				int tuoi = Calendar.getInstance().get(Calendar.YEAR) - nam;
				ageException(tuoi);
			} catch (Exception e) {
				check = true;
				System.out.println("Nhỏ tuổi quá !!! :))");
			}

		} while (check);
		check = true; // kiểm tra tháng
		do {
			try {
				thang = inputI("tháng");
				check = false;
				monthException(thang);
			} catch (Exception e) {
				System.out.println("không có tháng này !!!");
				check = true;
			}
		} while (check);

		check = true; // kiểm tra ngày
		do {
			ngay = inputI("ngày");
			check = false;
			try {
				switch (thang) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					dateException(ngay, 31);
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					dateException(ngay, 30);
					break;
				case 2:
					if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
						dateException(ngay, 29);
					} else {
						dateException(ngay, 28);
					}
					break;
				}

			} catch (Exception e) {
				check = true;
				System.out.println("không có ngày này !!!");
			}
		} while (check);

		date = ngay + " / " + thang + " / " + nam;

		return date;
	}

	// kiểm tra tuổi
	public void ageException(int tuoi) throws Exception {
		if (tuoi < 19) {
			throw new Exception();
		}
	}

	// kiểm tra tháng
	public void monthException(int thang) throws Exception {
		if (thang < 1 || thang > 12) {
			throw new Exception();
		}
	}

	// kiểm tra ngày
	public void dateException(int ngay, int date) throws Exception {
		if (ngay > date) {
			throw new Exception();
		}
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

	public int menu() {
		int n = 0;

		System.out.println("====MENU====" + "\n1. Đăng kí tài khoản" + "\n2. Thoát");
		boolean check = true;
		do {
			n = inputI("lựa chọn của bạn");
			check = false;
			if (n < 1 || n > 2) {
				System.out.println("Không có chức năng này !!!");
				check = true;
			}
		} while (check);

		return n;
	}

	// Nhập kiểu int
	public int inputI(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
				if (n < 1) {
					System.out.println("Nhập sai rồi !!!");
					check = true;
				}
			} catch (NumberFormatException e) {
				System.out.println("Không đc nhập bậy !!!");
				check = true;
			}
		} while (check);
		return n;
	}

	// kiểm tra nhập họ tên
	public boolean isName(String s) {
		// if (s.matches(".*[0-9].*") || s.contains("!") || s.contains("@") ||
		// s.contains("#") || s.contains("$")
		// || s.contains("%") || s.contains("^") || s.contains("&") ||
		// s.contains("*")) {
		if (s.matches(".*[0-9].*") || s.matches(".*(?=.*[@#$%!^&*/,.`~?';=-]).*")) {
			return false;
		}
		return true;
	}

	// kiểm tra nhập mật khẩu
	public boolean checkPass(String s) throws Exception {
		if (s.matches(".*((?=.*[A-Z])(?=.*[@#$%!^&*]).{8,63}).*")) {
			return false;
		} else {
			System.out.println("Mật khẩu không đúng định dạng!!!");
		}
		return true;

	}

}
