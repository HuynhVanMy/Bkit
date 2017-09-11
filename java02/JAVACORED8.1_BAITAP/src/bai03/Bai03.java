package bai03;

import java.util.Scanner;

public class Bai03 {

	public static void main(String[] args) {

		Bai03 item = new Bai03();

		int index = item.inputData("vị trí cần tìm số");
		System.out.println("Số ở vị trí cần tìm là: " + item.ketQuaSo(index));
		int k = item.inputData("số cần tìm vị trí");
		System.out.println("Vị trí của số cần tìm là: " + item.ketQuaViTri(k));
	}

	// trả về chỉ số ở vị trí tìm kiếm
	public char ketQuaSo(int index) {
		int i = 1;
		int chiso = 0;
		String s = "";
		do {

			int n = demSo(i);
			chiso += n;
			s += i;
			i++;
		} while (chiso <= index);
		System.out.println(s);
		return s.charAt(index - 1);
	}

	// trả về vị trí của số tìm kiếm
	public int ketQuaViTri(int k) {
		String str = "";
		str += k;
		int i = 1;
		String s = "";
		do {
			s += i;
			i++;

		} while (i <= k);
		return s.lastIndexOf(str) + 1;
	}

	// đếm số tự nhiên có bao nhiêu chữ số
	public int demSo(int i) {
		int count = 0;
		while (i > 0) {
			i = i / 10;
			count++;
		}
		return count;
	}

	// bắt lỗi nhập số
	public int inputData(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				n = Integer.parseInt(sc.nextLine());
				check = false;
			} catch (NumberFormatException e) {
				System.out.println("không đc nhập bậy !!!");
				check = true;
			}
		} while (check);
		return n;
	}

}
