package bai02controller;

import java.text.DecimalFormat;
import java.util.Scanner;

import bai02bean.NhanVienBean;
import bai02bean.PeopleBean;

public class NhanVienController extends PeopleController {

	public NhanVienBean inputData(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("\n=Nhập thông tin nhân viên " + s + "=");
		PeopleBean item = super.inputData();
		System.out.print("Nhập tên đơn vị: ");
		String tenDonVi = sc.nextLine();
		NhanVienBean itemNV = new NhanVienBean(item.getHoTen(), item.getNamSinh(), item.getHeSoLuong(), tenDonVi);
		return itemNV;
	}

	public double tinhLuong(NhanVienBean item) {
		return super.tinhLuong(item) * 1250000;
	}

	public void output(NhanVienBean item, String s) {
		DecimalFormat df = new DecimalFormat("#,###,###,###.00");
		System.out.println("\nNhân viên " + s);
		super.output(item);
		System.out.println("Tên đơn vị: " + item.getTenDonVi());
		System.out.println("Lương: " + df.format(tinhLuong(item)) + " USD");
	}
}
