package bai01bean;

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

	@Override
	public String toString() {
		return "\nMã sách: " + maSach
			 + "\nngày: " + ngay + "/" + thang + "/" + nam
			 + "\nĐơn giá: " + donGia
			 + "\nSố lượng: " + soLuong
			 + "\nNhà xuất bản: " + nhaXuatBan;
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
