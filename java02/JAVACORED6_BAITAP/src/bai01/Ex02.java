package bai01;

import java.util.Random;

public class Ex02 {
	
	public static void main(String[] args) {
		try {
			System.out.println(5 / 0);
		} catch (Exception e) {
			System.out.println("/ 0 ");
		} finally {
			// luôn đc chạy khi xảy ra try catch
			System.out.println(5 / 1);
			System.out.println("Vào finally rồi");
		}

		System.out.println("=-=-=-=-=-");

		Random rd = new Random();
	//	boolean check = true;
		int a = 0, c = 0;
		int b = 0;
	//	 do {
		try {
			a = rd.nextInt(10);
			b = 0;
			c = a / b;
		} catch (Exception ex) {
			System.out.println("huhu jasdojasopdj");
			b = rd.nextInt(10);
		} finally {
			System.out.println("luôn luôn vào đây.");
		}
		System.out.println(b);
		// } while(check);

	}
}
