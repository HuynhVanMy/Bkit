package bai07;

import java.util.Random;
import java.util.Scanner;

public class Bai07 {
	public static void main(String[] args) {

		DoanSo();

	}

	public static void DoanSo() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		do {
			Random rd = new Random();
			int number = rd.nextInt(100);

			int n = 0;
			int Count = 0;
			do {
				System.out.print("Nhập số nào: ");
				n = Integer.parseInt(sc.nextLine());
				if (n != number) {
					Count++;
					System.out.println("sai rồi. chọn lại số khác đê.");
					if (n < number) {
						System.out.println("Đoán số lớn lên tí đê.\n");
					} else if (n > number) {
						System.out.println("Số nhỏ lại tí nào.\n");
					}

					if (Count > 3 && Count <= 5) {
						System.out.println("Dở quá nghỉ chơi ^_^");
					} else if (Count > 5 && Count < 8) {
						System.out.println("Sắp game over rồi nhé :v");
					} else if (Count == 10) {
						System.out.println("Nghỉ chơi nhé.");
						System.out.println("------GAME O VỜ------");
						n = number;
					}
				} else {
					System.out.println("Đúng rồi nề. Đoán dở quá đê.\n");
				}
			} while (n != number);
			System.out.print("Chơi tiếp không? co/ko: ");
			String s = sc.nextLine();
			if (s.equals("co")) {
				check = true;
			} else {
				System.out.println("------GAME O VỜ------");
				check = false;
			}
		} while (check);
	}
}
