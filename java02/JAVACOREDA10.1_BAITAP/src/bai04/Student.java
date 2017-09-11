package bai04;

public class Student {

	private String maSV;
	private String tenSV;
	private String ngaySinh;
	private float diemLT;
	private float diemTH;
	private float diemTB;

	public Student() {

	}

	public Student(String maSV, String tenSV, String ngaySinh, float diemLT, float diemTH, float diemTB) {
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.ngaySinh = ngaySinh;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
		this.diemTB = diemTB;
	}

	@Override
	public String toString() {
		return maSV + "\t" + tenSV + "\t" + ngaySinh + "\t\t" + diemLT + "\t"
				+ diemTH + "\t" + diemTB;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}

	public String getTenSV() {
		return tenSV;
	}

	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public float getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}

	public float getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

}
