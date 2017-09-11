package bai02bean;

public class TruongPhongBean extends PeopleBean {

	private int soLuongNhanVienQL;

	public TruongPhongBean() {

	}

	public TruongPhongBean(String hoTen, int namSinh, double heSoLuong, int soLuongNhanVienQL) {
		super(hoTen, namSinh, heSoLuong);
		this.soLuongNhanVienQL = soLuongNhanVienQL;
	}

	public int getSoLuongNhanVienQL() {
		return soLuongNhanVienQL;
	}

	public void setSoLuongNhanVienQL(int soLuongNhanVienQL) {
		this.soLuongNhanVienQL = soLuongNhanVienQL;
	}
}
