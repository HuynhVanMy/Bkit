package bai02;

import java.util.Scanner;

public class People {
	private String hoTen;
	private int namSinh;
	private double heSoLuong;

	public People() {

	}

	public People(String hoTen, int namSinh, double heSoLuong) {
		super();
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.heSoLuong = heSoLuong;
	}

	public double tinhLuong() {

		return heSoLuong;
	}

	// Nhập thông tin
	public void inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		this.hoTen = sc.nextLine();

		this.namSinh = (int) checkInput("Năm Sinh");

		this.heSoLuong = checkInput("hệ số lương");

	}

	// in thông tin
	public void ouput() {
		System.out.println(toString());
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

	public String toString() {
		return "Họ tên: " + hoTen + "\nNăm Sinh: " + namSinh + "\nHệ số lương: " + heSoLuong;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

}
