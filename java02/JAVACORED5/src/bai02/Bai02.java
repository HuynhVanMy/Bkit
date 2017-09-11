package bai02;

import java.util.Random;

public class Bai02 {

	public static void main(String[] args) {
		Bai02 item = new Bai02();

		int[] a = item.inputArray();
		item.output(a);
		System.out.println("\n========");
		item.soSanh(a);
		System.out.println("số lượng số chẵn trong mảng: " + item.count(a));

	}

	// tạo mảng ngẫu nhiên
	public int[] inputArray() {
		Random rd = new Random();
		int[] a = new int[20];
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				int temp = rd.nextInt(20);
				a[i] = temp;
			} else {
				boolean check = true;
				do {
					int temp = rd.nextInt(20);
					if (checkData(a, temp, i)) {
						a[i] = temp;
						check = false;
					} else {
						check = true;
					}
				} while (check);
			}
		}
		return a;
	}

	// kiểm tra phần tử mảng có giống nhau
	public boolean checkData(int[] a, int b, int k) { // mảng a ; b số cần kiểm
														// tra ; k: phần tử đứng
														// trước b
		for (int i = 0; i < k; i++) {
			if (b == a[i]) {
				return false;
			}
		}

		return true;
	}

	// xuất mảng
	public void output(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	// tính tổng các phần tử trong mảng
	public int tinhTong(int[] a, int b, int c) {// b: vị trí bắt đầu
		int tong = 0; // c: vị trí kết thúc
		for (int i = b; i < c; i++) {
			tong += a[i];
		}
		return tong;
	}

	// so sánh tổng
	public void soSanh(int[] a) {
		int tong = tinhTong(a, 0, a.length); // tính tổng toàn mảng
		System.out.println("tổng mảng: " + tong);

		int tong1 = tinhTong(a, 0, 10); // tính tổng 10 phần tử đầu
		System.out.println("tổng đầu: " + tong1);

		int tong2 = tinhTong(a, 10, 20); // tính tổng 10 phần tử sau
		System.out.println("tổng sau: " + tong2);

		if (tong1 > tong2) { // so sánh
			System.out.println("tổng 10 phần tử đầu lớn hơn");
		} else if (tong1 == tong2) {
			System.out.println("Bằng nhau");
		} else {
			System.out.println("tổng 10 phần tử sau lớn hơn");
		}
	}

	// đếm số chẵn
	public int count(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

}
