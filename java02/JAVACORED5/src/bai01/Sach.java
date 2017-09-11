package bai01;

import java.util.Scanner;

public class Sach {

	private String maSach;
	private int ngay;
	private int thang;
	private int nam;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;

	public Sach() {

	}

	public Sach(String maSach, int ngay, int thang, int nam, double donGia, int soLuong, String nhaXuatBan) {
		this.maSach = maSach;
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXuatBan = nhaXuatBan;
	}

	public void inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã sách: ");
		this.maSach = sc.nextLine();

		this.ngay = (int) checkInput("ngày");
		this.thang = (int) checkInput("tháng");
		this.nam = (int) checkInput("năm");
		this.donGia = checkInput("đơn giá");
		this.soLuong = (int) checkInput("số lượng");
		System.out.print("Nhập nhà xuất bản: ");
		this.nhaXuatBan = sc.nextLine();

	}

	public double thanhTien() {
		return this.soLuong * this.donGia;
	}

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

	@Override
	public String toString() {
		return "\nMã sách: " + maSach
				+ "\nngày: " + ngay + "/" + thang + "/" + nam
				+ "\nĐơn giá: " + donGia
				+ "\nSố lượng: " + soLuong
				+ "\nNhà xuất bản: " + nhaXuatBan;
	}

	public void output() {
		System.out.println(toString());
	}

	public int menu() {
		int n = 0;
		System.out.println("MENU" + "\n1. Nhập sách giáo khoa." + "\n2. Nhập sách tham khảo." + "\n3.Thoát");
		n = (int) checkInput("số tương ứng");
		return n;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

}
