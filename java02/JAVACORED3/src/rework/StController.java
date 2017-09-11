package rework;

import java.util.Random;
import java.util.Scanner;

public class StController {
	// Nhập thông tin
	public ReStudent inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		Random rd = new Random();
		String[] temp = { "A", "B", "C", "D" };
		String id = temp[rd.nextInt(temp.length)] + (rd.nextInt(999) + 100);

		System.out.print("Enter fullName: ");
		String fullName = sc.nextLine();

		System.out.print("Enter dayOfBirth: ");
		int dayOfBirth = Integer.parseInt(sc.nextLine());

		System.out.print("Enter diemTL: ");
		float diemLT = Float.parseFloat(sc.nextLine());

		System.out.print("Enter diemTH: ");
		float diemTH = Float.parseFloat(sc.nextLine());

		float diemTB = tinhTB(diemLT, diemTH);

		ReStudent itemRS = new ReStudent(id, fullName, dayOfBirth, diemLT, diemTH, diemTB);
		/*
		 * can setter each value
		 * */
		return itemRS;
	}

	// tính diểm trung bình
	public float tinhTB(float diemLT, float diemTH) {
		return (diemLT + diemTH) / 2;
	}

	// nhập số lượng
	public int inVal() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean checkN = true;
		do {
			try {
				System.out.print("Enter the number of student: ");
				n = Integer.parseInt(sc.nextLine());
				checkN = false;
				if(n<0){
					System.out.println("Enter a number greater than 0.");
					checkN = true;
				}
			} catch (NumberFormatException ex) {
				System.out.println("Nosense !!!");
				checkN = true;
			}
		} while (checkN);
		return n;
	}

	// mảng nhập nhiều đối tượng
	public ReStudent[] inItem() {
		int n = inVal();
		ReStudent[] arr_item = new ReStudent[n];
		for (int i = 0; i < arr_item.length; i++) {
			System.out.println("Number: " + (i + 1));
			arr_item[i] = inputData();
			System.out.println("---------------");
		}
		return arr_item;
	}
	//in thông tin
	public void ouItem(ReStudent[] arr_item) {
		System.out.println("=================");
		System.out.println("ID" + "\t" + "NAME" + "\t\t" + "AGE" + "\t" + "LT" + "\t" + "TH" + "\t" + "TB");
		for (int i = 0; i < arr_item.length; i++) {
			System.out.println(arr_item[i].toString());
		}

	}
}
