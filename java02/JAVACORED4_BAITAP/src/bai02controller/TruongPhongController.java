package bai02controller;

import java.text.DecimalFormat;

import bai02bean.PeopleBean;
import bai02bean.TruongPhongBean;

public class TruongPhongController extends PeopleController {

	public TruongPhongBean inputData() {
		System.out.println("==NHẬP THÔNG TIN TRƯỞNG PHÒNG==");
		PeopleBean item = super.inputData();
		int soLuongNhanVienQL = (int) checkInput("số lượng nhân viên quản lí");
		TruongPhongBean itemTP = new TruongPhongBean(item.getHoTen(), item.getNamSinh(), item.getHeSoLuong(),
				soLuongNhanVienQL);
		return itemTP;
	}

	public double tinhLuong(TruongPhongBean item) {
		return super.tinhLuong(item) * 2200000;
	}

	public void output(TruongPhongBean item) {
		DecimalFormat df = new DecimalFormat("#,###,###,###.00");
		System.out.println();
		super.output(item);
		System.out.println("Số lượng nhân viên quản lý: " + item.getSoLuongNhanVienQL());
		System.out.println("Lương: " + df.format(tinhLuong(item)) + " USD");
	}
}
