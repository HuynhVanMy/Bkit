package bai02;

import java.util.Scanner;

public class NhanVien extends People {

	private String tenDonVi;

	public NhanVien() {

	}

	public void inputData(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("---Nhập thông tin " + s +"---");
		super.inputData();
		System.out.print("Nhập tên đơn vị: ");
		tenDonVi = sc.nextLine();
	}

	public double tinhLuong(){
		 return super.tinhLuong() * 1250000;
	}
	
	public void ouput(String s) {
		System.out.println(s);			//stt nhân viên
		super.ouput();
		System.out.println("Tên đơn vị: " + tenDonVi);
		System.out.println();
	}

	public String getTenDonVi() {
		return tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

}
