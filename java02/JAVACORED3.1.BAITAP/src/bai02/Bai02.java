package bai02;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Bai02 obj = new Bai02();

		System.out.println("Nhập toạ độ tâm:");
		float x = obj.inVal("hoành độ");
		float y = obj.inVal("tung độ");
		float r = obj.inVal("bán kính");

		System.out.println("Nhập toạ độ điểm bất kì:");
		float x2 = obj.inVal("hoành độ");
		float y2 = obj.inVal("tung độ");

		float d = obj.xuLy(x, y, x2, y2);
		obj.ouput(d, r);

	}

	public float inVal(String s) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		float n = 0;
		boolean checkVal = true;
		do {
			try {
				System.out.print("Nhập " + s + ": ");
				n = Float.parseFloat(sc.nextLine());
				checkVal = false;
			} catch (NumberFormatException ex) {
				System.out.println("cấm nhập bậy.");
				checkVal = true;
			}
		} while (checkVal);
		return n;
	}

	public float xuLy(float x, float y, float x2, float y2) {
		float a = x - x2;
		float b = y - y2;
		return (float) Math.sqrt((a * a) + (b * b));
	}

	public void ouput(float d, float r) {
		if (d > r) {
			System.out.println("Điểm vừa nhập không thuộc đường tròn.");
		} else {
			System.out.println("Điểm vừa nhập thuộc đường tròn.");
		}
	}
}
