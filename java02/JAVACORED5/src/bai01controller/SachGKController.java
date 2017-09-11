package bai01controller;

import java.text.DecimalFormat;
import java.util.Scanner;

import bai01bean.Sach;
import bai01bean.SachGK;

public class SachGKController extends SachController {

	public SachGK intputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Sach itemS = super.inputData(); // kế thừa nhập vào đối tượng sách để tí nữa new vào SGK
		boolean check = true;
		String tinhTrang;
		do {
			System.out.print("Nhập tình trạng sách (mới/ cũ): ");
			tinhTrang = sc.nextLine();
			if (!tinhTrang.equals("moi") && !tinhTrang.equals("mới") && !tinhTrang.equals("cu")
					&& !tinhTrang.equals("cũ")) {
				check = true;
			} else {
				check = false;
			}
		} while (check);
		SachGK itemGK = new SachGK(itemS.getMaSach(), itemS.getNgay(), itemS.getThang(), itemS.getNam(),
				itemS.getDonGia(), itemS.getSoLuong(), itemS.getNhaXuatBan(), tinhTrang);

		return itemGK;
	}
	//thành tiền của từng cuốn sách giống nhau
	public double thanhTien(SachGK itemGK) {
		if (itemGK.getTinhTrang().equals("moi") || itemGK.getTinhTrang().equals("mới")) {
			return super.thanhTien(itemGK);
		} else {
			return super.thanhTien(itemGK) / 2;
		}
	}
	//tổng tiền của sách giáo khoa
	public double totalMoney(SachGK[] itemGK) {
		double tong = 0;
		for (int i = 0; i < itemGK.length; i++) {
			tong += thanhTien(itemGK[i]);
		}
		return tong;
	}
	//thông tin nhà xuất bản
	public void thongTinNXB(SachGK[] itemSGK) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Bạn có muốn lấy thông tin SGK của nhà xuất bản VN (có || nhập bất kỳ là ko): ");
		String s = sc.nextLine();
		if (s.equals("co") || s.equals("có")) {
			int count = 0;
			for (int i = 0; i < itemSGK.length; i++) {
				if (itemSGK[i].getNhaXuatBan().contains("việt nam") || itemSGK[i].getNhaXuatBan().contains("VIỆT NAM")) {
					output(itemSGK[i]);
					count++;
				}
			}
			if (count == 0) {
				System.out.println("==> Không có SGK của nhà xuất bản VN !");
			}
		}
	}

	public void output(SachGK itemGK) {
		DecimalFormat formater = new DecimalFormat("#,###,###.0");
		super.output(itemGK);
		System.out.println("Tình trạng sách: " + itemGK.getTinhTrang());
		System.out.println("Thành tiền: " + formater.format(thanhTien(itemGK)));
	}

}
