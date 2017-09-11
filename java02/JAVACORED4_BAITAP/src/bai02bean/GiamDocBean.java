package bai02bean;

public class GiamDocBean extends PeopleBean {

	private double heSoChucVu;

	public GiamDocBean() {

	}

	public GiamDocBean(String hoTen, int namSinh, double heSoLuong, double heSoChucVu) {
		super(hoTen, namSinh, heSoLuong);
		this.heSoChucVu = heSoChucVu;
	}

	public double getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(double heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

}
