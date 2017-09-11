package bai01bean;

public class SachTK extends Sach {

	private double thue;

	public SachTK() {

	}

	public SachTK(String maSach, int ngay, int thang, int nam, double donGia, int soLuong, String nhaXuatBan,
			double thue) {
		super(maSach, ngay, thang, nam, donGia, soLuong, nhaXuatBan);
		this.thue = thue;
	}

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}
}
