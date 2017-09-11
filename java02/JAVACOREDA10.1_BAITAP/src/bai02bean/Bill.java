package bai02bean;

import java.text.DecimalFormat;

public class Bill {

	private String maHD;
	private String tenKH;
	private String maPhong;
	private Time ngayDen;
	private Time ngayDi;
	private float donGia;
	private float thanhTien;

	public Bill() {

	}

	public Bill(String maHD, String tenKH, String maPhong, Time ngayDen, Time ngayDi, float donGia, float thanhTien) {
		this.maHD = maHD;
		this.tenKH = tenKH;
		this.maPhong = maPhong;
		this.ngayDen = ngayDen;
		this.ngayDi = ngayDi;
		this.donGia = donGia;
		this.setThanhTien(thanhTien);
	}

	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		return "Mã HD: " + maHD + "\nTên KH: " + tenKH + "\nMã phòng: " + maPhong + "\nNgày đến: " + ngayDen
				+ "\nNgày đi: " + ngayDi + "\nĐơn giá: " + decimalFormat.format(donGia) + " VNĐ" + "\nThành tiền: "
				+ decimalFormat.format(thanhTien) + " VNĐ";
	}

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public Time getNgayDen() {
		return ngayDen;
	}

	public void setNgayDen(Time ngayDen) {
		this.ngayDen = ngayDen;
	}

	public Time getNgayDi() {
		return ngayDi;
	}

	public void setNgayDi(Time ngayDi) {
		this.ngayDi = ngayDi;
	}

	public float getDonGia() {
		return donGia;
	}

	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

	public float getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(float thanhTien) {
		this.thanhTien = thanhTien;
	}

}