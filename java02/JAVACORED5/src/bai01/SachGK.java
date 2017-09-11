package bai01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SachGK extends Sach {

	private String tinhTrang;

	public SachGK() {

	}

	public void inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println();
		super.inputData();
		boolean check = true;
		do {
			System.out.print("Nhập tình trạng sách: ");
			this.tinhTrang = sc.nextLine();
			if (!this.tinhTrang.equals("cũ") && !this.tinhTrang.equals("cu") && !this.tinhTrang.equals("moi")
					&& !this.tinhTrang.equals("mới")) {
				check = true;
			} else {
				check = false;
			}
		} while (check);

	}

	public double thanhTien() {

		if (this.tinhTrang.equals("moi") || this.tinhTrang.equals("mới")) {
			return super.thanhTien();
		} else {
			return super.thanhTien() / 2;
		}
	}

	public void output() {
		DecimalFormat formater = new DecimalFormat("#,###,###.0");
		super.output();
		System.out.println("Tình trạng: " + tinhTrang);
		System.out.println("Thành tiền: " + formater.format(thanhTien()));
	}

	public void thongTinNXB(SachGK[] itemSGK) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Bạn có muốn lấy thông tin SGK của nhà xuất bản VN (có || nhập bất kỳ là ko): ");
		String s = sc.nextLine();
		if (s.equals("co") || s.equals("có")) {
			int count = 0;
			for (int i = 0; i < itemSGK.length; i++) {
				if (itemSGK[i].getNhaXuatBan().equals("VN") || itemSGK[i].getNhaXuatBan().equals("vn")) {
					itemSGK[i].output();
					count++;
				}
			}
			if (count == 0) {
				System.out.println("==> Không có SGK của nhà xuất bản VN !");
			}
		}
	}

	public double tongTien(SachGK[] itemSGK) {
		double tongTien = 0;
		for (int i = 0; i < itemSGK.length; i++) {
			tongTien += itemSGK[i].thanhTien();
		}
		return tongTien;
	}

	public SachGK(String tinhTrang) {
		super();
		this.tinhTrang = tinhTrang;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

}
