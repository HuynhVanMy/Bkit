package bai02controller;

import java.util.Scanner;

import bai02bean.PeopleBean;

public class PeopleController {

	// Nhập thông tin
	public PeopleBean inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		String hoTen = sc.nextLine();

		int namSinh = (int) checkInput("Năm Sinh");

		double heSoLuong = checkInput("hệ số lương");

		PeopleBean item = new PeopleBean(hoTen, namSinh, heSoLuong);
		return item;

	}

	// hàm bắt lỗi nhập xuất
	public double checkInput(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				n = Double.parseDouble(sc.nextLine());
				check = false;
			} catch (NumberFormatException ex) {
				System.out.println("Không được nhập bậy !");
				check = true;
			}
		} while (check);
		return n;
	}

	public double tinhLuong(PeopleBean item) {

		return item.getHeSoLuong();

	}

	public void output(PeopleBean item) {
		System.out.println(item.toString());
	}

	public int menu() {
		System.out.println("===NHẬP THÔNG TIN===");
		System.out.println(
				"1. Thông tin giám đốc." + "\n2. Thông tin trưởng phòng." + "\n3. Thông tin nhân viên" + "\n4. Thoát.");
		System.out.println("Bạn muốn thông tin của ai ?");
		int n = (int) checkInput("số tương ứng");
		System.out.println();
		return n;
	}

}
