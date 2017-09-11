package bai01;

import java.text.DecimalFormat;

public class SachTK extends Sach {

	private double thue;

	public SachTK() {

	}

	public void inputData() {
		super.inputData();
		this.thue = checkInput("thuế");
	}

	public double thanhTien() {
		return super.thanhTien() + thue;
	}

	public void output() {
		DecimalFormat formater = new DecimalFormat("#,###,###.0");
		super.output();
		System.out.println("Thuế: " + formater.format(thue));
		System.out.println("Thành tiền: " + formater.format(thanhTien()));
	}

	public double tongTien(SachTK[] itemTK) {
		double tongTien = 0;
		for (int i = 0; i < itemTK.length; i++) {
			tongTien += itemTK[i].thanhTien();
		}
		return tongTien;
	}

	public void trungBinh(SachTK[] itemTK) {
		DecimalFormat formater = new DecimalFormat("#,###,###.0");
		System.out.println("Trung bình cộng đơn giá: " + formater.format(tongTien(itemTK) / 5));
	}

	public SachTK(double thue) {
		super();
		this.thue = thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

}
