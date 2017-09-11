package bai02;

public class TruongPhong extends People {

	private int soLuongNhanVienQL;

	public TruongPhong() {

	}

	public void inputData(String s) {
		System.out.println("---Nhập thông tin " + s +"---");
		super.inputData();
		this.soLuongNhanVienQL = (int) checkInput("số lượng nhân viên quản lí");
	}

	public double tinhLuong(){
		 return super.tinhLuong() * 2200000;
	}
	
	public void ouput() {
		System.out.println("\n== TRƯỞNG PHÒNG ==");
		super.ouput();
		System.out.println("Số lượng nhân viên quản lý: " + soLuongNhanVienQL);
	}

	public int getSoLuongNhanVienQL() {
		return soLuongNhanVienQL;
	}

	public void setSoLuongNhanVienQL(int soLuongNhanVienQL) {
		this.soLuongNhanVienQL = soLuongNhanVienQL;
	}

}
