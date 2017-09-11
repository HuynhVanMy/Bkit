package bai09;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Bai09 {
	public static void main(String[] args) {
		
		output();

	}

	public static int inputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean check = true;
		do {
			try {
				n = Integer.parseInt(sc.nextLine());
				check = false;
			} catch (NumberFormatException ex) {
				System.out.println("Không đc chọn bậy !");
				System.out.print("Chọn lại: ");
				check = true;
			}
		} while (check);
		return n;
	}

	public static void output(){
		Random rd = new Random();
		boolean CheckMain = true;
		int Diem = 0, Count = 0;
		int a = 0;
		int b = 0;
		int[] arrA = new int[100];
		int[] arrB = new int[100];
		do {
			int random = rd.nextInt(5);
			arrA[a++] = random;
			// System.out.println(random);
			System.out.println("Đoán đi nào: ");
			int choose = inputData();
			arrB[b++] = choose;
			Count++;
			if (choose == random) {
				System.out.println("Đoán đúng rồi. Giỏi phết.");
				Diem += 2;

			} else {
				System.out.println("Sai rồi nhé cưng.  :v");
			}
			System.out.print("\nChơi tiếp hay nghỉ chơi?" + "\n Chơi tiếp thì chọn 1!"
					+ "\n Nghỉ chơi thì chọn số bất kì!" + "\n Chọn cái nào: ");
			int temp = inputData();
			if (temp == 1) {
				CheckMain = true;
			} else {
				CheckMain = false;
			}
			System.out.println("===================");
		} while (CheckMain);
		int SoLanDung = Diem / 2;
		System.out.println("----------Kết quả----------");
		inKq(arrA, a, arrB, b);
		System.out.println("\nTổng điểm: " + Diem);
		System.out.println("Số lần đoán: " + Count);
		System.out.println("Số lần đúng: " + SoLanDung);

		DecimalFormat df = new DecimalFormat("0.00");

		float DTB = (float) Diem / Count;
		System.out.println("Điểm trung bình " + df.format(DTB));
		System.out.println("=>=>=>=>>GAME O VỜ<<=<=<=<=");

	}
	
	public static void inKq(int[] A, int a, int[] B, int b) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (j == i) {
					System.out.println("===LẦN " + (i+1) + "===");
					System.out.println("AI: " + A[i]);
					System.out.println("Bạn: " + B[j]);
				}
			}
		}
	}

}
