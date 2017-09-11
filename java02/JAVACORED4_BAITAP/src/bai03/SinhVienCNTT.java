package bai03;

import java.util.Scanner;

public class SinhVienCNTT extends SinhVien {

	private float diemToan;
	private float diemTin;
	private boolean cuDem;

	public SinhVienCNTT() {

	}

	// Nhập thông tin
	public void inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		super.inputData();

		this.diemToan = (float) checkInput("điểm toán");

		this.diemTin = (float) checkInput("điểm tin");

		System.out.print("Bạn có phải cú đêm (nhập có hoặc nhập bất kỳ là ko): ");
		String s = sc.nextLine();
		if (s.equals("có") || s.equals("co")) {
			this.cuDem = true;
		} else {
			this.cuDem = false;
		}
	}

	// in thông tin
	public void showStudent() {
		super.outputData();
		System.out.println("Điểm toán: " + diemToan
					+ "\nĐiểm tin: "+ diemTin
					+ "\nĐiểm trung bình: " + totalPoint());
	}

	// tính trung bình
	public float totalPoint() {
		return (this.diemToan + this.diemTin) / 2;
	}

	// kiểm tra thuộc tính cú đêm
	public void soCrazy() {
		if (this.cuDem) {
			System.out.println("Bạn nên ngủ sớm trước 3h AM để bảo vệ sức khoẻ.");
		} else {
			System.out.println("Không phải cú đêm thì không phải IT.");
		}
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemTin() {
		return diemTin;
	}

	public void setDiemTin(float diemTin) {
		this.diemTin = diemTin;
	}

	public boolean isCuDem() {
		return cuDem;
	}

	public void setCuDem(boolean cuDem) {
		this.cuDem = cuDem;
	}
}
