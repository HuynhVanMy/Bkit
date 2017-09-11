package bai01;

public class NhanVien {
	private String ten;
	private String cmnd;
	
	public NhanVien() {

	}
	
	public NhanVien(String ten, String cmnd) {
		super();
		this.ten = ten;
		this.cmnd = cmnd;
	}

	public int xuatLuong(){
		return 2000000;
	}
	
	@Override
	public String toString() {
		return "NhanVien [ten=" + ten + ", cmnd=" + cmnd + "]";
	}

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getCmnd() {
		return cmnd;
	}
	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}
}
