package bai02;

public class GiamDoc extends People {

	private double heSoChucVu;

	public GiamDoc() {

	}

	public void inputData(String s) {
		System.out.println("---Nhập thông tin " + s + "---");
		super.inputData();
		this.heSoChucVu = checkInput("hệ số chức vụ");
	}

	public double tinhLuong() {
		return (super.tinhLuong() + heSoChucVu) * 3000000;
	}

	public void ouput() {
		System.out.println("\n=== GIÁM ĐỐC ===");
		super.ouput();
		System.out.println("hệ số chức vụ: " + heSoChucVu);
	}

	public double getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(double heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

}
