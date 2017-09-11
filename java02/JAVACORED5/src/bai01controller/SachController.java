package bai01controller;

import java.util.Scanner;

import bai01bean.Sach;

public class SachController {

	public Sach inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("**");
		System.out.print("Nhập mã sách: ");
		String maSach = sc.nextLine();

		int ngay = (int) checkInput("ngày");
		int thang = (int) checkInput("tháng");
		int nam = (int) checkInput("năm");
		double donGia = checkInput("đơn giá");
		int soLuong = (int) checkInput("số lượng");

		System.out.print("Nhập nhà xuất bản: ");
		String nhaXuatBan = sc.nextLine();

		Sach item = new Sach(maSach, ngay, thang, nam, donGia, soLuong, nhaXuatBan);
		return item;

	}

	public void output(Sach item) {
		System.out.println(item.toString());
	}
	
	//thành tiền
	public double thanhTien(Sach item) {
		return item.getSoLuong() * item.getDonGia();
	}
	
	//kiểm tra lỗi nhập
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
				System.out.println("không đc nhập bậy !");
				check = true;
			}
		} while (check);
		return n;
	}

	public int menu() {
		int n = 0;
		System.out.println("MENU" + "\n1. Nhập sách giáo khoa." + "\n2. Nhập sách tham khảo." + "\n3.Thoát");
		n = (int) checkInput("số tương ứng");
		return n;
	}

}
