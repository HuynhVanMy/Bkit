package controller;

import java.text.DecimalFormat;
import java.util.Scanner;

import model.AccountMVC;

public class AccountController {
	public static void main(String[] args) {

	}

	// nhập số tiền nộp/rút
	public double inVal(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double n = 0;
		boolean checkN = true;
		do {
			try {
				System.out.print("Nhập số tiền muốn " + s + ": ");
				n = Double.parseDouble(sc.nextLine());
				checkN = false;
			} catch (NumberFormatException ex) {
				System.out.println("Yêu cầu nhập đúng số tiền!");
				checkN = true;
			}
		} while (checkN);
		return n;
	}

	// nộp tiền
	public AccountMVC deposit(AccountMVC item) {
		System.out.println("---------------");
		double tienNopVao;
		do {
			tienNopVao = inVal("nộp vào");
			if (tienNopVao < 100000) {
				System.out.println("Tiền nộp vào phải nhiều hơn 100K!");
			}
		} while (tienNopVao < 100000);
		item.setBalance(item.getBalance() + tienNopVao);
	
		return item;
	}

	// rút tiền
	public AccountMVC withdraw(AccountMVC item) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------");
		if (item.getBalance() < 100000) {
			System.out.print("Tài khoản của bạn còn ít hơn 100k. Bạn có muốn nộp tiền? (co/ko):");
			String s = sc.nextLine();
			if (s.equals("co")) {
				deposit(item);
				System.out.println("Nộp tiền thành công. Hãy kiểm tra lại tài khoản của bạn!");
			}
		} else {
			double tienRut;
			do {
				tienRut = inVal("rút");
				if (tienRut < 100000) {
					System.out.println("Tiền rút ra phải nhiều hơn 100K!");
				} else if (tienRut > item.getBalance()) {
					System.out.println("Số tiền rút Không hợp lệ !");
				}
			} while (tienRut < 100000 || tienRut > item.getBalance());
			item.setBalance(item.getBalance() - tienRut);
		}
		return item;
}

	// thông tin
	public void thongTinTK(AccountMVC item) {
		System.out.println("---------------");
		DecimalFormat df = new DecimalFormat("#,###,###,###.00");
		System.out.println("Giao dịch thành công!");
		System.out.println("Số tiền hiện tại của bạn  là: " + df.format(item.getBalance()) + " VND");
	}

	// menu
	public int menu() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		System.out.println("*^*^*^*^*^*^*^*^*^*^*^*^*" + "\n1. Kiểm Tra Thông Tin Tài Khoản."
				+ "\n2. Nộp tiền vào tài khoản" + "\n3. Rút tiền." + "\n4. Thoát.");
		do {
			try {
				System.out.print("Nhập yêu cầu của bạn theo số tương ứng: ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
				if (n < 1 || n > 4) {
					System.out.println("Không có chức năng này!");
					check = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("Vui lòng nhập đúng chức năng!");
				check = true;
			}
		} while (check);
		return n;
	}

}
