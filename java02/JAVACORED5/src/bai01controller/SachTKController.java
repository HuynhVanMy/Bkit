package bai01controller;

import java.text.DecimalFormat;

import bai01bean.Sach;
import bai01bean.SachTK;

public class SachTKController extends SachController {

	public SachTK inputData() {
		Sach itemS = super.inputData();
		double thue = checkInput("thuế");
		SachTK itemTK = new SachTK(itemS.getMaSach(), itemS.getNgay(), itemS.getThang(), itemS.getNam(),
				itemS.getDonGia(), itemS.getSoLuong(), itemS.getNhaXuatBan(), thue);
		return itemTK;
	}
	
	//bày cách đặt tên hàm theo tiếng anh vs ah ơi
	public double thanhTien(SachTK itemTK) {
		return super.thanhTien(itemTK) + itemTK.getThue();
	}

	//tổng tiền
	public double totalMoney(SachTK[] itemTK) {
		double tong = 0;
		for (int i = 0; i < itemTK.length; i++) {
			tong += thanhTien(itemTK[i]);
		}
		return tong;
	}

	//tính trung bình
	public void averaged(SachTK[] itemTK) {
		DecimalFormat formater = new DecimalFormat("#,###,###.0");
		System.out.println("Trung bình cộng đơn giá: " + formater.format(totalMoney(itemTK) / 5));
	}

	public void output(SachTK itemTK) {
		DecimalFormat formater = new DecimalFormat("#,###,###.0");
		super.output(itemTK);
		System.out.println("Thuế: " + itemTK.getThue());
		System.out.println("Thành tiền: " + formater.format(thanhTien(itemTK)));
	}

}
