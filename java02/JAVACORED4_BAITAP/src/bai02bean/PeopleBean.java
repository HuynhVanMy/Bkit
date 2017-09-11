package bai02bean;

public class PeopleBean {

	private String hoTen;
	private int namSinh;
	private double heSoLuong;

	public PeopleBean() {

	}

	public PeopleBean(String hoTen, int namSinh, double heSoLuong) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.heSoLuong = heSoLuong;
	}

	public String toString() {
		return "Họ tên: " + hoTen + "\nNăm Sinh: " + namSinh + "\nHệ số lương: " + heSoLuong;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

}
