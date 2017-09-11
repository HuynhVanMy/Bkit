package bean;

import java.util.Scanner;

public class SinhVien {
	private int msSV;
	private String hoTen;
	private float diemLT;
	private float diemTH;

	public SinhVien() {

	}

	public SinhVien(int msSV, String hoTen, float diemLT, float diemTH) {
		super();
		this.msSV = msSV;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}

	public int getMsSV() {
		return msSV;
	}

	public void setMsSV(int msSV) {
		this.msSV = msSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
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

	public void Nhap() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã số sinh viên:  ");
		this.msSV = Integer.parseInt(sc.nextLine());

		System.out.print("Nhập Họ tên sinh viên:  ");
		this.hoTen = sc.nextLine();

		System.out.print("Nhập điểm lí thuyết:  ");
		this.diemLT = Float.parseFloat(sc.nextLine());

		System.out.print("Nhập điểm thực hành:  ");
		this.diemTH = Float.parseFloat(sc.nextLine());
	}

	public float DiemTB() {
		return (this.diemLT + this.diemTH) / 2;
	}

	@Override
	public String toString() {
		return msSV + "\t" + hoTen + "\t" + diemLT + "\t" + diemTH + "\t" + DiemTB();
	}

	public void HienThi() {
		System.out.println(toString());
	}
}
