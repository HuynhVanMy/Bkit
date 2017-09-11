package bai03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SinhVien {

	private int maSinhVien;
	private String ten;
	private int mucHocPhi;

	public SinhVien() {

	}
	//nhập thông tin Sinh viên
	public void inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		this.maSinhVien = checkInput("mã sinh viên");

		System.out.print("Nhập tên sinh viên: ");
		this.ten = sc.nextLine();

		this.mucHocPhi = checkInput("mức học phí");

	}
	//hiển thị thông tin 
	public void outputData(){
		System.out.println("\n===================\n");
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###,###.00");
		return "Mã Sinh viên: " + maSinhVien
		   + "\nTên Sinh Viên: " + ten
		   + "\nMức học phí: " + df.format(mucHocPhi) + " USD";
	}
	// hàm bắt lỗi nhập xuất
	public int checkInput(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;	//số cần đc kiểm tra
		boolean check = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
			} catch (NumberFormatException ex) {
				System.out.println("Không được nhập bậy !");
				check = true;
			}
		} while (check);
		return n;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getMucHocPhi() {
		return mucHocPhi;
	}

	public void setMucHocPhi(int mucHocPhi) {
		this.mucHocPhi = mucHocPhi;
	}

}
