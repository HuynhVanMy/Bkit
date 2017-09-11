package bai03;

public class StudentAccount {

	private String maHV;
	private String hoTen;
	private String matKhau;
	private String ngaySinh;

	public StudentAccount() {

	}

	public StudentAccount(String maHV, String hoTen, String matKhau, String ngaySinh) {
		super();
		this.maHV = maHV;
		this.hoTen = hoTen;
		this.matKhau = matKhau;
		this.ngaySinh = ngaySinh;
	}
	
	

	@Override
	public String toString() {
		return "Mã học viên: " + maHV
			 + "\nHọ tên: " + hoTen
			 + "\nMật khẩu: " + matKhau
			 + "\nNgày Sinh: " + ngaySinh;
	}

	public String getMaHV() {
		return maHV;
	}

	public void setMaHV(String maHV) {
		this.maHV = maHV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
	
	
}
