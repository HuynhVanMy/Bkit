package bai02controller;

import java.text.DecimalFormat;

import bai02bean.GiamDocBean;
import bai02bean.PeopleBean;

public class GiamDocController extends PeopleController {

	public GiamDocBean inputData() {
		System.out.println("===NHẬP THÔNG TIN GIÁM ĐỐC===");
		PeopleBean item = super.inputData();
		double heSoChucVu = checkInput("hệ số chức vụ");
		GiamDocBean itemGD = new GiamDocBean(item.getHoTen(), item.getNamSinh(), item.getHeSoLuong(), heSoChucVu);
		return itemGD;
	}

	public double tinhLuong(GiamDocBean item) {

		return (super.tinhLuong(item) + item.getHeSoChucVu()) * 3000000;
	}

	public void output(GiamDocBean item) {
		DecimalFormat df = new DecimalFormat("#,###,###,###.00");
		System.out.println();
		super.output(item);
		System.out.println("Hệ số chức vụ: " + item.getHeSoChucVu());
		System.out.println("Lương: " + df.format(tinhLuong(item)) + " USD");
	}
}
