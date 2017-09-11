package bai01bean;

public class SachGK extends Sach {

	private String tinhTrang;

	public SachGK() {

	}

	public SachGK(String maSach, int ngay, int thang, int nam, double donGia, int soLuong, String nhaXuatBan,
			String tinhTrang) {
		super(maSach, ngay, thang, nam, donGia, soLuong, nhaXuatBan);
		this.tinhTrang = tinhTrang;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

}
