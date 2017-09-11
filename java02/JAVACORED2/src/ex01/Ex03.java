package ex01;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random rd = new Random();
		for (int i = 0; i < 5; i++) {
			int a = rd.nextInt(10);
			System.out.println("Value: " + a);
		}

		int[] arrA = new int[5];
		for (int i = 0; i < arrA.length; i++) {
			arrA[i] = rd.nextInt(10);
			System.out.println(arrA[i] + "----");
		}
	}
}
