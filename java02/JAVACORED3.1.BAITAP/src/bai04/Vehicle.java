package bai04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Vehicle {
	private String tenChuXe;
	private String loaiXe;
	private int triGiaXe;
	private int dungTich;
	private float thue;

	public Vehicle() {

	}

	public String getTenChuXe() {
		return tenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public int getTriGiaXe() {
		return triGiaXe;
	}

	public void setTriGiaXe(int triGiaXe) {
		this.triGiaXe = triGiaXe;
	}

	public int getDungTich() {
		return dungTich;
	}

	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}

	public float getThue() {
		if (this.dungTich < 100) {
			//return this.triGiaXe / 100;
			thue = this.triGiaXe/100;
		} else if (this.dungTich >= 100 && this.dungTich <= 200) {
			thue = (this.triGiaXe / 100) * 3;
		} else {
			thue = (this.triGiaXe / 100) * 5;
		}
		return thue;
	}

	public void setThue(float thue) {
		this.thue = thue;
	}

	public void inVal(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.print("Nhập tên chủ xe " + s + ": ");
		this.tenChuXe = sc.nextLine();

		System.out.print("Nhập tên loại xe: ");
		this.loaiXe = sc.nextLine();

		this.triGiaXe = nhapThongSo(" giá trị xe");

		this.dungTich = nhapThongSo("dung tích xe");
		
	}

	public int nhapThongSo(String s){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean checkN = true;
		do{
			try{
				System.out.print("Nhập "+ s + ": ");
				n = Integer.parseInt(sc.nextLine());
				checkN = false;
			}catch(NumberFormatException ex){
				System.out.println("cấm nhập bậy !");
				checkN = true;
			}
		}while(checkN);
		return n;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###,###.00");
		return tenChuXe + "\t" + loaiXe + "\t\t" + dungTich + "\t\t" + df.format(triGiaXe) + "\t" + df.format(getThue());
	}

	public void ouput() {
		System.out.println(toString());
	}

	public int menu() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("**************" 
				+ "\nLựa chọn của bạn là gì?"
				+ "\n1 Nhập thông tin."
				+ "\n2 Xuất bản kê khai tiền thuế trước bạ."
				+ "\n3 thoát");
		System.out.print("Lựa chọn theo thứ tự tương ứng: ");
		boolean checkN = true;
		do{
			try{
				n = Integer.parseInt(sc.nextLine());
				checkN = false;
				if(n < 1 || n > 3){
					System.out.print("Nhập sai! Nhập lại lựa chọn của bạn: ");
					checkN = true;
				}
			}catch(NumberFormatException ex){
				System.out.print("Nhập sai! Nhập lại lựa chọn của bạn: ");
				checkN = true;
			}
		}while(checkN);
		return n;
	}
}
