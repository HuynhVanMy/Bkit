package bai02bean;

public class NhanVienBean extends PeopleBean {

	private String tenDonVi;

	public NhanVienBean() {

	}

	public NhanVienBean(String hoTen, int namSinh, double heSoLuong, String tenDonVi) {
		super(hoTen, namSinh, heSoLuong);
		this.tenDonVi = tenDonVi;
	}

	public String getTenDonVi() {
		return tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}
}
